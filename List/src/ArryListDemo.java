import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ArryListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String > list=new ArrayList<String>();
//		Collection<String>  collection =new ArrayList<String>();
		list.add("hello");
		list.add("hello1");
		list.add(0,"  world!!");
		System.out.println(list);
//		collection.add("wangxin");
//		collection.add("www,,s,dfsdeg");
//		list.addAll(collection);
//		System.out.println(list);
		list.remove(0);
		list.remove("hello");
		System.out.println(list);
		
	}

}
