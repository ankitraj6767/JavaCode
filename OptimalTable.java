package com.blueYonder.day09;

public class OptimalTable {
	static int[] findOptimalTable(int[][] dishesMatrix) {
		
		int maxi=0;
		int[] table= new int[2];
		
		for(int i=0;i<dishesMatrix.length;i++) {
			for(int j=0;j<dishesMatrix[0].length;j++) {
				
				int curDishes= TotalCountDishes.countDishes(dishesMatrix,i,j);
				if(curDishes>maxi) {
					maxi=curDishes;
					
					table[0]=i+1;
					table[1]=j+1;
				}
			}
		}
		return table;
		
	}
}
