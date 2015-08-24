import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x=0,y=0;
        Cal mycal = new Cal();
        Scanner in = new Scanner(System.in);
        char symbol=' ';
        while (true) {
            System.out.println("_____________________________________");
            x = in.nextDouble();
            y = in.nextDouble();
            switch (symbol = in.next().charAt(0)) {
                case '+':
                    System.out.println(mycal.sum(x, y));
                    break;
                case '-':
                    System.out.println(mycal.sub(x, y));
                    break;
                case '*':
                    System.out.println(mycal.mul(x, y));
                    break;
                case '/':
                    System.out.println(mycal.div(x, y));
                    break;
                default:
                    System.out.println("invalid operation");
                    break;
            }
        }

    }
}
