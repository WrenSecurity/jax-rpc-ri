/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2002 International Business Machines Corp. 2002. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://oss.oracle.com/licenses/CDDL+GPL-1.1
 * or LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
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

package com.sun.xml.rpc.processor.modeler.j2ee.xml;

/**
* This class represents the complex type <ejbLocalRefType>
*/
public class ejbLocalRefType extends ComplexType {
    public ejbLocalRefType() {
    }

    public void setDescription(int index, descriptionType description) {
        setElementValue(index, "description", description);
    }

    public descriptionType getDescription(int index) {
        return (descriptionType) getElementValue(
            "description",
            "descriptionType",
            index);
    }

    public int getDescriptionCount() {
        return sizeOfElement("description");
    }

    public boolean removeDescription(int index) {
        return removeElement(index, "description");
    }

    public void setEjbRefName(ejbRefNameType ejbRefName) {
        setElementValue("ejb-ref-name", ejbRefName);
    }

    public ejbRefNameType getEjbRefName() {
        return (ejbRefNameType) getElementValue(
            "ejb-ref-name",
            "ejbRefNameType");
    }

    public boolean removeEjbRefName() {
        return removeElement("ejb-ref-name");
    }

    public void setEjbRefType(ejbRefTypeType ejbRefType) {
        setElementValue("ejb-ref-type", ejbRefType);
    }

    public ejbRefTypeType getEjbRefType() {
        return (ejbRefTypeType) getElementValue(
            "ejb-ref-type",
            "ejbRefTypeType");
    }

    public boolean removeEjbRefType() {
        return removeElement("ejb-ref-type");
    }

    public void setLocalHome(localHomeType localHome) {
        setElementValue("local-home", localHome);
    }

    public localHomeType getLocalHome() {
        return (localHomeType) getElementValue("local-home", "localHomeType");
    }

    public boolean removeLocalHome() {
        return removeElement("local-home");
    }

    public void setLocal(localType local) {
        setElementValue("local", local);
    }

    public localType getLocal() {
        return (localType) getElementValue("local", "localType");
    }

    public boolean removeLocal() {
        return removeElement("local");
    }

    public void setEjbLink(ejbLinkType ejbLink) {
        setElementValue("ejb-link", ejbLink);
    }

    public ejbLinkType getEjbLink() {
        return (ejbLinkType) getElementValue("ejb-link", "ejbLinkType");
    }

    public boolean removeEjbLink() {
        return removeElement("ejb-link");
    }

    public void setDeploymentExtension(
        int index,
        deploymentExtensionType deploymentExtension) {
        setElementValue(index, "deployment-extension", deploymentExtension);
    }

    public deploymentExtensionType getDeploymentExtension(int index) {
        return (deploymentExtensionType) getElementValue(
            "deployment-extension",
            "deploymentExtensionType",
            index);
    }

    public int getDeploymentExtensionCount() {
        return sizeOfElement("deployment-extension");
    }

    public boolean removeDeploymentExtension(int index) {
        return removeElement(index, "deployment-extension");
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
