package www.shaojie.xu;

public class StringCalculator {

	public static final int add(final String numbers) {

		int returnValue = 0;
		
		String[] numbersArray = numbers.split(",");
		
//		if (numbersArray.length > 2) {
//			throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
//		}
		
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) { 
				returnValue += Integer.parseInt(number);
			}
		}
		return returnValue;
	}
}
