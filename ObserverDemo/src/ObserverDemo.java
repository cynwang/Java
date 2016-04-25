import java.util.Observable;
import java.util.Observer;


class House extends Observable{
	private float price;
	public House(float price){
		this.price=price;
	}
	public void setPrice(float price){
		super.setChanged();
		super.notifyObservers(price);
		this.price=price;
	}
	public float getPrice(){
		return this.price;
	}
	public String toString(){
		return "房子的价格："+this.price;
	}
	
}
class HousePriceObserver implements Observer{
	private String name;
	public HousePriceObserver(String name){
		this.name =name;
	}
	public void update(Observable o, java.lang.Object arg) {
	
		System.out.println("1"+o);
		System.out.println("2"+arg);
	}

}
public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h=new House(10000.0f);
		HousePriceObserver hpo1=new HousePriceObserver("购房者A");
		HousePriceObserver hpo2=new HousePriceObserver("购房者B");
		HousePriceObserver hpo3=new HousePriceObserver("购房者C");
		h.addObserver(hpo1);
		h.addObserver(hpo2);
		h.addObserver(hpo3);
		System.out.println(h);
		h.setPrice(5000);
		System.out.println(h);
	}

}
