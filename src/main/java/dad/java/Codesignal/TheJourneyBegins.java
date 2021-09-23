package dad.java.Codesignal;

public class TheJourneyBegins {

	int add(int param1, int param2) {
	return param1+param2;
	}
	int centuryFromYear(int year) {
		year=year-1;
		int s=(year/100)+1;
		return s;
		}
	boolean checkPalindrome(String inputString) {
	    for (int i=0, x=inputString.length()-1; i<=x; i++,x--){
	    if(inputString.charAt(i)!= inputString.charAt(x)){
	       return false;
	    }  
	}
	return true;
	}
}
