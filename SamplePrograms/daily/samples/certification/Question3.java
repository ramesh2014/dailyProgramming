package daily.samples.certification;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question3 {

	public static void main(String[] args) {
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		//String date = LocalDate.parse("2011-12-03T10:15:30").format(DateTimeFormatter.ISO_DATE_TIME);
		//String date = LocalDate.parse("2011-12-03T10:15:30+01:00").format(DateTimeFormatter.ISO_DATE_TIME);
		//String date = LocalDate.parse("2011-12-03T10:15:30+01:00[Europe/Paris]").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);
		
		//'2011-12-03T10:15:30',
	    //'2011-12-03T10:15:30+01:00' or '2011-12-03T10:15:30+01:00[Europe/Paris]'
	}
	
}    
