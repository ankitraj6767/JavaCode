package com.blueYonder.day09;

import java.util.Scanner;

public class TastingParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows= sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols= sc.nextInt();
		int[][] dishesMatrix =new int [rows][cols];
		
		System.out.println("Enter the number of dishes for each tables: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				dishesMatrix[i][j]= sc.nextInt();
				
			}
		}
		
		int[] optimalTable= OptimalTable.findOptimalTable(dishesMatrix);
		int maxDishes=TotalCountDishes.countDishes(dishesMatrix, optimalTable[0], optimalTable[1]);
		System.out.println("X: "+optimalTable[0]+" Y: "+ optimalTable[1]+" "+maxDishes);
		

	}

}
