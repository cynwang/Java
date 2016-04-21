
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i[]=fun1(3,4,7,2,8);
		fun2(i);
	}
	public static <T> T[] fun1(T...arg){
		return arg;
	}
	public static <T> void fun2(T param[]){
		System.out.println("接收泛型数组：");
		for(T t:param){
			System.out.println(t+",");
		}
	}
}
