/*
 * SerialDebugConverter - Utilities
 */

package net.joaolopesf.util;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.net.URL;

public class Utilities {

	// Send text to clipboard

	public static void clipboard(String text) {

		try {
			StringSelection selection = new StringSelection(text);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(selection, null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Open web page

	public static void openWebPage(String url) {
		try {
			if (url.startsWith("http://") == false && url.startsWith("https://") == false)
				url = "http://" + url;
			Desktop.getDesktop().browse(new URL(url).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// System Operational

	public static boolean isMacOS() {

		// Mac OS ?

		String osName = System.getProperty("os.name").toLowerCase();
		//System.out.println("OS -> " + osName);
		return osName.contains("mac");
	}

	public static boolean isWindows() {

		// MS Windows ?

		String osName = System.getProperty("os.name").toLowerCase();
		return osName.contains("win");
	}
	
	public static boolean isUnix() {
		
		// Unix, Linux, etc
		
		String osName = System.getProperty("os.name").toLowerCase();
		return osName.contains("nux");
	}
	
	// Fonte names, depending S.O.
	
	public static String getFontName () {
		
		
		if (isMacOS()) {
			return ("Lucida Grande");
		} if (isWindows()) {
			return ("Lucida Sans Unicode");
		} else {
			return ("DejaVu Sans Book");
		}
	}
	public static String getFontNameConsole () {
		
		if (isMacOS()) {
			return ("Monaco");
		} if (isWindows()) {
			return ("Lucida Console");
		} else {
			return ("Courier New");
		}
	}
	
}

