import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class OutputSteamDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		1.ͨ��File���ҵ��ļ�
		File f=new File("e:"+File.separator+"text.txt");
//		2.ͨ������ʵ�����������
		OutputStream out=null;
		out=new FileOutputStream(f,true);
//		3.���ж�����
		String str="\r\nHello World!!!";
		byte b[]=str.getBytes();
		for(int i=0;i<b.length;i++){
			out.write(b[i]);
		}

//		4.�ر������
		out.close();
	}

}
