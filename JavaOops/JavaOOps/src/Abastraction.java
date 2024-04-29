public class Abastraction {
  public static void main(String args[]){
    Horse h = new Horse();
    h.walk();
    h.eats();
  }
}
abstract class Animal{
  abstract void walk();
  public void eats(){
    System.out.println("All animals eats most of eats green grass");
  }
  Animal(){
    System.out.println("You are creating constructors in base class");
  }
}
class Horse extends Animal{
  public void walk(){
    System.out.println("Walks on four legs");
  }
  Horse(){
    System.out.println("You are creating constructor in child class");
  }
  public void getSpeed(){

  }
}
class Chicken extends Animal{
  public void walk(){
    System.out.println("Walks on 2 legs");
  }
}