/*
 * SerialDebugConverter - Utilities
 */

package net.joaolopesf.util;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class UtilSwing {

	private static boolean windowOpen = false; // For event deactivate
	
	public static boolean isWindowOpen() {
		return windowOpen;
	}
	
	public static void centerFrame (Window frame) {
		
		// Centers the frame
	
	    try {
			Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
			int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2) - 15;
			frame.setLocation(x, y);
		} catch (Exception e) {
			// Mostra exception
			ShowException.show(e);
		}
	}
	
	public static void alert (String message) {
		alert (null, message, false, false); 
	}
	public static void alert (String message, boolean aguardarResposta) {
		alert (null, message, false, aguardarResposta); 
	}
	public static void alert (Window window, String message) {
		alert (window, message, false, false);
	}
	public static void alert (Window window, String message, boolean exception) {
		alert (window, message, exception, false);		
	}
	public static void alert (Window window, String message, boolean exception, boolean aguardarResposta) {
		
		if (aguardarResposta == false) {

			if (exception)
				JOptionPane.showMessageDialog(null, message,"Exception",JOptionPane.ERROR_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, message);
			
		} else {
		
			String ok[] = {"OK"};

			windowOpen = true;
			
			int ret = JOptionPane.showOptionDialog(
							window,
							message,
							(exception)?"Exception":"Alert",
							JOptionPane.OK_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,
							ok,
							ok[0]);
			windowOpen = false;

		}
		
	}

	public static void lookAndFell_Metal () {
		
		// Change Look and fell to metal
	
		LookAndFeel laf = new MetalLookAndFeel();
		try {
			UIManager.setLookAndFeel(laf);
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
