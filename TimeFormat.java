// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String time = "";
		if (hours < 12) time = "AM";
		else time = "PM";
		System.out.println(hours + ":" + minutes + " " + time);
	}
}