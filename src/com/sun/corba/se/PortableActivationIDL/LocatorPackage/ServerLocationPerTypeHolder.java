package com.sun.corba.se.PortableActivationIDL.LocatorPackage;

/**
 * com/sun/corba/se/PortableActivationIDL/LocatorPackage/ServerLocationPerTypeHolder.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u91/7017/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
 * Friday, May 20, 2016 5:44:10 PM PDT
 */

public final class ServerLocationPerTypeHolder implements org.omg.CORBA.portable.Streamable {
    public com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType value = null;

    public ServerLocationPerTypeHolder() {
    }

    public ServerLocationPerTypeHolder(com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType initialValue) {
        value = initialValue;
    }

    public void _read(org.omg.CORBA.portable.InputStream i) {
        value = com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerTypeHelper.read(i);
    }

    public void _write(org.omg.CORBA.portable.OutputStream o) {
        com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerTypeHelper.write(o, value);
    }

    public org.omg.CORBA.TypeCode _type() {
        return com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerTypeHelper.type();
    }

}