import java.util.Scanner;


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("输入数据：");
		scan.useDelimiter("\n");
		String str=scan.next();
		System.out.println("输入的数据位："+str);
	}

}
