package cm.objis.wtt.pharmacie.serverrmi.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static Date convertirdate(String cdate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = sdf.parse(cdate);
		} catch (ParseException e) {

		}
		return date;
	}

	public static String convertirdateString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		String cdate = null;
		cdate = sdf.format(date);
		return cdate;
	}

}
