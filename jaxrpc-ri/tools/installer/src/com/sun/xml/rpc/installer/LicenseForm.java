/*
 * Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/*
 * LicenseForm.java
 *
 * Created on 2003/11/06, 21:17
 */
package com.sun.xml.rpc.installer;

import java.awt.Adjustable;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 * License screen.
 * 
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public abstract class LicenseForm extends JFrame {
    
    public LicenseForm( Reader text ) throws IOException {
        final JScrollPane scrollPane = new JScrollPane();
        JTextArea licenseTextArea = new JTextArea();
        JPanel buttonPanel = new JPanel();
        final JButton acceptButton = new JButton();
        final JButton cancelButton = new JButton();
        
        setTitle("License Agreement");
        
        {// load the license text
            BufferedReader reader = new BufferedReader(text);
            String line;
            StringBuffer buf = new StringBuffer();
            while((line=reader.readLine())!=null) {
                buf.append(line);
                buf.append('\n');
            }
            licenseTextArea.setText(buf.toString());
            licenseTextArea.setLineWrap(true);
        }
        
        
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                exitForm();
            }
        });

        getContentPane().add(scrollPane);
        scrollPane.setViewportView(licenseTextArea);
        
        licenseTextArea.setEditable(false);
        
        getContentPane().add(buttonPanel);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        buttonPanel.add(acceptButton);
        acceptButton.setText("Accept");
        acceptButton.setEnabled(false);

        buttonPanel.add(cancelButton);
        cancelButton.setText("Decline");
        
        acceptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                install();
                exitForm();
             }
        });
        
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitForm();
            }
        });
        
        pack();
        
        // don't enable the yes button until the scroll bar has been dragged
        // to the bottom or the window was enlarged enough to make the scroll
        // bar disappear
        JScrollBar scrollBar = scrollPane.getVerticalScrollBar();
        scrollBar.addAdjustmentListener( new AdjustmentListener() {
            Adjustable a;
            public void adjustmentValueChanged(AdjustmentEvent e) {
                a = e.getAdjustable();
                if( a.getValue() + a.getVisibleAmount() >= a.getMaximum() ) 
                    acceptButton.setEnabled(true);
            }
        });
        
        java.awt.Dimension screenSize = 
            java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(550, 450));
        setLocation((screenSize.width-550)/2,(screenSize.height-450)/2);
    }
    
    /**
     * Does the actual installation.
     */
    protected abstract void install();
    
    /** Exit the Application */
    private void exitForm() {
        System.exit(0);
    }
}
