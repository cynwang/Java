class Point{
	private Object x;
	private Object y;
	public void setX(Object x){
		this.x=x;
	}
	public void setY(Object y){
		this.y=y;
	}
	public Object getX(){
		return this.x;
	}
	public Object getY(){
		return this.y;
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point();
		p.setX(10);   //理由自动装箱操作   int--->Integer---->Object
		p.setY(20);   //理由自动装箱操作   int--->Integer---->Object
		int X=(Integer)p.getX();
		int Y=(Integer)p.getY();
		System.out.println("整数表示，x的坐标："+X);
		System.out.println("整数表示，y的坐标："+Y);
	}

}
