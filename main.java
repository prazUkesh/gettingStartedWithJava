public class main {
    public static void main(String[] args){
        // real life example of data types
      /*   int items = 4;


        float itemPrice = 5.57f;
        float totalCose = items * itemPrice;
        char currency = '$';

        System.out.println("total items: "+ items);
        System.out.println("item price per price: "+ itemPrice);
        System.out.println("your total cost: "+ currency + totalCose);


        System.out.println("---------------------\nthanks you for buying\ndo visit us again");*/
        // widening casting
       /*  int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);
*/

        // narrow casting
          /*
           double myDouble = 99.9d;
          int myInt = (int) myDouble;
    
          System.out.println(myInt);
          System.out.println(myDouble);
           */
            // string methods
           /*String name = "asodhoiasmnalsknclansldk";
           System.out.println("string length is: "+ name.length());
            String newName = name.toUpperCase();
            System.out.println(newName);
            String lowerName = newName.toLowerCase();
            System.out.println(lowerName);
            String greet = "myamyacha = boka";
            System.out.println(greet.indexOf("my"));

            for (int i = 0; i < 10; i++) {
              if (i == 4) {
                break;
              }
              System.out.println(i);
            }

            for (int i = 0; i < 10; i++) {
              if (i == 4) {
                continue;
              }
              System.out.println(i);
            }*/

            //Arrays



           /* int[][] rNum = {{9,8,7},{6,5,4,3},{2,1,0}};

            for(int i = 0; i < rNum.length; ++i){
              for(int j = 0; j <rNum[i].length; ++j){
                if(rNum[i][j]%2==0){
                  System.out.println("Even: " + rNum[i][j] + "\n");
                }
                else{
                  System.out.println("odd: " + rNum[i][j] + "\n");
                }
              }            }*/


  //methods
  /*
        greetUser();
        TwoSum(7,5);
       System.out.println( "sum with with return type: "+returnTwoSum(5, 5));
        }
        
public static void greetUser(){
  System.out.println("Hello user");*/

  System.out.println(numSum(2,3));
  System.out.println(numSum(3.14,9.8));
}
/*

Method body
public static void TwoSum(int a , int b){
 System.out.println("sum with no return type: "+(a+b) );
}

public static int returnTwoSum(int a , int b){
 //System.out.println( a + b);
 return a + b;

}*/

static int numSum(int x, int y){
return x + y;}

static double numSum(double x, double y){
return x+y;
}
}
