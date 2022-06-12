

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
   Student(String name, int age){
       this.name = name;
       this.age = age;

   }
}

public class Oops1 {
    public static void main(String[] args) {
        Student s1 = new Student("kanna",26);
        // s1.name="kannappagoud";
        // s1.age =26;

        s1.printInfo();
        
    }
    
}
