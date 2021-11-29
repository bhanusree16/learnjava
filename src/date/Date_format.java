package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_format {

	public static void main(String[] args) {
		Date today_date = new Date();
		System.out.println(today_date);
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd y E hh:mm a w");
		/**
		 * dd = day in month
		 * DD = DAY in Year
		 * MM = month in numeric
		 * MMMM = month in text
		 * y = full year
		 * yy = last 2 digits of year
		 * w = week in year
		 * W = week in month
		 * E = starting 3 letters of day
		 * EEEE = name of day
		 * HH = 24 HOURS
		 * hh = 12 hours time
		 * 
		 */
		System.out.println(sdf.format(today_date));

	}

}
