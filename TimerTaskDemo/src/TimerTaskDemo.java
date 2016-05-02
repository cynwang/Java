import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTimer extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf.format(new Date()));
	}
	
}
public class TimerTaskDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t=new Timer();
		MyTimer mt=new MyTimer();
		t.schedule(mt, 1000,2000);
	}

}
