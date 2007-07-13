/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 1997-2007 Sun Microsystems, Inc. All rights reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License. You can obtain
 * a copy of the License at https://glassfish.dev.java.net/public/CDDL+GPL.html
 * or glassfish/bootstrap/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.  If applicable, add the following below the License
 * Header, with the fields enclosed by brackets [] replaced by your own
 * identifying information: "Portions Copyrighted [year]
 * [name of copyright owner]"
 * 
 * Contributor(s):
 * 
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
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
