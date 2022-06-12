public class PalindromicPattern {
    public static void main(String[] args) {
        int n=5;
        
        // outer loop
        for(int i=1; i<=n; i++){

            // print the space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            //  1st Half number
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }   
            System.out.println();         
        }
    }
    
}
