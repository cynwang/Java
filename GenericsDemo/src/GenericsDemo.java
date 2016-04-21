class Point<T>{
	private T var;
	public void setVar(T var){
		this.var =var;
	}
	public T getVar(){
		return var;
	}
	public String toString(){
		return this.var.toString();
	}
}
public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point<String> p=new Point<String>();
		Point<Integer> p1=new Point<Integer>();
		p.setVar("uefds");
		p1.setVar(30);
		fun(p);
		fun(p1);
	}
	public static void fun(Point<?> temp){
		System.out.println(temp+"£¬");
		
	}
}
