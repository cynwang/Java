import java.math.*;
class MyMath{
	public static double add(double d1,double d2,int len){
		BigDecimal b1=new BigDecimal(d1);
		BigDecimal b2=new BigDecimal(d2);
		return b1.add(b2,BigDecimal.ROUND_HALF_EVEN).doubleValue();
	}
}
public class BigDecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath m=new MyMath();
		System.out.println(m.add(2.779, 3.2344,2));
	}

}
