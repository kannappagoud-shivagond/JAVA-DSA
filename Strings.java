import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        
        // System.out.println("enter the is " + name);

        String FirtstName = "Kannu";
        String SecondtName = "Shiva";

        String FullName = FirtstName + "@" + SecondtName;

        //CahrAt
        for(int i=0; i<FullName.length(); i++){
            System.out.println(FullName.charAt(i));
        }

        System.out.println(FullName.length());


    
        
    }
    
}
