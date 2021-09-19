
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(51);
    int originalNum = randomNum;
    {
      System.out.println("The Random number is: " + randomNum);
    }

    while (randomNum >= 0) {
      System.out.println(randomNum);
      randomNum--;
    }
    {
    if (originalNum <= 5) 
      System.out.println("Ahoy mateys!");
     else if (25 < originalNum && originalNum < 42) 
      System.out.println("Cannonball!");
     else 
      System.out.println("Blast Off!");
    
  }
}
}
