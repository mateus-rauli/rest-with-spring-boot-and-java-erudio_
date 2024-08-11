package br.com.erudio.utils;

public class Utils {
	public static Double convertToDouble(String value) {
		if(value == null) return 0D;
		
		String number = value.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}
	
	public static boolean isNumeric(String value) {
		if(value == null)return false;
		
		String number = value.replaceAll(",",".");
		
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
