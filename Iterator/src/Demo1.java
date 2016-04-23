import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("_");
		list.add("world");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()){
			String str=iter.next();
			if("_".equals(str)){
				iter.remove();
			}else{
				System.out.println(str);
			}
		}
		System.out.println(list);
		
	}

}
