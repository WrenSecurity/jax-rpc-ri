/*
 * $Id: J2EEToolPlugin.java,v 1.1 2006-04-12 20:33:17 kohlert Exp $
 */

/*
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.xml.rpc.tools.wscompile;

import java.io.File;
import java.net.URL;

import javax.xml.namespace.QName;

import com.sun.xml.rpc.processor.Processor;
import com.sun.xml.rpc.processor.generator.JaxRpcMappingGenerator;
import com.sun.xml.rpc.processor.util.ProcessorEnvironment;
import com.sun.xml.rpc.processor.config.J2EEModelInfo;
import com.sun.xml.rpc.processor.config.parser.J2EEModelInfoParser;
import com.sun.xml.rpc.processor.config.parser.Constants;
import com.sun.xml.rpc.processor.config.parser.ModelInfoPlugin;
import com.sun.xml.rpc.processor.config.parser.ModelInfoParser;
import com.sun.xml.rpc.processor.modeler.j2ee.JaxRpcMappingXml;
import com.sun.xml.rpc.spi.tools.ModelInfo;
import com.sun.xml.rpc.tools.plugin.ToolPlugin;
import com.sun.xml.rpc.util.localization.Localizable;
import com.sun.xml.rpc.util.localization.LocalizableMessageFactory;
import com.sun.xml.rpc.util.localization.Localizer;

/**
 *
 * @author JAX-RPC Development Team
 */
public class J2EEToolPlugin extends ToolPlugin
    implements UsageIf, ModelInfoPlugin, ProcessorActionsIf {
    
    private LocalizableMessageFactory messageFactory;
    protected Localizer localizer = new Localizer();
    protected File mappingFile = null;
    
    public J2EEToolPlugin() {
        messageFactory = new LocalizableMessageFactory(
            "com.sun.xml.rpc.resources.j2ee");
    }
    
    /* (non-Javadoc)
     * @see com.sun.xml.rpc.processor.config.parser.ModelInfoPlugin#getModelInfoName()
     */
    public QName getModelInfoName() {
        return Constants.QNAME_J2EE_MAPPING_FILE;
    }
    
    /* (non-Javadoc)
     * @see com.sun.xml.rpc.processor.config.parser.ModelInfoPlugin#createModelInfoParser(com.sun.xml.rpc.processor.util.ProcessorEnvironment)
     */
    public ModelInfoParser createModelInfoParser(ProcessorEnvironment env) {
        return new J2EEModelInfoParser(env);
    }
    
    /* (non-Javadoc)
     * @see com.sun.xml.rpc.processor.config.parser.ModelInfoPlugin#createModelInfo(java.net.URL)
     */
    public ModelInfo createModelInfo(URL mappingFile) throws Exception {
        JaxRpcMappingXml mapping =
            new JaxRpcMappingXml(mappingFile.toExternalForm());
        J2EEModelInfo modelInfo = new J2EEModelInfo(mapping);
        return modelInfo;
    }
    
    /* (non-Javadoc)
     * @see com.sun.xml.rpc.processor.config.parser.ModelInfoPlugin#createModelInfo()
     */
    public ModelInfo createModelInfo() {
        return new J2EEModelInfo();
    }
    
    
    public Localizable getOptionsUsage() {
        return messageFactory.getMessage("j2ee.usage.options", (Object[]) null);
    }
    
    public Localizable getFeaturesUsage() {
        return null;
    }
    
    public Localizable getInternalUsage() {
        return null;
    }
    
    public Localizable getExamplesUsage() {
        return null;
    }
    
    public boolean parseArguments(String[] args, UsageError err) {
        mappingFile = null;
        
		for (int i = 0; i < args.length; i++) {
			if (args[i] != null && args[i].equals("-mapping")) {
				if ((i + 1) < args.length) {
					if (mappingFile != null) {
						err.msg =
							messageFactory.getMessage(
								"j2ee.duplicateOption",
								new Object[] { "-mapping" });
						return false;
					}
					args[i] = null;
					mappingFile = new File(args[++i]);
					args[i] = null;
				} else {
					err.msg =
						messageFactory.getMessage(
							"j2ee.missingOptionArgument",
							new Object[] { "-mapping" });
					return false;
				}
			}
		}
        
        return true;
    }
    
    public void registerActions(Processor processor) {
        if (mappingFile != null) {
            processor.add(new JaxRpcMappingGenerator(mappingFile));
        }
    }
    
}
