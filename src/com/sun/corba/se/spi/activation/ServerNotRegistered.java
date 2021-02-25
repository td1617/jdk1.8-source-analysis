package com.sun.corba.se.spi.activation;


/**
 * com/sun/corba/se/spi/activation/ServerNotRegistered.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u91/7017/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
 * Friday, May 20, 2016 5:44:10 PM PDT
 */

public final class ServerNotRegistered extends org.omg.CORBA.UserException {
    public int serverId = (int) 0;

    public ServerNotRegistered() {
        super(ServerNotRegisteredHelper.id());
    } // ctor

    public ServerNotRegistered(int _serverId) {
        super(ServerNotRegisteredHelper.id());
        serverId = _serverId;
    } // ctor


    public ServerNotRegistered(String $reason, int _serverId) {
        super(ServerNotRegisteredHelper.id() + "  " + $reason);
        serverId = _serverId;
    } // ctor

} // class ServerNotRegistered