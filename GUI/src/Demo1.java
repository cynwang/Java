import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame();
		Button btn =new Button("第一个按钮");

		f.setSize(800,600);
		f.setLocation(100, 100);
		f.setLayout(new FlowLayout());
		f.add(btn);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button run....");
			}
		});
			
	}
	
}
