package com.sun.corba.se.PortableActivationIDL;


/**
 * com/sun/corba/se/PortableActivationIDL/ORBPortInfo.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u91/7017/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
 * Friday, May 20, 2016 5:44:10 PM PDT
 */

public final class ORBPortInfo implements org.omg.CORBA.portable.IDLEntity {
    public String orbId = null;
    public int port = (int) 0;

    public ORBPortInfo() {
    } // ctor

    public ORBPortInfo(String _orbId, int _port) {
        orbId = _orbId;
        port = _port;
    } // ctor

} // class ORBPortInfo