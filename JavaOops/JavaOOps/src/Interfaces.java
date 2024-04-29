public class Interfaces {
  public static void main(String args[]){
    Horse h = new Horse();
    h.walk();
  }

}
interface Animal{
 public  void walk();
}
class Horse implements Animal{
@Override
public void walk(){
System.out.println("Animals are walk");
}   
}