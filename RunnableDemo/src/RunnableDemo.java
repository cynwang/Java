class MyThread implements Runnable{
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+"���У�i="+i);
		}
	}
}
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1=new MyThread("�߳�A");
		MyThread mt2=new MyThread("�߳�B");
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.start();
		t2.start();
	}

}
