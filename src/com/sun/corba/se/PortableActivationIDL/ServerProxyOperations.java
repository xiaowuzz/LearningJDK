package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerProxyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Friday, October 9, 2009 1:17:52 AM PDT
*/


/** Server callback interface, passed to Activator in registerServer method.
    */
public interface ServerProxyOperations 
{

  /** Shutdown this server.  Returns after orb.shutdown() completes.
	*/
  void shutdown ();

  /** Install the server.  Returns after the install hook completes
	* execution in the server.
	*/
  void install ();

  /** Uninstall the server.  Returns after the uninstall hook
	* completes execution.
	*/
  void uninstall ();
} // interface ServerProxyOperations