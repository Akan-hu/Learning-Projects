import java.util.logging.Logger;

public class Patterns {
  Logger logger = Logger.getLogger(getClass().getName());
    public static void main(String args[]){
  //    printHollowPattern(5,6);
  //    printHalfPyramid(4,5);
  //    printHalfPyramid2(4,5);
  //     printHalfPyramid3(4,5);
  //     printHalfPyramidWithNum(5);
  //    printHalfPyramidWithNum2(5);
  //    printBinaryPattern(6);
  //    butterflyPattern(7);
  //   solidRhombus(6);
  //  numberPyramid(7);
  //  palindromPattern(7);
 //  diamondPattern(10);
 int a = rec(7);
 System.out.println(a);
    }
    public static void printHollowPattern(int row,int column){
      int space = column - 2;
      for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
          if(i==0 || i==row-1 || j==0 || j==column-1){
            System.out.print("*");
          }else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
    public static void printHalfPyramid(int row,int column){
      for(int i=0;i<row;i++){
        for(int j=0;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
    public static void printHalfPyramid2(int row,int column){
      for(int i=0;i<row;i++){
        for(int j=0;j<row-i;j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
    public static void printHalfPyramid3(int row,int column){
      for(int i=0;i<row;i++){
        for(int j=0;j<row-i-1;j++){
          System.out.print(" ");
        }
        for(int k =0;k<=i;k++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
    public static void printHalfPyramidWithNum(int row){
      int count = 1;
      for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
          System.out.print(count);
          count = count+1;
        }
        System.out.println();
      }
    }
    public static void printHalfPyramidWithNum2(int row){
      for(int i=0;i<row;i++){
        for(int j=0;j<=row-i-1;j++){
          System.out.print(j+1);
        }
        System.out.println();
      }
    }
    public static void printBinaryPattern(int row){
      for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
          if(i%2 ==0 ){
            if(j%2==0){
              System.out.print(1);
            }else{
              System.out.print(0);
            }    
          }else{
            if(j%2 == 0){
              System.out.print(0);
            }else{
              System.out.print(1);
            }
           
          }
        }
        System.out.println();
      }
    }
    public static void butterflyPattern(int row){
      int space;
      int spaceCout = row;

      //upper shape
      for(int i=0;i<row;i++,spaceCout--){
        space = 2*(spaceCout-1);
        
        //left side stars
          for(int k=0;k<=(2*i+1)/2;k++){
            System.out.print("*");
          }
          for(int j = 0;j<space;j++){
            System.out.print(" ");
          }
           //right side stars
          for(int l=0;l<=(2*i+1)/2;l++){
            System.out.print("*");
          }
        System.out.println();
      }

      //lower shape
      int spaceCout2 = row;
      for(int i=0;i<row;i++,spaceCout2--){
        //left side stars
          for(int k=0;k<spaceCout2;k++){
            System.out.print("*");
          }
          int s = 2 * (row-spaceCout2);
          for(int j = 0;j<s;j++){
            System.out.print(" ");
          }
           //right side stars
          for(int l=0;l<spaceCout2;l++){
            System.out.print("*");
          }
        System.out.println();
      }
    }
    public static void solidRhombus(int row){
      int r = row;
      for(int i=0;i<row;i++,r--){
        
         for(int j=r-1;j>0;j--){
          System.out.print(" ");
         }
        for(int j=row-1;j>=0;j--){
          System.out.print("#");
        }
        System.out.println();
      }
      
    }
    public static void numberPyramid(int row){
      for(int i=0;i<row;i++){
        for(int j = 0;j<row-i-1;j++){
          System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
          System.out.print(i+1);
          System.out.print(" ");
        }
        System.out.println();
      }
    }
    public static void palindromPattern(int row){
      for(int i=0;i<row;i++){
        for(int j = 0;j<row-i-1;j++){
          System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
          System.out.print(i+1-k);
        }
        for(int j = 2;j<=i+1;j++){
          System.out.print(j);
        }
        System.out.println();
      }
    }
    public static void diamondPattern(int row){
      //printing upper triangle
      for(int i=0;i<row;i++){
        //printing left spaces
        for(int j=1;j<row-i;j++){
          System.out.print(" ");
        }
        //printing first triangle
        for(int k=0;k<=i;k++){
          System.out.print("*");
        }
        //printing right star triangle
        for(int l = 0;l<i;l++){
          System.out.print("*");
        }
        System.out.println();
      }
      //printing lower triangle
      for(int i=0;i<row;i++){
        //printing left spaces
        for(int k=0;k<i;k++){
          System.out.print(" ");
        }
        //printing left stars
        for(int j=1;j<=row-i;j++){
          System.out.print("*");
        }
        //priting right stars
        for(int l=1;l<row-i;l++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
    public static int rec(int n){
      if(n==0 || n==1){
        return 1;
      }else{
       
       return n * rec(n-1);
        //System.out.println(n);
      }

    }
}