class My implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+"运行，i="+i);
		}
	}
			
}
public class GetNameDemo {
	public static void main(String args[]){
//		My mt=new My();
//		Thread t = new Thread(mt,"线程-A");
//
//		t.start();
//		for(int i=0;i<50;i++){
//			if(i>10){
//				try{
//				t.join();
//				}catch(InterruptedException e){}
//			}
//			System.out.println("main运行-----"+i);
//		}
		Thread mt1= new Thread(new My(),"线程-A");
		Thread mt2= new Thread(new My(),"线程-B");
		Thread mt3= new Thread(new My(),"线程-C");
		mt1.setPriority(Thread.MIN_PRIORITY);
		mt2.setPriority(Thread.MAX_PRIORITY);
		mt3.setPriority(Thread.NORM_PRIORITY);
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
