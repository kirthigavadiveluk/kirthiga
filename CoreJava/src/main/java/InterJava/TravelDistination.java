package InterJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class TravelDistination {

	public static void main(String[] args) {
		Booking dur = new LocalDT();
		Booking SpedTimeDist = new STD();
		
		dur.plan();
		SpedTimeDist.plan();
	}
}

class LocalDT extends Booking {

	@Override
	public void plan() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");

		LocalDateTime now = LocalDateTime.now();

		String dateTimeString = now.format(formatter);

		System.out.println("Start Date / Time :" + dateTimeString);
		System.out.println();
	}
}

class STD extends Booking {
	public STD() {
		TimeZone zone = TimeZone.getTimeZone("Asia/Kolkata");
		System.out.println("Start TimeZone: " + zone.getOffset(Calendar.ZONE_OFFSET));
	}
	@Override
	public void plan() {
		double speed, distance, time;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter speed in kmph");
		speed = sc.nextDouble();
		System.out.println("enter distance in km");
		distance = sc.nextDouble();
		time = distance / speed;
		System.out.println("time taken in hrs is :" + time);
		
		LocalDate ld = LocalDate.now();
		while (time > 0) {
			String week = String.valueOf(ld.getDayOfWeek());
			if (week.equals("SUNDAY")) {
				ld = ld.plusDays(1);
			} else if (week.equals("SATURDAY")) {
				ld = ld.plusDays(1);
				count = count + 1;
				time = time - 4;
			} else {
				ld = ld.plusDays(1);
				count = count + 1;
				time = time - 12;
			}
		}
		System.out.println("No.of days required to reach destination is :" + count + " days");

		System.out.println("Reach destination on :" + ld);
	}
	
	
}

abstract class Booking {
	abstract public void plan();
}
