package com.sun.corba.se.PortableActivationIDL;

/**
 * com/sun/corba/se/PortableActivationIDL/InvalidORBidHolder.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u91/7017/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
 * Friday, May 20, 2016 5:44:10 PM PDT
 */

public final class InvalidORBidHolder implements org.omg.CORBA.portable.Streamable {
    public com.sun.corba.se.PortableActivationIDL.InvalidORBid value = null;

    public InvalidORBidHolder() {
    }

    public InvalidORBidHolder(com.sun.corba.se.PortableActivationIDL.InvalidORBid initialValue) {
        value = initialValue;
    }

    public void _read(org.omg.CORBA.portable.InputStream i) {
        value = com.sun.corba.se.PortableActivationIDL.InvalidORBidHelper.read(i);
    }

    public void _write(org.omg.CORBA.portable.OutputStream o) {
        com.sun.corba.se.PortableActivationIDL.InvalidORBidHelper.write(o, value);
    }

    public org.omg.CORBA.TypeCode _type() {
        return com.sun.corba.se.PortableActivationIDL.InvalidORBidHelper.type();
    }

}
