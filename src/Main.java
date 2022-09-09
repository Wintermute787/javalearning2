import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Your face!");
        int mynum = 4;
        double mydub = 5.4;
        System.out.println(mynum);
        System.out.println(mydub);
        System.out.println("Enter your dub");

        Scanner input = new Scanner(System.in);
        mydub = input.nextDouble();

        System.out.println("your new dub is" + " " + mydub);
    }
}
