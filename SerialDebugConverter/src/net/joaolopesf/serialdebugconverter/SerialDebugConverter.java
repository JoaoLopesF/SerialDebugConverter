/*
 * SerialDebugConverter - Converter for SerialDebug library
 * Autor: Joao Lopes
 * Data criacao: 15/10/18
 * Versoes:
 * ---------------------------------
 * 0.9.0   	Versao inicial - 15/09/18
 */

package net.joaolopesf.serialdebugconverter;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import com.sun.deploy.uitoolkit.impl.fx.Utils;

import net.joaolopesf.util.UtilSwing;
import net.joaolopesf.util.Utilities;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class SerialDebugConverter {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					UtilSwing.lookAndFell_Metal();

					SerialDebugConverter window = new SerialDebugConverter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SerialDebugConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Panel of convertion

		ConvertPanel panel = new ConvertPanel();

		// Frame

		frame = new JFrame();
		frame.setBounds(0, 0, panel.width, panel.height + 45);
		frame.setTitle(panel.tittle);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		JLabel lblImgSerialDebug = new JLabel("");
		lblImgSerialDebug.setIcon(new ImageIcon(
				SerialDebugConverter.class.getResource("/net/joaolopesf/serialdebugconverter/images/serialdebug.png")));
		lblImgSerialDebug.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Utilities.openWebPage("https://github.com/JoaoLopesF/SerialDebug");
			}
		});
		lblImgSerialDebug.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(lblImgSerialDebug, BorderLayout.NORTH);

		// Center it

		UtilSwing.centerFrame(frame);

	}

}
