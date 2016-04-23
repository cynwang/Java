import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("_");
		list.add("world");
		ListIterator<String> iter=list.listIterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		while(iter.hasPrevious()){
			System.out.println(iter.previous());
		}
	}

}
