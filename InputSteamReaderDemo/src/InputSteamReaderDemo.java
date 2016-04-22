import java.io.*;



public class InputSteamReaderDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File f=new File("e:"+File.separator+"text.txt");
		Reader reader=null;
		reader=new InputStreamReader(new FileInputStream(f));
		char c[]=new char[1024];
		int len=reader.read(c);
		reader.close();
		System.out.println(new String(c,0,len));
	}

}
