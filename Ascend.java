
public class Ascend {
	//
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int num1 = (int)(Math.random()*limit);
		int num2 = (int)(Math.random()*limit);
		int num3 = (int)(Math.random()*limit);
		int min = Math.min(Math.min(num2, num3), num1);
		int max = Math.max(Math.max(num2, num3), num1);
		int middle = (num1 + num2 +num3) - min - max;
		System.out.println(max + " " +middle + " " +min);
		System.out.println(min + " " + middle + " " +max);
	}
}
