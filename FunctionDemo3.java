import java.util.Scanner;

public class FunctionDemo3 {

     public static int CalculateProduct(int a, int b){
         return a*b;

     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  a = sc.nextInt();
        int  b = sc.nextInt();
        System.out.println("Prodcut of two numbers is :" +CalculateProduct(a, b) );
        
    }
    
}
