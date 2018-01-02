/*
 * @(#)file      JDMInformCommunity.java
 * @(#)author    Sun Microsystems, Inc.
 * @(#)version   1.5
 * @(#)date      09/10/09
 *
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/* Generated By:JJTree: Do not edit this line. JDMInformCommunity.java */

package com.sun.jmx.snmp.IPAcl;

class JDMInformCommunity extends SimpleNode {
    protected String community= "";
    JDMInformCommunity(int id) {
        super(id);
    }

    JDMInformCommunity(Parser p, int id) {
        super(p, id);
    }

    public static Node jjtCreate(int id) {
        return new JDMInformCommunity(id);
    }

    public static Node jjtCreate(Parser p, int id) {
        return new JDMInformCommunity(p, id);
    }
  
    public String getCommunity() {
        return community;
    }
}