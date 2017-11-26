package GameInterfaceApp;


/**
* GameInterfaceApp/GameInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameInterface.idl
* 26 ноября 2017 г. 21:55:40 MSK
*/

public abstract class GameInterfacePOA extends org.omg.PortableServer.Servant
 implements GameInterfaceApp.GameInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("turn", new java.lang.Integer (0));
    _methods.put ("concede", new java.lang.Integer (1));
    _methods.put ("getResult", new java.lang.Integer (2));
    _methods.put ("startGame", new java.lang.Integer (3));
    _methods.put ("isGameEnded", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // GameInterfaceApp/GameInterface/turn
       {
         int fieldN = in.read_long ();
         int fieldW = in.read_long ();
         boolean current_player = in.read_boolean ();
         int $result[] = null;
         $result = this.turn (fieldN, fieldW, current_player);
         out = $rh.createReply();
         GameInterfaceApp.GameInterfacePackage.intArrHelper.write (out, $result);
         break;
       }

       case 1:  // GameInterfaceApp/GameInterface/concede
       {
         boolean current_player = in.read_boolean ();
         String $result = null;
         $result = this.concede (current_player);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // GameInterfaceApp/GameInterface/getResult
       {
         String $result = null;
         $result = this.getResult ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // GameInterfaceApp/GameInterface/startGame
       {
         this.startGame ();
         out = $rh.createReply();
         break;
       }

       case 4:  // GameInterfaceApp/GameInterface/isGameEnded
       {
         boolean $result = false;
         $result = this.isGameEnded ();
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:GameInterfaceApp/GameInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public GameInterface _this() 
  {
    return GameInterfaceHelper.narrow(
    super._this_object());
  }

  public GameInterface _this(org.omg.CORBA.ORB orb) 
  {
    return GameInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class GameInterfacePOA
