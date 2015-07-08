package pl.astrait.superdigit;

public class Superdigit {

	public static long calculateSuperdigit(long currentNumber){
		if( currentNumber < 10){
			return currentNumber;
		}else{
			long sumOfDigits = 0;
			while (currentNumber > 0) {
			  long divideResult = currentNumber / 10;
			  long digit = currentNumber - divideResult * 10;
			  sumOfDigits += digit;
			  currentNumber = divideResult;
			}
			return calculateSuperdigit(sumOfDigits);
		}
	}
}
