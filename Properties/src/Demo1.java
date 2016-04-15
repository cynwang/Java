import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pro=new Properties();
		pro.setProperty("BJ", "Beijing");
		pro.setProperty("SH", "shanghai");
		pro.setProperty("TJ", "Tianjin");
		File file=new File("D:"+File.separator+"area.property");
		try {
			pro.store(new FileOutputStream(file), "Area Info");
		} catch (FileNotFoundException e) {
			// TODO: handle exception\
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		
		
		
	}

}
