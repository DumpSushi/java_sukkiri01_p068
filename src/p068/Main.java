package p068;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 2-1
		{
			Date nowDate = new Date();
			Calendar calcCalendar = Calendar.getInstance();
			calcCalendar.setTime(nowDate);
			int day = calcCalendar.get(Calendar.DAY_OF_MONTH);
			day += 100;
			calcCalendar.set(Calendar.DAY_OF_MONTH, day);
			Date newDay = new Date();
			newDay = calcCalendar.getTime();

			SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年/MM月/dd日 HH:mm:ss");
			String s = f.format(newDay);
			System.out.println(s);
		}

		// 2-2
		{
			ZonedDateTime nowDate = ZonedDateTime.now();
			ZonedDateTime newDate = nowDate.plusDays(100);
			DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年/MM月/dd日 HH時mm分ss秒");
			String s = f.format(newDate);
			System.out.println(s);
		}
	}

}
