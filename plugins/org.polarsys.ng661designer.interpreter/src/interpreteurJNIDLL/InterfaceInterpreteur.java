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
	  * Permet d'initialiser la sc�ne, � savoir l'arborescence d'objets � partir du fichier XML, le pointeur et le contexte de trac�
	  * @param mainFile
	  * 				chemin (absolu ou relatif) du fichier xml qui sera interpr�t�
	  * @param width
	  *					largeur de la fen�tre
	  * @param height
	  *					hauteur de la fen�tre
	  * @param l
	  * 				handle de la fen�tre dans laquelle va s'afficher l'interpr�teur
	  *
	  * @return Si l'interpreteur a bien �t� cr�� retourne vrai, retourne faux sinon (XML incorrect)
	  */
	 public native boolean createScene(String mainFile, long l, int width, int height);  
	 
	 
	 /**
	  * NOT IMPLEMENTED
	  * Retourne l'objet sous le pointeur, ce qui peut permettre la recherche dans le xml de l'objet selectionn�
	  * @return
	  * 		l'id de l'objet selectionn� tel que d�fini dans la sp�cification XML
	  */
	 public native String getObjectId();

	 /**
	  * R�initialise la sc�ne, � savoir r�initialise l'arborescence des objets � partir du fichier XML
	  */
	 public native void reloadScene();
	 

	 /**
	  * Dessine l'image selon le contexte courant de l'arborescence d'objets
	  * @param hwnd
	  * 			Handler de la fen�tre dans laquelle on va dessiner
	  */
	 public native void drawScene(long hwnd);	
	 
	 /**
	  * Permet de redimensionner la fen�tre
	  * @param width
	  * 			Largeur de la fen�tre
	  * @param height
	  * 			hauteur de la fen�tre
	  */
	 public native void setSceneSize(int width, int height);
	 
	 /**
	  * La fen�tre peut avoir deux modes de changement de taille: 
	  * 	-L'objet que contient la fen�tre s'agrandit et rapetisse proportionellement � la taille de la fen�tre 
	  * 	-L'objet ne change pas de taille lorsqu'on change la taille de la fen�tre
	  * @param mode
	  * 			Mode dechangement de taille de la fen�tre
	  */
	 public native void setResizeMode(boolean mode);
	 
	 /**
	  * Permet de zoomer sur la repr�sentation. Uniquement disponible lorsque 
	  * l'objet ne change pas de taille lorsqu'on change la taille de la window
	  * @param factor
	  * 			facteur de grossissement ou de retrecissement
	  */
	 public native void zoom(double factor);

	 /**
	  * Informe qu'un des boutons de la souris est enfonc�
	  * @param button
	  * 		id du bouton enfonc� de la souris
	  */
	 public native void pointerPressedEvent(int button);
	 
	 /**
	  * Informe qu'un des boutons de la souris a �t� relach�
	  * 
	  * @param button
	  * 		id du bouton relach� de la souris
	  */
	 public native void pointerReleasedEvent(int button);
	 
	 /**
	  * Informe que la souris a �t� d�plac�e
	  * @param x
	  * 		Coordonn�e courante en x du pointeur de la souris (origine = origine de la fen�tre de l'interpr�teur) 
	  * @param y
	  * 		Coordonn�e courante en y du pointeur de la souris (origine = origine de la fen�tre de l'interpr�teur)
	  */
	 public native void pointerMovedEvent(int x, int y);
	 
	/**
	 * NOT IMPLEMENTED
	 * Informe qu'une touche du clavier est enfonc�e
	 * @param key
	 * 			Num�ro de la touche sur le clavier
	 */
	 public native void keyboardPressedEvent(int key);	
	 
	 /**
	  * NOT IMPLEMENTED
	  * Informe qu'une touche du clavier a �t� relach�e
	  * @param key
	  * 		Num�ro de la touche sur le clavier
	  */
	  public native void keyboardReleasedEvent(int key);	
	  
	  /**
	   * NOT IMPLEMENTED
	   * Informe d'un incr�ment de la molette
	   * @param incr
	   * 		Incr�ment de la molette
	   */
	  public native void wheelEvent(int incr);
	 
 
}
