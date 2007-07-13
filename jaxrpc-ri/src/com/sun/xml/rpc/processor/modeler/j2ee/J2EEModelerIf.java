/*
 * $Id: J2EEModelerIf.java,v 1.3 2007-07-13 23:36:08 ofung Exp $
*/

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
package com.sun.xml.rpc.processor.modeler.j2ee;

import javax.xml.namespace.QName;

import com.sun.xml.rpc.processor.model.Operation;
import com.sun.xml.rpc.processor.model.literal.LiteralType;
import com.sun.xml.rpc.wsdl.document.Message;
import com.sun.xml.rpc.wsdl.document.soap.SOAPBody;
import com.sun.xml.rpc.processor.modeler.JavaSimpleTypeCreator;
import com.sun.xml.rpc.processor.modeler.wsdl.WSDLModelerBase.ProcessSOAPOperationInfo;


public interface J2EEModelerIf {
    public LiteralType getElementTypeToLiteralType(QName elementType);
    public boolean useSuperExplicitServiceContextForDocLit(Message inputMessage);
    public boolean useSuperExplicitServiceContextForRpcLit(Message inputMessage);
    public boolean useSuperExplicitServiceContextForRpcEncoded(Message inputMessage);
    public boolean isSuperUnwrappable();
    public LiteralType getSuperElementTypeToLiteralType(QName elementType);
    public String getSuperJavaNameForOperation(Operation operation);
    public ProcessSOAPOperationInfo getInfo();
    public Message getSuperOutputMessage();
    public Message getSuperInputMessage();
    public SOAPBody getSuperSOAPRequestBody();
    public SOAPBody getSuperSOAPResponseBody();
    public JavaSimpleTypeCreator getJavaTypes();
}
