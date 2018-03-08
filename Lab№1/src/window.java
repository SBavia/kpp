import javax.swing.JFrame;

public class window {
	public static void main(String args []) {
		Ugadat r = new Ugadat("1-я ветка, 16 вариант");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300, 200);
		//r.pack();
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}
}