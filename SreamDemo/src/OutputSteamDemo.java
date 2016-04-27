import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class OutputSteamDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		1.通过File类找到文件
		File f=new File("e:"+File.separator+"text.txt");
//		2.通过子类实例化父类对象
		OutputStream out=null;
		out=new FileOutputStream(f,true);
//		3.进行读操作
		String str="\r\nHello World!!!";
		byte b[]=str.getBytes();
		for(int i=0;i<b.length;i++){
			out.write(b[i]);
		}

//		4.关闭输出流
		out.close();
	}

}
