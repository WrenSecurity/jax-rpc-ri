/*
 * $Id: SOAPCustomType.java,v 1.1 2006-04-12 20:34:43 kohlert Exp $
 */

/*
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.xml.rpc.processor.model.soap;

import javax.xml.namespace.QName;

import com.sun.xml.rpc.soap.SOAPVersion;

/**
 *
 * @author JAX-RPC Development Team
 */
public class SOAPCustomType extends SOAPType {
    
    public SOAPCustomType() {}
    
    public SOAPCustomType(QName name) {
        this(name, SOAPVersion.SOAP_11);
    }
    
    public SOAPCustomType(QName name, SOAPVersion version) {
        super(name, version);
    }
    
    public void accept(SOAPTypeVisitor visitor) throws Exception {
        visitor.visit(this);
    }
    
}
