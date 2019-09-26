import java.util.Scanner;

public class Currency_Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.print("Enter usd: ");
        usd = sc.nextDouble();

        double convert = usd * vnd;
        System.out.println("Convert to VND: "+ convert);
    }
}
