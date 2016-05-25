import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


public class Home {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		Depot  t = new Depot ();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Window win = e.getWindow();
				win.setVisible(false);
				win.dispose();
				System.exit(0);
			}
		});

	}

}

