public class Polymorphism {
  public static void main(String args[]){
    MyPolymorphism p1 = new MyPolymorphism();
    p1.getCalculation(23,34) ;
  }
}
class MyPolymorphism{
  public int getCalculation(int a,int b){
    return a+b;
  }
  public int getCalculation(int a, int b, int c){
    return a * b * c;
  }
  public String getCalculation(int a,String b){
    System.out.println("Age is "+a);
    return b;
  }
}