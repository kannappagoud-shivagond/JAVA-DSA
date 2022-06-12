import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
       // int[] Marks  = new int[5];
        // Marks[0] =97;
        // Marks[1] =78;
        // Marks[2] =68;
        // Marks[3] =85;
        // Marks[4] =87;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            numbers[i]= sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index  : " + i);

            }
           
        }
        
    
        

    }
    
}
