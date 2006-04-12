/*
 * $Id: CDATA.java,v 1.1 2006-04-12 20:35:28 kohlert Exp $
 */

/*
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.xml.rpc.util.xml;

/**
 * @author JAX-RPC Development Team
 */
public final class CDATA {

	public CDATA(String text) {
		_text = text;
	}

	public String getText() {
		return _text;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (!(obj instanceof CDATA))
			return false;

		CDATA cdata = (CDATA) obj;

		return this._text.equals(cdata._text);
	}

	public int hashCode() {
		return _text.hashCode();
	}

	private String _text;
}
