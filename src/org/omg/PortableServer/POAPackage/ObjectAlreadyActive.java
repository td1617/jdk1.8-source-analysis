package org.omg.PortableServer.POAPackage;


/**
 * org/omg/PortableServer/POAPackage/ObjectAlreadyActive.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u91/7017/corba/src/share/classes/org/omg/PortableServer/poa.idl
 * Friday, May 20, 2016 5:44:10 PM PDT
 */

public final class ObjectAlreadyActive extends org.omg.CORBA.UserException {

    public ObjectAlreadyActive() {
        super(ObjectAlreadyActiveHelper.id());
    } // ctor


    public ObjectAlreadyActive(String $reason) {
        super(ObjectAlreadyActiveHelper.id() + "  " + $reason);
    } // ctor

} // class ObjectAlreadyActive
