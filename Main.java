// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//       System.out.println("Hello World");
//     }
//   }

// public class Main {
//  public static void main(String[] args){
//   // Veriables
//   String name = "Saurabh";
//   //assign variable to other variable
//   String friend = name;
//   System.out.println(friend);
//  }
// }

// Java types
// Primitive types - stores simple values
// byte- 1 [-128 to 127]
// short- 2
// int - 4 [1, 2, 3, 4.....]
// long - 8
// float - 4 [3.14]
// double - 8
// char - 2 [a-z,special charecters]
// boolean - 1 [true/false]
// public class Main {

//   public static void main(String[] args){
//      byte age = 30;
//      int phone = 1234567890;
//      long phone2 = 1234567890145L;
//      float pi = 3.14F;
//      char letter = '@';
//      boolean isAdult = false;
//   }
// }

// Non - Primitive types / referance types- stores complex values
//String - has different methods
// public class Main {

//   public static void main(String[] args){
//      String name = "Java";
//      System.out.println(name.length());
//   }
// }

// public class Main {

//   public static void main(String[] args){
    // Strings - in java strings are immutable
  //  concatenate

    // String firstName = "Saurabh";
    // String lastName = "Dubey";
    // String fullName = firstName + " " + lastName; // '+' operator is used to concatenate the strings
    // System.out.println(fullName);

  //charAt
   // String firstName = "Saurabh";
   // System.out.println(firstName.charAt(5));

  //replace
    // String firstName = "Saurabh";
    // String firstName2 = firstName.replace('b', 'v');
    // System.out.println(firstName2);
    // System.out.println(firstName);
  
  //substring
    //  String name = "Raghu and Raghav";
    //  System.out.println(name.substring(5,9));
  // }
// }


// Arrays



// public class Main {

//   public static void main(String[] args){
//     int[] marks = new int[3]; // In java if the variable is only initialized without an value then the value is assigned to null means 0
//     marks[0] = 67;
//     marks[1] = 65;
//     marks[2] = 76;
//     System.out.println(marks[1]);
//     //length
//     System.out.println(marks.length);
//     //sort
//     Arrays.sort(marks);
//     System.out.println(marks[1]);
//   }
// }
  

// import java.util.Scanner;

// //conditional statement
// public class Main{
//   public static void main(String[] agr){
//      Scanner inputAge = new Scanner(System.in);
//      System.out.print("Enter your age: ");
//      int age = inputAge.nextInt(); // Read the input age as an integer

//     //  if(age >= 18){
//     //      System.out.println("Eligible for voting");
//     //  }
//     //  else{
//     //   System.out.println("Not eligible for voting");
//     //  }
//   String condition = age >= 18 ? "Eligible for voting" : "Not eligible for voting";
//   System.out.println(condition);
//      inputAge.close();
//   }
// }

// loops
  // public class Main{
  //   public static void main(String[] args){
  //     // for(int i = 100; i >= 1; i--){
  //     //   System.out.println(i);
  //     // }

  //     // int i = 100;
  //     // while (i >= 1){
  //     //   System.out.println(i);
  //     //   i--;
  //     // }

  //     int k = 100;
  //     do{
  //       System.out.println(k);
  //       k--;
  //     } while( k >= 1);
  //   }
  // }

  // import java.util.Scanner;

  // public class Main{
  //   public static void main(String[] args){
  //      Scanner sc = new Scanner(System.in);
  //      int num;
  //      do{
  //       System.out.println("Input a number: ");
  //       num = sc.nextInt();
  //       System.out.println("Here is your number: ");
  //       System.out.println(num);
  //      } while(num >= 0);
  //      System.out.println("The End");
  //      sc.close();
  //   }
  // }

  // public class Main{
  //   public static void main(String[] args){
  //     //Break And continue
  //     int i = 0;
  //     while(true){
  //       if(i == 3){
  //         i++;
  //       }
  //       System.out.println(i);
  //       i++;
  //       if(i > 5){
  //         break;
  //       }
  //     }
  //   }
  // }

  // public class Main{
  //   public static void main(String[] args){
  //     //Try-catch in Exceptional handeling 
  //     int[] marks = {91, 95, 97};
     
  //     try {
  //       System.out.println(marks[5]);
  //     } catch (Exception e) {
  //       // do something after exception
  //     }
  //    System.out.println("Vijay dinanath chouhan");
  //   }
  // }

  //How function/method works in java
  // public class Main{
  //   public static void printJava(){
  //     System.out.println("Hello JAVA");
  //   }
  //   public static void main(String[] args){
  //     //Methods
  //     printJava();
  //     printJava();
  //     printJava();
  //   }
  // }

  // public class Main{
  //   // public static void printName(String name){
  //   //   System.out.println(name);
  //   // }

  //   public static void printSum(int a, int b){
  //     int sum = a + b;
  //     System.out.println(sum);
  //   }
  //   public static void main(String[] args){
  //     //Methods
  //     printSum(3, 5);
      
  //   }
  // }

// public class Main {
//   int x = 5;
// }

// class Second {
//   public static void main(String[] args){
//     Main myobj = new Main();
//     System.out.println(myobj.x);
//   }
// }

// public class Main {
//   // Static method
//   static void myStaticMethod() {
//     System.out.println("Static methods can be called without creating objects");
//   }

//   // Public method
//   public void myPublicMethod() {
//     System.out.println("Public methods must be called by creating objects");
//   }

//   // Main method
//   public static void main(String[] args) {
//     myStaticMethod(); // Call the static method

//     Main myObj = new Main(); // Create an object of MyClass
//     myObj.myPublicMethod(); // Call the public method
//   }
// }

//generate randon number and guess with the users that the generated randon num is same or not with the positive numbers else return the end
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     int myNum = (int)(Math.random()*100);
     int userNumber;
     do{
      System.out.println("Guess my number from(0-100): ");
      userNumber = sc.nextInt();
      if(userNumber == myNum){
        System.out.println("WOOHOO...Correct Number");
        break;
      }
      else if(userNumber > myNum) {
        System.out.println("Your number is too large");
      }
      else{
        System.out.println("Your number is too small");
      }
       
     }while(userNumber >= 0);

     System.out.println("My number was: ");
     System.out.println(myNum);

     sc.close();
  }
}
