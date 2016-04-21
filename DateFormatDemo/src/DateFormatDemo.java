import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class DateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat  df1=null;
		DateFormat  df2=null;
		df1=DateFormat.getDateInstance(DateFormat.YEAR_FIELD ,new Locale("zh", "CN"));
		df2=DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD ,DateFormat.ERA_FIELD,new Locale("zh", "CN"));
		System.out.println("Date:"+df1.format(new Date()));
		System.out.println("DateTime:"+df2.format(new Date()));
	}

}
