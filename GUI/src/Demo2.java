
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




public class Demo2 {
	private Frame f;
	private TextField tf;
	private Button btn;
	int i=0;
	public Demo2(){
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		f=new Frame();
		tf=new TextField(15);
		btn=new Button("Ò»¸ö°´Å¥");
		
		f.setLayout(new FlowLayout());
		f.setBounds(400, 200, 500, 400);
		f.add(tf);
		f.add(btn);
		
		myEvent();
		f.setVisible(true);
	}

	private void myEvent() {
		// TODO Auto-generated method stub
		f.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				tf.setText("mouse enter ..."+i++);
			}
			
		});
			
		
	}

	public static void main(String[] args) {
		new Demo2();
	}

}
