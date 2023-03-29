

class Student {
  String name;
  int age;

  public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
  }



  Student() {
    System.out.println("constructor called");
  }
}

public class oops {
   public static void main(String args[]){
   Student s1 = new Student();
   s1.name="abhi";
   s1.age=24;

   s1.printInfo();
}
}
