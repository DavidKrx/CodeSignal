package dad.java.Codesignal;

import java.util.Arrays;

public class EdgeOfTheOcean {
	int adjacentElementsProduct(int[] inputArray) {
		int a=-10000;
		    for(int i=0; i<inputArray.length-1; i++){
		      if (a<inputArray[i]*inputArray[i+1]){
		          a=inputArray[i]*inputArray[i+1];
		          } }
		    return a;
}
	int shapeArea(int n) {
	    int resultado=0;
	    if (n>=1 && n<10000){
	    int area=0;
	    for (int i=1; i<n; i++){
	    area=area+(4*i); }
	    resultado=area+1;
	   }
	    return resultado;
	    }
	
	int makeArrayConsecutive2(int[] statues) {
		 Arrays.sort(statues);
				  int faltan=0;
				  int a;
				  for (int i=0; i<statues.length-1;i++){
				      a=statues[i]+1;
				      if (a!=statues[i+1]){
				    	  faltan=faltan+((statues[i+1])-(statues[i]+1));
				      }
				  }
		return faltan;
		}
	}
