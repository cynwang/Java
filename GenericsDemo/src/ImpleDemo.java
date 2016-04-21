interface Info<T>{
	public T getVar();
}
class InfoTemp<T> implements Info<T>{
	private T var;
	public InfoTemp(T var){
		this.set(var);
	}
	public void set(T var){
		this.var =var;
	}
	public T getVar(){
		return this.var;
	}
}
public class ImpleDemo {
	public static void main(String args[]){
		Info<String> i=null;
		i=new InfoTemp<String>("sifh");
		System.out.println("ÄÚÈÝ£º"+i.getVar());
	}

}
