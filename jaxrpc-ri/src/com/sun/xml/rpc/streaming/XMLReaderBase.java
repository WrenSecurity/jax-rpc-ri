/*
 * $Id: XMLReaderBase.java,v 1.1 2006-04-12 20:32:47 kohlert Exp $
 */

/*
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.xml.rpc.streaming;

/**
 * <p> A base class for XMLReader implementations. </p>
 *
 * <p> It provides the implementation of some derived XMLReader methods. </p>
 *
 * @author JAX-RPC Development Team
 */
public abstract class XMLReaderBase implements XMLReader {

    public int nextContent() {
        for (;;) {
            int state = next();
            switch (state) {
                case START :
                case END :
                case EOF :
                    return state;
                case CHARS :
                    if (getValue().trim().length() != 0) {
                        return CHARS;
                    }
                    continue;
                case PI :
                    continue;
            }
        }
    }

    public int nextElementContent() {
        int state = nextContent();
        if (state == CHARS) {
            throw new XMLReaderException(
                "xmlreader.unexpectedCharacterContent",
                getValue());
        }
        return state;
    }

    public void skipElement() {
        skipElement(getElementId());
    }
    public abstract void skipElement(int elementId);
}
