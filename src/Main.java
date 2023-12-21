import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.print("Write Number 1 : ");
        a = inp.nextInt();
        System.out.print("Write Number 2 : ");
        b = inp.nextInt();
        System.out.print("Write Number 3 : ");
        c = inp.nextInt();


        if ((a == b) || (c == b) || (a == c)) {
            System.out.println("Shouldn't be equals....");


        } else {
            System.out.println("\nSorted from Largest to Smallest : ");

            if (a >= b && a >= c){
                if (b >= c) {
                    System.out.println(a + " > " + b + " > " + c);
                }else{
                    System.out.println(a + " > " + c + " > " + b);
                }
            }if (b >= c && b >= a){
                if (c >= a) {
                    System.out.println(b + " > " + c + " > " + a);
                }else{
                    System.out.println(b + " > " + a + " > " + c);
                }
            }if (c >= b && c >= a){
                if (b >= a){
                    System.out.println(c + " > " + b + " > " + a);
                }else{
                    System.out.println(c + " > " + a + " > " + b);
                }
            }
            System.out.println("\nSorted from Smallest to Largest : ");
        }if (a <= b && a <= c){
            if (b <= c){
                System.out.println(a + " < " + b + " < " + c);
            }else {
                System.out.println(a + " < " + c + " < " + b);
            }
        }if (b <= c && b <= a){
            if (c <= a){
                System.out.println(b + " < " + c + " < " + a);
            }else {
                System.out.println(b + " < " + a + " < " + c);
            }
        }if (c <= b && c <= a){
            if (b <= a){
                System.out.println(c + " < " + b + " < " + a);
            }else {
                System.out.println(c + " < " + a + " < " + b);
            }
        }
    }
}
