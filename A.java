//import java.sql.SQLOutput;
//
//class A{
//  A()
//  {
//    System.out.println("hello");
//  }
//  A(int x)
//  {
//    this();
//    System.out.println("hi");
//  }
//  public static void main(String[] args)
//  {
//    A obj = new A(5);
//  }
//
//}
//class A{
//  void fun()
//  {
//    System.out.println("Hello in A");
//  }
//}
//class B extends A
//{
//  void fun()
//  {
//    super.fun();
//    System.out.println("hello in B");
//  }
//  public static void main(String[] args)
//  {
//    B obj = new B();
//    obj.fun();
//  }
//}
//class A{
//  A(){
//    System.out.println("hi");
//  }
//  A(int x)
//  {
//    System.out.println("i am");
//  }
//}
//class B extends A
//{
//  B()
//  {
//    super(5);
//    System.out.println("hello");
//  }
//  public static void main(String[] args)
//  {
//    B obj = new B();
//  }
//}
//

import org.w3c.dom.ls.LSOutput;

class A {
  public static void main(String[] args) {
    int arr[] = {1, 4, 5, 78, 89, 45};
    int val = 11;
    int i;
    for (i = 0; i < arr.length; i++) {
      if (arr[i] == val) {
        System.out.println("FOUND");
        break;
      }
    }
    if (i == arr.length) {
      System.out.println("NOT FOUND");
    }

  }
}