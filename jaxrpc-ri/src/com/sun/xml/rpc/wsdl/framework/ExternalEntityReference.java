/*
 * $Id: ExternalEntityReference.java,v 1.1 2006-04-12 20:32:59 kohlert Exp $
 */

/*
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.xml.rpc.wsdl.framework;

import javax.xml.namespace.QName;

/**
 * A reference to a globally known entity in a document.
 *
 * @author JAX-RPC Development Team
 */
public class ExternalEntityReference {

    public ExternalEntityReference(
        AbstractDocument document,
        Kind kind,
        QName name) {
        _document = document;
        _kind = kind;
        _name = name;
    }

    public AbstractDocument getDocument() {
        return _document;
    }

    public Kind getKind() {
        return _kind;
    }

    public QName getName() {
        return _name;
    }

    public GloballyKnown resolve() {
        return _document.find(_kind, _name);
    }

    private AbstractDocument _document;
    private Kind _kind;
    private QName _name;
}
