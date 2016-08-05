interface Info{
	
}
class Contact implements Info{
	private String address;
	private String telephone;
	private String zipcode;
	public Contact(String address,String telephone,String zipcode){
		this.setAddress(address);
		this.setTelephone(telephone);
		this.setZipcode(zipcode);
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setTelephone(String telephone){
		this.telephone=telephone;
	}
	public void setZipcode(String zipcode){
		this.zipcode=zipcode;
	}
	public String getAddress(){
		return this.address;
	}
	public String getTelephone(){
		return this.telephone;
	}
	public String getZipcode(){
		return this.zipcode;
	}
	public String toString(){
		return "联系方式："+"\n"+ 
				"\t联系地址"+this.address+
				"\t联系电话"+this.telephone+
				"\t邮政编码"+this.zipcode;
	}
}

class Introduction implements Info {
	private  String name;
	private String sex;
	int age;
	public Introduction(String naem,String sex, int age){
		this.setName(naem);
		this.setSex(sex);
		this.setAge(age);
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public void setAge(int age){
		this.age =age;
	}
	public String getName(){
		return this.name;
	}
	public String getSex(){
		return this.sex;
	}
	public int getAge(){
		return this.age;
	}
	public String toString(){
		return "基本信息："+"\n"+ 
				"\t姓名"+this.name+
				"\t性别"+this.sex+
				"\t年龄"+this.age;
	}
}

class Person<T extends Info>{
	private T info;
	public Person(T info){
		this.setInfo(info);
	}
	public void setInfo(T info){
		this.info=info;
	}
	public T getInfo(){
		return this.info;
	}
	public String toString(){
		return this.info.toString();
	}
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person<Contact> p=null;
			p=new Person<Contact>(new Contact("江苏省","14643..0","223366"));
		System.out.println(p);
	}

}
