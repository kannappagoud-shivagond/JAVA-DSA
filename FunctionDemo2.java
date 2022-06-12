import java.util.Scanner;

public class FunctionDemo2 {

    public static  int CalculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        
        int sum = CalculateSum(a, b);
        System.out.println("sum of two numbers is: "+ sum);

        
        
    }
    
}
