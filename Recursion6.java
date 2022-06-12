public class Recursion6 {

    // withou using Recusrsion

    // public static void main(String[] args) {
    //     int n1=0, n2=1, n3,i,count=10;
    //     System.out.print(n1+ " " +n2);
    //     for(i=2;i<count;++i){
    //         n3=n1+n2;
    //         System.out.print(" "+n3);
    //         n1=n2;
    //         n2=n3;
    //     }

    // }
    

    // with using Recusrion 
    public static void printFib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);

    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a, b, n-2);

        
    }

    
}
