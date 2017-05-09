package part4;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datee {
	//get the last day of the current month
	
	// get current full date and time
	
	// get current full date
	
	// get  12 december 2014
	
	//get current year
	
	//get current month
	
	//get current time
	
	//
	public static void main(String [] args) {
	Date date = new Date();
	SimpleDateFormat formatt = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	
	calender();
	dateAndTime(date);
	date(date);
	year(date);
	month(date);
	dec(date);
	}
	public static void calender() {
		 // get the last day of the current month
		Calendar calendar = Calendar.getInstance();
		   int lastDay = calendar.get(Calendar.DAY_OF_WEEK);
		   SimpleDateFormat formatt = new SimpleDateFormat("E");
		   new SimpleDateFormat("E");
		   System.out.println("Last day of current month is : " + formatt.format(lastDay));
		   System.out.println("");
	}
	public static void dateAndTime(Date date) {
		
		System.out.println("Current date and time : " +date.toString());
		   System.out.println("");
		
	}
	
	public static void date(Date date) {
		   SimpleDateFormat formatt = new SimpleDateFormat("E yyyy.MM.dd");
			System.out.println("Current Date is : " + formatt.format(date));
			   System.out.println("");

	}
	
	public static void year(Date date) {
		SimpleDateFormat formatt = new SimpleDateFormat("yyyy");
		System.out.println("current year is : " + formatt.format(date) );
		   System.out.println("");

	}
	
	public static void month(Date date) {
		SimpleDateFormat formatt = new SimpleDateFormat("MM");
		   System.out.println("Current month is " + formatt.format(date));
		   System.out.println("");

	}
	
	public static void time(Date date) {
		SimpleDateFormat formatt = new SimpleDateFormat ("hh:mm:ss a zzz");
		   System.out.println("Current Time is : " + formatt.format(date));
		   System.out.println("");

	}
	
	public static void dec(Date date) {
	Calendar myCal = Calendar.getInstance();
	myCal.set(2014, Calendar.DECEMBER, 12);
	date = myCal.getTime();
	SimpleDateFormat formatt = new SimpleDateFormat("E yyyy.MM.dd");
	   System.out.println( formatt.format(date));


	
		
	}
}
