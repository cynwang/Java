import java.util.ArrayList;
import java.util.List;


public class ArratListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String > list=new ArrayList<String>();
		list.add("hello");
		list.add("hello1");
		list.add("world!!");
		list.add("wangxin");
		list.add("wjsjdfk!!");
		
		System.out.println("有前向后输出：");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+",");
		}
		System.out.println("\n有后向前输出：");
		for(int i=list.size()-1;i>=0;i--){
			System.out.print(list.get(i)+",");
		}
	}

}
