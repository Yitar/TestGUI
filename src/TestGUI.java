import java.awt.*;
import java.awt.event.*;

public class TestGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TFrame().LaunchFrame();
	}

}

class TFrame extends Frame {
	TextField t1, t2, t3;
	Button btnEquals;
	Label lblPlus;

	public void LaunchFrame() {
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(15);
		btnEquals = new Button("=");
		btnEquals.addActionListener(new Monitor(this));
		lblPlus = new Label("+");
		setLayout(new FlowLayout());
		add(t1);
		add(lblPlus);
		add(t2);
		add(btnEquals);
		add(t3);
		pack();
		setVisible(true);
	}
}

class Monitor implements ActionListener {
	TFrame tf;

	public Monitor(TFrame tf) {
		this.tf = tf;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(tf.t1.getText());
		int n2 = Integer.parseInt(tf.t2.getText());
		tf.t3.setText(" " + (n1 + n2));
	}

}