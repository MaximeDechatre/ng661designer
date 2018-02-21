/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/


package interpreteurJNIDLL;

public class InterfaceInterpreteur{
	 
	static {
		try {
			System.loadLibrary("ICUDT52");
			 System.loadLibrary("icuuc52");
			 System.loadLibrary("ICUIN52");
			 
			 System.loadLibrary("libwinpthread-1");
			 System.loadLibrary("freetype6");
			 System.loadLibrary("jpeg62");
			 System.loadLibrary("ShivaVG");
			 System.loadLibrary("zlib1");
			 

			 //Mode Release	
			 System.loadLibrary("QT5CORE"); 
			 System.loadLibrary("QT5GUI");  
			 System.loadLibrary("QT5NETWORK");
			 System.loadLibrary("QT5OPENGL"); 
			 System.loadLibrary("QT5SCRIPT"); 	
			 System.loadLibrary("QT5WIDGETS");	
			 System.loadLibrary("QT5XML"); 		 
			 System.loadLibrary("Qt5XmlPatterns");

			 System.loadLibrary("interpreteurDLL");
		} catch (Exception e) {
			System.out.println("InterfaceInterpreteur:" + e);
		}
		 
	} 	 
	 
	 /**
	  * Permet d'initialiser la scène, à savoir l'arborescence d'objets à partir du fichier XML, le pointeur et le contexte de tracé
	  * @param mainFile
	  * 				chemin (absolu ou relatif) du fichier xml qui sera interprété
	  * @param width
	  *					largeur de la fenêtre
	  * @param height
	  *					hauteur de la fenêtre
	  * @param l
	  * 				handle de la fenêtre dans laquelle va s'afficher l'interpréteur
	  *
	  * @return Si l'interpreteur a bien été créé retourne vrai, retourne faux sinon (XML incorrect)
	  */
	 public native boolean createScene(String mainFile, long l, int width, int height);  
	 
	 
	 /**
	  * NOT IMPLEMENTED
	  * Retourne l'objet sous le pointeur, ce qui peut permettre la recherche dans le xml de l'objet selectionné
	  * @return
	  * 		l'id de l'objet selectionné tel que défini dans la spécification XML
	  */
	 public native String getObjectId();

	 /**
	  * Réinitialise la scène, à savoir réinitialise l'arborescence des objets à partir du fichier XML
	  */
	 public native void reloadScene();
	 

	 /**
	  * Dessine l'image selon le contexte courant de l'arborescence d'objets
	  * @param hwnd
	  * 			Handler de la fenêtre dans laquelle on va dessiner
	  */
	 public native void drawScene(long hwnd);	
	 
	 /**
	  * Permet de redimensionner la fenêtre
	  * @param width
	  * 			Largeur de la fenêtre
	  * @param height
	  * 			hauteur de la fenêtre
	  */
	 public native void setSceneSize(int width, int height);
	 
	 /**
	  * La fenêtre peut avoir deux modes de changement de taille: 
	  * 	-L'objet que contient la fenêtre s'agrandit et rapetisse proportionellement à la taille de la fenêtre 
	  * 	-L'objet ne change pas de taille lorsqu'on change la taille de la fenêtre
	  * @param mode
	  * 			Mode dechangement de taille de la fenêtre
	  */
	 public native void setResizeMode(boolean mode);
	 
	 /**
	  * Permet de zoomer sur la représentation. Uniquement disponible lorsque 
	  * l'objet ne change pas de taille lorsqu'on change la taille de la window
	  * @param factor
	  * 			facteur de grossissement ou de retrecissement
	  */
	 public native void zoom(double factor);

	 /**
	  * Informe qu'un des boutons de la souris est enfoncé
	  * @param button
	  * 		id du bouton enfoncé de la souris
	  */
	 public native void pointerPressedEvent(int button);
	 
	 /**
	  * Informe qu'un des boutons de la souris a été relaché
	  * 
	  * @param button
	  * 		id du bouton relaché de la souris
	  */
	 public native void pointerReleasedEvent(int button);
	 
	 /**
	  * Informe que la souris a été déplacée
	  * @param x
	  * 		Coordonnée courante en x du pointeur de la souris (origine = origine de la fenêtre de l'interpréteur) 
	  * @param y
	  * 		Coordonnée courante en y du pointeur de la souris (origine = origine de la fenêtre de l'interpréteur)
	  */
	 public native void pointerMovedEvent(int x, int y);
	 
	/**
	 * NOT IMPLEMENTED
	 * Informe qu'une touche du clavier est enfoncée
	 * @param key
	 * 			Numéro de la touche sur le clavier
	 */
	 public native void keyboardPressedEvent(int key);	
	 
	 /**
	  * NOT IMPLEMENTED
	  * Informe qu'une touche du clavier a été relachée
	  * @param key
	  * 		Numéro de la touche sur le clavier
	  */
	  public native void keyboardReleasedEvent(int key);	
	  
	  /**
	   * NOT IMPLEMENTED
	   * Informe d'un incrément de la molette
	   * @param incr
	   * 		Incrément de la molette
	   */
	  public native void wheelEvent(int incr);
	 
 
}
