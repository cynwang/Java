import java.util.LinkedList;


public class LinkListDemo1 {
	public static void main(String[] args) {
		LinkedList<String> link =new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		System.out.println("��ʼ������Ϊ��"+link);
		link.addFirst("X");
		link.addLast("Y");
		System.out.println("��ʼ��������Ϊ"+link);
	}
}
