class B<T extends Number>{
	private T var;
	public void set(T var){
		this.var=var;
	}
	public T get(){
		return var;
	}
	public String ToString(){
		return this.var.toString();
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B<Integer> i=fun(30);
		System.out.println(i.get());
	}
	public static <T extends Number> B<T> fun(T param){
		B b=new B<T>();
		b.set(param);
		return b;
	}
}
