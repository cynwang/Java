import java.io.*;




public class Writer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		1.通过File类找到文件
		File f=new File("e:"+File.separator+"text.txt");
//		2.通过子类实例化父类对象
		OutputStreamWriter out=null;
		out=new FileWriter(f);
//		3.进行读操作
		String str="\r\nHello World!!!";
		out.write(str);
		

//		4.关闭输出流
		out.flush();
	}

}
