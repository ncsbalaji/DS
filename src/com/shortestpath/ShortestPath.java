package com.shortestpath;

public class ShortestPath {

public static void main(String[] args) {
    int x = Integer.MAX_VALUE;
    int [][] adj= {      
    		{0, 6, x, 6, 7}, 
            {x, 0, 5, x, x}, 
            {x, x, 0, 9, 3}, 
            {x, x, 9, 0, 7}, 
            {x, 4, x, x, 0}};

    int [][] D = adj;

    for (int k=0; k<5; k++){
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if(D[i][k] != x && D[k][j] != x ){
                       D[i][j] = Math.min(D[i][k]+D[k][j],  D[i][j]);                    
                   }
            }
        }       
    }

    //Print out the paths
    for (int r=0; r<5; r++) {
         for (int c=0; c<5; c++) {
             if(D[r][c] == x){
                 System.out.print("n/a"); 
             }else{
             System.out.print(" " + D[r][c]);
             }
         }
         System.out.println(" ");
     }
}
}
