import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputSteam {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		1.通过File类找到文件
		File f=new File("e:"+File.separator+"text.txt");
//		2.通过子类实例化父类对象
		InputStream in=null;
		in=new FileInputStream(f);
//		3.进行操作
		String str="\r\nHello World!!!";
		byte b[]=new byte[(int)f.length() ];
		int len=in.read(b);
		
//		4.关闭输入流
		in.close();
		System.out.println("长度："+len);
		System.out.println("内容："+new String(b));
		
	}

}
