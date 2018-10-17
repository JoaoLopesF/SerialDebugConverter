/*
 * SerialDebugConverter - Utilities
 */

package net.joaolopesf.util;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

public class ShowException {

	public static void show (String message) {
		Exception ex = new RuntimeException(message);
		show (message, ex, false);
	}
	public static void show (String message, boolean fatal) {
		Exception ex = new RuntimeException(message);
		show (message, ex, fatal);
	}
	public static void show (Exception exception) {
		show (null, exception, false);
	}
	public static void show (Exception exception, boolean fatal) {
		show (null, exception, fatal);
	}
	public static void show (String message, Exception exception) {
		show (message, exception, false);
	}
	public static void show (String message, Exception exception, boolean fatal) {

		// Show 
		
		try {
			if (message == null) {
				message = "An exception occurred:\n\n" +
						exception.getClass().toString().replace("class ", "") + ": " + exception.getMessage();
			}
			
			clipboardMessage(message, exception);
			
			message+="\n\n" +
					"Note: The detailed exception was copied to the Clipboard, \n" + 
					"please send via Github issues, so we can evaluate the cause of this.";
			if (fatal)
				message+="\n\nthe application will be closed!";
				
			UtilSwing.alert(null, message, true);

			// Fatal ?
			
			if (fatal) {
				System.exit(1);
			}

		} catch (Exception e) {
			System.out.println("exception:");
			e.printStackTrace();
		}
	}

	public static void causeException (String mensagem) {

		// Cause exception
		
		throw new RuntimeException (mensagem);
	
	}
	
	private static void clipboardMessage (String message, Exception exception)  {
		
		// Copy message to clipboard
		// basead em http://svn.esdi-humboldt.eu/repo/humboldt2/trunk/hale/eu.esdihumboldt.hale/src/eu/esdihumboldt/hale/rcp/StackTracemessagerDialog.java
		
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintWriter pw = new PrintWriter(baos);
			exception.printStackTrace(pw);
			pw.flush();
			String clip = message + 
					"\n\nStacktrace of Java: \n\n" + baos.toString() +
					"\n\n";
			StringSelection selection = new StringSelection(clip);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(selection, null);
		} catch (Exception e) {
			System.out.println("exception:");
			e.printStackTrace();
		}
	    
	}
}
