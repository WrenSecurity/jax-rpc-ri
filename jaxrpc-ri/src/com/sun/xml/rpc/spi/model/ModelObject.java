/*
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.sun.xml.rpc.spi.model;

/**
 * This class is implemented by 
 * com.sun.xml.rpc.processor.model.ModelObject
 */
public interface ModelObject {
    public Object getProperty(String key);
}
