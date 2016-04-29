
public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		int sum=0;
		for(int j=0;j<10;j++){
			for(int i=0;i<5000000;i++){
				sum+=i;
			}
		}
		long endTime=System.currentTimeMillis();
		System.out.println("所花时间："+(endTime-startTime));
		
	}

}
