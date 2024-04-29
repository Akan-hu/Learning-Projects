public class App {
    public static void main(String[] args) throws Exception {
       
        Himanshu himanshu = new Himanshu("Akanksha","Bareilly",22);    
        himanshu.habit = "Watching Cricket";
        himanshu.getProfessionData("MJPRU",38000,202099020004L,80);
        himanshu.printInfo();
    //     MyHouse myHouse = new MyHouse();
    //     int fm = myHouse.familyMembers(10);
    //     myHouse.color = "White";
    //     myHouse.isDuplex = false;
    //     System.out.println("Number of family members "+fm);
    //     int totalRoom = myHouse.totalRooms(4, 2, 5);
    //     System.out.println("Total Rooms "+totalRoom);

        

        
    //     myHouse.setBedRoomDirection("North-west");
    //    String d = myHouse.getRoomDirection();
    //     System.out.println(d);

    //     myHouse.setIsGold(true);
    //     boolean g = myHouse.getGoldAvailability();
    //      System.out.println(g);
       
    //     String[] servants = {"Kalu","Malu","Shalu","Chalu","Dhalu"};
    //     myHouse.getServentsNames(servants);
       
        MyHouse h = new MyHouse("Brown",false);
        h.getInfo();
        MyHouse h2 = new MyHouse(h);
        h2.getInfo();
    }
}
class Himanshu{
    String habit;
    String fullName;
    String address;
    int age;
    //Constructor
    public  Himanshu(String fullName,String address,int age){
      
        this.fullName = fullName;
        this.address = address;
        this.age = age;
        
    }
    public void printInfo(){
          System.out.println("Full Name: "+this.fullName);
        System.out.println("Residence: "+this.address);
        System.out.println("Age: "+this.age);
    }
    public void getProfessionData(String college,int salary,Long rollNo,int score){
        System.out.println("College name: "+college);
        System.out.println("Salary: "+salary);
        System.out.println("Roll Number: "+rollNo);
        System.out.println(this.habit);
     
    }
}
class MyHouse{
    private String bedRoomDirection;
    private boolean isGold;
    String color;
    boolean isDuplex;
    public String getRoomDirection(){     
       return bedRoomDirection;
    }
    MyHouse(MyHouse h){
        this.color = h.color;
        this.isDuplex = h.isDuplex;
    }

    public void getInfo(){
        System.out.println(this.color);
        System.out.println(this.isDuplex);
    }
    MyHouse(String color,boolean val){
        this.color = color;
        this.isDuplex = val;
    }
    // Setter method to modify the private variable
    public void setBedRoomDirection(String value) {
        bedRoomDirection = value;
    }
    public boolean getGoldAvailability(){
        return isGold;
    }

    public void setIsGold(boolean val){
        isGold = val;
    }
    public int totalRooms(int bedroom,int guestRoom,int lobby){
        System.out.println(this.color);
        System.out.println(this.isDuplex);
        return bedroom + lobby + guestRoom;
    }
    public void getServentsNames(String[] servents){
        System.out.print("These are my servants: ");
        for(int i=0;i<servents.length;i++){
            System.out.print(servents[i]+" ");
        }
    }
    public int familyMembers (int numOfMembers){
        return numOfMembers;
    }

}
