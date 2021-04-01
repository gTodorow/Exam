import java.util.Scanner;
class Test{
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("a = ");
    double a = input.nextDouble();
    System.out.print("b = ");
    double b = input.nextDouble();
    System.out.print("c = ");
    double c = input.nextDouble();
    
    if(a <= 0 || b <= 0 || c <= 0){
    	System.out.println("Invalid figure!");
    	return;
    }
    double S = 2*(a*c + b*c);
    double V = a * b * c;
    System.out.printf("S = %.2f\n", S);
    System.out.printf("V = %.2f\n", V);
 }
}
