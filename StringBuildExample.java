public class StringBuildExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Akshi");

        // cahr at index o

        System.out.println(sb.charAt(0));

       // sb.setCharAt(0, 'p');
        //System.out.println(sb);
       // sb.insert(0, 's');
        //System.out.println(sb);

        sb.delete(0, 3);
        System.out.println(sb);


        
    }
    
}
