/*
 * @(#)CODESET_INCOMPATIBLE.java	1.2 04/03/15
 *
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package org.omg.CORBA;

/**
 * This exception is raised whenever meaningful communication is not possible
 * between client and server native code sets.
 *
 * @see <A href="../../../../guide/idl/jidlExceptions.html">documentation on
 *      Java&nbsp;IDL exceptions</A>
 * @version 1.0, 03/05/2004
 * @since   J2SE 1.5
 */

public final class CODESET_INCOMPATIBLE extends SystemException {

    /**
     * Constructs an <code>CODESET_INCOMPATIBLE</code> exception with
     * minor code set to 0 and CompletionStatus set to COMPLETED_NO.
     */
    public CODESET_INCOMPATIBLE() {
	this("");
    }

    /**
     * Constructs an <code>CODESET_INCOMPATIBLE</code> exception with the 
     * specified message.
     * 
     * @param detailMessage string containing a detailed message.
     */
    public CODESET_INCOMPATIBLE(String detailMessage) {
        this(detailMessage, 0, CompletionStatus.COMPLETED_NO);
    }

    /**
     * Constructs an <code>CODESET_INCOMPATIBLE</code> exception with the 
     * specified minor code and completion status.
     * 
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
    public CODESET_INCOMPATIBLE(int minorCode, 
                                CompletionStatus completionStatus) {
        this("", minorCode, completionStatus);
    }

    /**
     * Constructs an <code>CODESET_INCOMPATIBLE</code> exception with the 
     * specified message, minor code, and completion status.
     * 
     * @param detailMessage string containing a detailed message.
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
    public CODESET_INCOMPATIBLE(String detailMessage, 
                                int minorCode, 
                                CompletionStatus completionStatus) {
        super(detailMessage, minorCode, completionStatus);
    }
}