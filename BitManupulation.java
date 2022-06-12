import java.util.Scanner;

public class BitManupulation {
    public static void main(String[] args) {
        //GetBit example
        // get the 3rd bit(position=2) of a number (n=0101)
        // bit mask : 1<<i
        //Operation AND
        // int n =5; // 0101
        // int pos =3;
        // int BitMask = 1<<pos;

        // if((BitMask & n)==0){
        //     System.out.println("bit was zero");
        // }
        // else{
        //     System.out.println("bit was one ");
        // }

        // Set Bit Example
        // Q: set the 2nd bit (position =1 ) of a number n(n=1010)
        // Bitmask:1<<i
        // operation :OR

        // int n = 5;
        // int pos = 1;
        // int BitMask = 1<<pos;
        
        // int newNumber = BitMask | n;
        // System.out.println(newNumber);

        //Clear Bit

        // Clear the bit (positon=2) of a number n. (n=0101)

        // Bit Mask : i<<i
        // Operation : AND with NOT

        // int n =5; //0101
        // int pos = 2;
        // int BitMask = 1<<pos;
        // int notBitMask = ~(BitMask);


        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        // Update Bit
        // Update the bit (position=1) of a number n to 1. (n=0101)
        //Bit mask: 1<<i
        //operation: AND WITH NOT

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // operation=1; set operation=0; clear

        int n = 5;
        int pos = 1;
        int BitMask = 1<<pos;
        if(oper==1){
            // set
            int newNumber = BitMask | n;
            System.out.println(newNumber);
        }
        else{
            //clear
            int newBitMask = ~(BitMask);
            int newNumber = newBitMask;
            System.out.println(newNumber);
        }

    }
    
}
