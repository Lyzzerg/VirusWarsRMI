package PrintingInterfaceApp;


/**
* PrintingInterfaceApp/_PrintingInterfaceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PrintingInterface.idl
* 26 ноября 2017 г. 19:05:24 MSK
*/

public class _PrintingInterfaceStub extends org.omg.CORBA.portable.ObjectImpl implements PrintingInterfaceApp.PrintingInterface
{

  public void printGamingField (int[] status)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("printGamingField", true);
                PrintingInterfaceApp.PrintingInterfacePackage.intArrHelper.write ($out, status);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                printGamingField (status        );
            } finally {
                _releaseReply ($in);
            }
  } // printGamingField

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PrintingInterfaceApp/PrintingInterface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _PrintingInterfaceStub
