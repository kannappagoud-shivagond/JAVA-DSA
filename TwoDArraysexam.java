
// Take a matrix as a input from the useer.search for given number as x and printh the indices at which it occurs.

import java.util.Scanner;

public class TwoDArraysexam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
               numbers[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.print("x found at the locations(" + i + ", " + j + ")");
                } 
            }
        }

    }
    
}




