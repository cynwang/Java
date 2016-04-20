import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="helliworld";
		ByteArrayInputStream bis=null;
		ByteArrayOutputStream bos=null;
		bis=new ByteArrayInputStream(str.getBytes());
		bos=new ByteArrayOutputStream();
		int temp=0;
		while((temp=bis.read())!=-1){
			char c=(char)temp;
			bos.write(Character.toLowerCase(c));
		}
		String newStr=bos.toString();
		try {
			bis.close();
			bos.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(newStr);
	}

}
