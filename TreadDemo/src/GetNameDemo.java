class My implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+"���У�i="+i);
		}
	}
			
}
public class GetNameDemo {
	public static void main(String args[]){
//		My mt=new My();
//		Thread t = new Thread(mt,"�߳�-A");
//
//		t.start();
//		for(int i=0;i<50;i++){
//			if(i>10){
//				try{
//				t.join();
//				}catch(InterruptedException e){}
//			}
//			System.out.println("main����-----"+i);
//		}
		Thread mt1= new Thread(new My(),"�߳�-A");
		Thread mt2= new Thread(new My(),"�߳�-B");
		Thread mt3= new Thread(new My(),"�߳�-C");
		mt1.setPriority(Thread.MIN_PRIORITY);
		mt2.setPriority(Thread.MAX_PRIORITY);
		mt3.setPriority(Thread.NORM_PRIORITY);
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
