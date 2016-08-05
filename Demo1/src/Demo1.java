class Math{
	public int div(int i,int j)throws Exception{
	
		int temp=i/j;
		return temp;
	}
}
public class Demo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Math m=new Math();
		System.out.println(m.div(10, 0));
	}

}
