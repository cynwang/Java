import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputSteam {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		1.ͨ��File���ҵ��ļ�
		File f=new File("e:"+File.separator+"text.txt");
//		2.ͨ������ʵ�����������
		InputStream in=null;
		in=new FileInputStream(f);
//		3.���в���
		String str="\r\nHello World!!!";
		byte b[]=new byte[(int)f.length() ];
		int len=in.read(b);
		
//		4.�ر�������
		in.close();
		System.out.println("���ȣ�"+len);
		System.out.println("���ݣ�"+new String(b));
		
	}

}
