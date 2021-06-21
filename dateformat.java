import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class dateformat {

	public static String solve(String A) throws ParseException {
		String dateStr="";
		A = A.replace("st", "").replace("nd", "").replace("rd", "").replace("th", "");
        Date tempDate = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH).parse(A);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		  Calendar tempC = Calendar.getInstance(); tempC.setTime(tempDate); int year =
		  tempC.get(Calendar.YEAR); if (year >= 1900 && year <= 3000){ dateStr =
		  df.format(tempDate).toString(); } else {
		  System.out.println("Year out of range"); }
		 
		
		return dateStr;

	}
	
	public static void main(String[] args) throws ParseException {
		String date = "16th Mar 2068";
		System.out.println(solve(date));
	}

}
