import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals (Object obj){
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Person)){
			return false;
		}
		Person p=(Person)obj;
		if(this.name.equals(p.name)&& this.age== p.age){
			return true;
		}else{
			return false;
		}
	}
	public int hasCode(){
		return this.name.hashCode()*this.age;
	}
	public String toString(){
		return "–’√˚£∫"+this.name+"ƒÍ¡‰£∫"+this.age;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Person ,String> map=null;
		map=new HashMap<Person,String>();
		map.put(new Person("wang",20), "wang_1");
		map.put(new Person("wang",20), "wang_2");
		map.put(new Person("xii",21), "xin_2");
		Set<Map.Entry<Person,String>> set=null;
		set=map.entrySet();
		Iterator<Map.Entry<Person,String>> it=null;
		it=set.iterator();
		while(it.hasNext()){
			Map.Entry<Person, String> me =it.next();
			System.out.println(me.getKey()+me.getValue());
		}
	}

}
