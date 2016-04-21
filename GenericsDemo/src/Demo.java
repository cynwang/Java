class A{
	public <T> T fun(T t){
		return t;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		String str =a.fun("skfj");
		int i=a.fun(10);
		System.out.println(str);
		System.out.println(i);
	}

}
