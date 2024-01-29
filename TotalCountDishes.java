package com.blueYonder.day09;

public class TotalCountDishes {
	static int countDishes(int[][] dishesMatrix, int row, int col) {
		int cnt=0;
//		for(int i=Math.max(0,row-1);i<=Math.min(row+1, dishesMatrix.length-1);i++)
//		{
//			for(int j=Math.max(0, col-1);j<=Math.min(col+1, dishesMatrix[0].length-1);j++) {
//				cnt+=dishesMatrix[i][j];
//			}
//		}
//		
		
		for(int i=row-1;i<=row+1;i++)
		{
			for(int j=col-1;j<=col+1;j++) {
				if(i>=0 && j>=0 && i<dishesMatrix.length && j< dishesMatrix[0].length)
				{
					cnt+=dishesMatrix[i][j];
				}
			}
		}
		return cnt;
		
	}

}
