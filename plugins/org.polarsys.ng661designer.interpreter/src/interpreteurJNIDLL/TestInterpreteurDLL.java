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

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.RepaintManager;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.jogamp.opengl.util.FPSAnimator;

import interpreteurJNIDLL.InterfaceInterpreteur;
import interpreteurJNIDLL.TestInterpreteurDLL;

public class TestInterpreteurDLL extends GLCanvas implements GLEventListener,
		MouseListener, MouseMotionListener, KeyListener {
	private static final long serialVersionUID = 1L;
	private static String TITLE = "Interpreteur";
	private static int mCanvasWidth = 640;
	private static int mCanvasHeight = 480;
	private static int mX = 640;
	private static int mY = 480;
	private static final int FPS = 60;
	private static InterfaceInterpreteur mInterpreteur;
	static TestInterpreteurDLL mCanvas;
	private boolean mMode = true;

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// Create the OpenGL rendering canvas
				mCanvas = new TestInterpreteurDLL();
				
				//désactive le double buffering
				RepaintManager.currentManager(mCanvas).setDoubleBufferingEnabled(true);

				mInterpreteur = new InterfaceInterpreteur();

				final JFrame lFrame = new JFrame();
				
				RepaintManager.currentManager(lFrame).setDoubleBufferingEnabled(true);
					
				lFrame.getContentPane().add(mCanvas);

				lFrame.setVisible(true);
				
				//On indique qu'on a initialisé la fenêtre et on la bloque afin de pouvoir 
				//récupérer le handle et dessiner dedans
				mCanvas.setRealized(true);
				mCanvas.getNativeSurface().lockSurface();
				
				//On récupère le handle du canvas
				long lHandle = mCanvas.getHandle();

				// Ouvre une fenêtre de selection de fichier
				JFileChooser lChooser = new JFileChooser();
				FileNameExtensionFilter lFilter = new FileNameExtensionFilter(
						"A661 part 2 files (*.part2; *.xml)", new String[] { "part2", "xml" });
				lChooser.setFileFilter(lFilter);
				int returnVal = lChooser.showOpenDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					System.out.println("You chose to open this file: "
							+ lChooser.getSelectedFile().getAbsolutePath());
				}
				else{
					System.exit(0);
				}

				//On appelle le constructeur de la dll en donnant en paramètre le fichier xml, le handle de la fenêtre et la taille de la fenêtre
				mInterpreteur
						.createScene(lChooser.getSelectedFile()
								.getAbsolutePath(), lHandle, mCanvasWidth,
								mCanvasHeight);
				
				//On unlock la fenêtre
				mCanvas.getNativeSurface().unlockSurface();

				mCanvas.setPreferredSize(new Dimension(mCanvasWidth,
						mCanvasHeight));
				mCanvas.setAutoSwapBufferMode(false); 
				final FPSAnimator lAnimator = new FPSAnimator(mCanvas, FPS, true);

				//On lance la boucle d'affichage
				lFrame.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						new Thread() {
							@Override
							public void run() {
								if (lAnimator.isStarted()){
									lAnimator.stop();
								}else {
									/* NOTHING TO DO */
								}
								System.exit(0);
							}
						}.start();
					}
				});
				lFrame.setTitle(TITLE);
				lFrame.pack();
				lAnimator.start();
			}

		});

	}

	// private GLU glu;

	public TestInterpreteurDLL() {
		this.addGLEventListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
	}

	@Override
	public void init(GLAutoDrawable pDrawable) {
		/* NOTHING TO DO */
	}

	@Override
	public void dispose(GLAutoDrawable pDrawable) {
		/* NOTHING TO DO */
	}

	@Override
	public void display(GLAutoDrawable pDrawable) {
		mCanvas.getNativeSurface().lockSurface();
		long lHandle = mCanvas.getHandle();
		mInterpreteur.drawScene(lHandle);
		this.getContext().makeCurrent();
		mCanvas.getNativeSurface().unlockSurface();
		mCanvas.repaint();
	}

	@Override
	public void reshape(GLAutoDrawable pDrawable, int pX, int pY, int pWidth,
			int pHeight) {
		mCanvasWidth = pWidth;
		mCanvasHeight = pHeight;
		mX = pX;
		mY = pY;
		mInterpreteur.setSceneSize(pWidth, pHeight);
	}

	@Override
	public void mouseDragged(MouseEvent pE) {
		mInterpreteur.pointerMovedEvent(pE.getX(), pE.getY());

	}

	@Override
	public void mouseMoved(MouseEvent pE) {
		mInterpreteur.pointerMovedEvent(pE.getX(), pE.getY());

	}

	@Override
	public void mouseClicked(MouseEvent pE) {
		/* NOTHING TO DO */
	}

	@Override
	public void mousePressed(MouseEvent pE) {
		if ( (pE.getX() < mX + mCanvasWidth) && (pE.getY() < mY + mCanvasHeight)){ 
			mInterpreteur.pointerPressedEvent(pE.getButton());
		}
		else{
			/* NOTHING TO DO */
		}
	}

	@Override
	public void mouseReleased(MouseEvent pE) {
		mInterpreteur.pointerReleasedEvent(pE.getButton());
	}

	@Override
	public void mouseEntered(MouseEvent pE) {
		/* NOTHING TO DO */
	}

	@Override
	public void mouseExited(MouseEvent pE) {
		/* NOTHING TO DO */
	}

	@Override
	public void keyTyped(KeyEvent pE) {
		/* NOTHING TO DO */
	}

	@Override
	public void keyPressed(KeyEvent pE) {
		// TODO 
		if (pE.getKeyChar() == '+') {
			mInterpreteur.zoom(0.1);
		} else if (pE.getKeyChar() == '-') {
			mInterpreteur.zoom(-0.1);
		} else if (pE.getKeyChar() == '*') {
			mMode = !mMode;
			mInterpreteur.setResizeMode(mMode);
		}else{
			/* NOTHING TO DO */
		}

	}

	@Override
	public void keyReleased(KeyEvent pE) {
		// TODO
	}

}
