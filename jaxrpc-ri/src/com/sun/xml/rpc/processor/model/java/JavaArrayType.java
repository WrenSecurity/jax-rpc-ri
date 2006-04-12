/*
 * $Id: JavaArrayType.java,v 1.1 2006-04-12 20:34:11 kohlert Exp $
 */

/*
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.xml.rpc.processor.model.java;

/**
 *
 * @author JAX-RPC Development Team
 */
public class JavaArrayType extends JavaType {
    
    public JavaArrayType() {
    }
    
    public JavaArrayType(String name) {
        super(name, true, "null");
    }
    
    public JavaArrayType(String name, String elementName,
        JavaType elementType) {
            
        super(name, true, "null");
        this.elementName = elementName;
        this.elementType = elementType;
    }
    
    public String getElementName() {
        return elementName;
    }
    
    public void setElementName(String name) {
        elementName = name;
    }
    
    public JavaType getElementType() {
        return elementType;
    }
    
    public void setElementType(JavaType type) {
        elementType = type;
    }
    
    // bug fix:4904604
    public String getSOAPArrayHolderName() {
        return soapArrayHolderName;
    }
    
    public void setSOAPArrayHolderName(String holderName) {
        this.soapArrayHolderName = holderName;
    }
    
    private String elementName;
    private JavaType elementType;
    private String soapArrayHolderName;
}
