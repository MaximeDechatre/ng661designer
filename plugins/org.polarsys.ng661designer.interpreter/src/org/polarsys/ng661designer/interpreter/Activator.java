/*******************************************************************************
 * Copyright (c) 2015, 2016 THALES and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.ng661designer.interpreter;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.ng661designer.interpreter";

	// The shared instance
	private static Activator plugin;


	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
//		System.loadLibrary("icudt52");
//		System.loadLibrary("icuuc52");
//		System.loadLibrary("icuin52");
//		System.loadLibrary("libwinpthread-1");
//		System.loadLibrary("freetype6");
//		System.loadLibrary("jpeg62");
//		System.loadLibrary("ShivaVG");
//		System.loadLibrary("zlib1");
//		//System.loadLibrary("libgcc_s_dw2-1");
//		//System.loadLibrary("libpng12");
//		//System.loadLibrary("libstdc++-6");
//
//		//Mode debug
//		System.loadLibrary("Qt5Cored");
//		System.loadLibrary("Qt5GUId");
//		System.loadLibrary("Qt5Networkd");
//		System.loadLibrary("Qt5OpenGLd");
//		System.loadLibrary("Qt5Scriptd");
//		System.loadLibrary("Qt5Svgd");
//		System.loadLibrary("Qt5Widgetsd");
//		System.loadLibrary("Qt5Xmld");
//		System.loadLibrary("Qt5XmlPatternsd");
//		
//		System.loadLibrary("interpreteurDLL");

//		// Mode Release
//		System.loadLibrary("Qt5Cored");
//		System.loadLibrary("Qt5GUI");
//		System.loadLibrary("Qt5Network");
//		System.loadLibrary("Qt5OpenGL");
//		System.loadLibrary("Qt5Script");
//		System.loadLibrary("Qt5Widgets");
//		System.loadLibrary("Qt5Xml");
//		System.loadLibrary("Qt5XmlPatternsd");
//		
//		System.loadLibrary("ShivaVG");
//		System.loadLibrary("zlib1");
//		
//		System.loadLibrary("qwindows");
//		System.loadLibrary("qminimal");
//		System.loadLibrary("qoffscreen");
//		
//		System.loadLibrary("interpreteurDLL");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
}
