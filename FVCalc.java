// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int correct_value = Integer.parseInt(args[0]);
		double percentage = Double.parseDouble(args[1]);
		int year = Integer.parseInt(args[2]);
		double rate = percentage / 100.0;
		double total = correct_value * Math.pow((1 + rate),year);
		System.out.println("After " +year+ " years, $" +correct_value+ " saved at " +percentage+ "% will yield $" +(int)total);
	}
}