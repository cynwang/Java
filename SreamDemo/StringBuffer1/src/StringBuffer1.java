
public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf=new StringBuffer();
//		sb.append("hello ").append("world!!");
//		System.out.println(sb);
		
//		buf.append("sf");
//		System.out.println(buf);
//		fun(buf);
//		System.out.println(buf);
		
		buf.append("hello world");
//		buf.insert(0,"world");
//		System.out.println(buf);
//		buf.insert(buf.length(),"wangxin");
//		System.out.println(buf);
		
//		String str=buf.reverse().toString();
//		System.out.println(str);
		
//		buf.replace(2, 5, "wangxin");
//		System.out.println(buf);
		
//		String str=buf.substring(2,7);
//		System.out.println(str);
		
		String str =buf.delete(2, 4).toString();
		System.out.println(str);
	}
//	public static void fun(StringBuffer s){
//		s.append("wang");
//	}

}
