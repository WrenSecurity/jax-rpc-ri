/*
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

// @(#) 1.1 jsr109ri/src/java/com/ibm/webservices/ri/xml/jaxrpcmap1_1/variableMappingType.java, jsr109ri, jsr10911, b0240.03 9/30/02 11:34:44 [10/7/02 11:55:23]
/*************************************************************************
   Licensed Materials - Property of IBM
   5639-D57, 5630-A36, 5630-A37, 5724-D18 (C) COPYRIGHT International Business M
achines Corp. 2002
   All Rights Reserved
   US Government Users Restricted Rights - Use, duplication, or
   disclosure restricted by GSA ADP Schedule Contract  with
   IBM Corp.
**************************************************************************/
package com.sun.xml.rpc.processor.modeler.j2ee.xml;

/**
* This class represents the complex type <variableMappingType>
*/
public class variableMappingType extends ComplexType {
    public variableMappingType() {
    }

    public void setJavaVariableName(string javaVariableName) {
        setElementValue("java-variable-name", javaVariableName);
    }

    public string getJavaVariableName() {
        return (string) getElementValue("java-variable-name", "string");
    }

    public boolean removeJavaVariableName() {
        return removeElement("java-variable-name");
    }

    public void setDataMember(emptyType dataMember) {
        setElementValue("data-member", dataMember);
    }

    public emptyType getDataMember() {
        return (emptyType) getElementValue("data-member", "emptyType");
    }

    public boolean removeDataMember() {
        return removeElement("data-member");
    }

    public void setXmlWildcard(emptyType xmlWildcard) {
        setElementValue("xml-wildcard", xmlWildcard);
    }

    public emptyType getXmlWildcard() {
        return (emptyType) getElementValue("xml-wildcard", "emptyType");
    }

    public boolean removeXmlWildcard() {
        return removeElement("xml-wildcard");
    }

    public void setXmlElementName(string xmlElementName) {
        setElementValue("xml-element-name", xmlElementName);
    }

    public string getXmlElementName() {
        return (string) getElementValue("xml-element-name", "string");
    }

    public boolean removeXmlElementName() {
        return removeElement("xml-element-name");
    }

    public void setXmlAttributeName(string xmlAttributeName) {
        setElementValue("xml-attribute-name", xmlAttributeName);
    }

    public string getXmlAttributeName() {
        return (string) getElementValue("xml-attribute-name", "string");
    }

    public boolean removeXmlAttributeName() {
        return removeElement("xml-attribute-name");
    }

    public void setId(String id) {
        setAttributeValue("id", id);
    }

    public String getId() {
        return getAttributeValue("id");
    }

    public boolean removeId() {
        return removeAttribute("id");
    }

}
