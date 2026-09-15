public class Time{

	public static void main(String[] args){
		int hour;
		int minute;
		int second; 
		int second_passed;
		int second_remaining;
		double day_percent;
		int time_since_start;
		hour = 13;
		minute = 30;
		second = 30;
		second_passed = hour * 60 * 60 + minute * 60 + second;
		second_remaining = 86400 - second_passed;
		day_percent = 100 * second_passed/86400.0;
		time_since_start = (hour-13) * 3600 + (minute-13) * 60 + (second-30);
		System.out.print("Seconds Passed: ");
		System.out.println(second_passed);
		System.out.print("Seconds Remaining: ");
		System.out.println(second_remaining);
		System.out.print("Percentage of Day Passed: ");
		System.out.print(day_percent);
		System.out.println("%");
		System.out.print("Time Since Exercise Started: ");
		System.out.print(time_since_start);
		System.out.print(" Seconds");
	}
}
