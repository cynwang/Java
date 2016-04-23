import java.util.LinkedList;


public class LinkListDemo1 {
	public static void main(String[] args) {
		LinkedList<String> link =new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		System.out.println("初始化链表为："+link);
		link.addFirst("X");
		link.addLast("Y");
		System.out.println("初始化后链表为"+link);
	}
}
