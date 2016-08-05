import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("e:" + File.separator );
		// try {
		// f.createNewFile();
		//
		// } catch (IOException e) {
		// // TODO: handle exception
		// e.printStackTrace();
		// }
//		String str[] =f.list();
//		for(int i=0;i<str.length;i++){
//			System.out.println(str[i]);
//		}
//		File files[]=f.listFiles();
//		for(int i=0;i<files.length;i++){
//			System.out.println(files[i]);
//		}
		if(f.isDirectory()){
			System.out.println(f.getPath()+"是根目录");
		}else{
			System.out.println(f.getPath()+"不是根目录");
			
		}
	}

}
