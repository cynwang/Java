import java.io.File;
import java.io.RandomAccessFile;


public class RandomAccessDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File f=new File("d:"+File.separator+"text.txt");
		RandomAccessFile raf=new RandomAccessFile(f,"rw");
		String name=null;
		int age=0;
		name="wangwu  ";
		age=30;
		raf.writeBytes(name);
		raf.writeInt(age);
		name="lisi    ";
		age=32;
		raf.writeBytes(name);
		raf.writeInt(age);
		name="zhangsan";
		age=33;
		raf.writeBytes(name);
		raf.writeInt(age);
		raf.close();
	}

}
