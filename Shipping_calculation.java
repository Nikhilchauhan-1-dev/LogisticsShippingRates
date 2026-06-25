import java.util.Scanner;
public class Shipping_calculation{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the weight of the container in kg:- ");
    float weight = sc.nextFloat();
    System.out.println("Enter the rate per kg of containers");
    float rate = sc.nextFloat();
    System.out.printf("Cost for Shipping : %.2f $" , weight*rate);
  }
}
