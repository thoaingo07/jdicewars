package app;

import java.util.logging.Level;
import java.util.logging.Logger;

import gui.frame.MainFrame;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import util.MessageBundle;

public class MainApplication {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
				} catch (Exception e) {
					// TODO
				}
				
				MessageBundle.initLocale("en");
				Logger.getLogger("").setLevel(Level.ALL);
				
				// JFrame.setDefaultLookAndFeelDecorated(true);
				JFrame mainFraime = new MainFrame();
				mainFraime.setVisible(true);
			}
		});
	}
}
