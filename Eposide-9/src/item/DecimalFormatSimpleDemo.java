package item;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {

	static public void SimpleFormat(String pattern, double value) {
		DecimalFormat myFormat = new DecimalFormat(pattern);
		String output = myFormat.format(value);
		System.out.println(value + " " + pattern + " " + output);
	}
	
	static public void UseApplyPatternFormat(String pattern, double value) {
		DecimalFormat myFormat = new DecimalFormat();
		myFormat.applyPattern(pattern);
		System.out.println(value + " " + pattern + " " + myFormat.format(value));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleFormat("###,###.###", 123456.789);
		SimpleFormat("00000000.###kg", 123456.789);
		SimpleFormat("000000.000", 123.78);
		
		UseApplyPatternFormat("#.###%", 0.789);
		UseApplyPatternFormat("###.##", 123456.789);
		UseApplyPatternFormat("0.00\u2030", 0.789);
	}

}
