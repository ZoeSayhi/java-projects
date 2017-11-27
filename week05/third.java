package com.zytong.week05;

public class third {
	public static void main(String[] args) {
		int max=0,min=0;
		int[][]a={{1,87,77,90,56,95,66},
                  {2,76,88,98,78,37,42},
	              {3,85,76,89,90,75,88},
        		  {4,44,66,77,88,33,90},
                  {5,87,99,36,100,88,65}};
		for(int j=1;j<7;j++){
			
			for(int i=0;i<5;i++){
				if(i==0){
					max=a[i][j];
				    min=a[i][j];
				}
				if(a[i][j]>max){
					max=a[i][j]; 
					}
				if(a[i][j]<min){
					min=a[i][j];
				}
			}
			System.out.println(j+1+" "+"max:"+max);
			System.out.println(j+1+" "+"min:"+min);
		}
	}

}
