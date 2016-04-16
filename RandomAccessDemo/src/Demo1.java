import java.io.File;
import java.io.RandomAccessFile;


public class Demo1 {
	public static void main(String[] args) throws Exception {
		File f=new File("d:"+File.separator+"text.txt");
		RandomAccessFile raf=new RandomAccessFile(f,"r");
		String name=null;
		int age=0;
		byte b[]=new byte[8];
		for(int i=0;i<b.length;i++){
			b[i]=raf.readByte();
		}
		name=new String(b);
		age=raf.readInt();
		System.out.println("姓名"+name+"年龄"+age);
		raf.skipBytes(12);
		for(int i=0;i<b.length;i++){
			b[i]=raf.readByte();
		}
		name=new String(b);
		age=raf.readInt();
		System.out.println("姓名"+name+"年龄"+age);
		raf.seek(12);
		for(int i=0;i<b.length;i++){
			b[i]=raf.readByte();
		}
		name=new String(b);
		age=raf.readInt();
		System.out.println("姓名"+name+"年龄"+age);
		raf.close();
	}
}
