package Actividad_GIT_Package;

import java.util.Scanner;

public class Actividad_GIT_Varsendan_Y_Crespo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		// User 1 fer la suma dels elements de sumArray
		
		int resultadoSUM = 0;

		for(int i = 0;i < 5; i++) {
			
			
			resultadoSUM +=  sumArray [i];
		}
		

		System.out.println("El resultado de la suma es: " + resultadoSUM);

		
		// User 2 fer la resta dels elements de subArray
		
		int resultsub = 785675;
		
		for (int i = 1; i < 5; i++) { 
			resultsub -= subArray[i]; 
			}
		
		System.out.println("El resultado de la resta es: " + resultsub);
		
		// User 3 fer la multiplicació dels elements de prodArray
	}

}
