import java.io.*;




public class Writer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		1.ͨ��File���ҵ��ļ�
		File f=new File("e:"+File.separator+"text.txt");
//		2.ͨ������ʵ�����������
		OutputStreamWriter out=null;
		out=new FileWriter(f);
//		3.���ж�����
		String str="\r\nHello World!!!";
		out.write(str);
		

//		4.�ر������
		out.flush();
	}

}
