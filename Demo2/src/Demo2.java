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
		p.setX(10);   //�����Զ�װ�����   int--->Integer---->Object
		p.setY(20);   //�����Զ�װ�����   int--->Integer---->Object
		int X=(Integer)p.getX();
		int Y=(Integer)p.getY();
		System.out.println("������ʾ��x�����꣺"+X);
		System.out.println("������ʾ��y�����꣺"+Y);
	}

}
