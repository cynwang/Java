import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;


public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pro=new Properties();
		File file=new File("D:"+File.separator+"area.xml");
		try {
			pro.loadFromXML(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			// TODO: handle exception\
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		System.out.println(pro.getProperty("SH"));
	}

}
