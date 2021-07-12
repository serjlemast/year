import java.util.Scanner;

public class shekSeason {
    public void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("You have entered: " + str);
        switch (str.toLowerCase().trim()) {
            case ("december"):
            case ("january"):
            case ("february"):
                System.out.println("winter");
                break;
            case ("april"):
            case ("may"):
            case ("march"):
                System.out.println("spring");
                break;
            case ("september"):
            case ("october"):
            case ("november"):
                System.out.println("autumn");
                break;
            case ("june"):
            case ("july"):
            case ("august"):
                System.out.println("summer");
                break;
            default:
                System.out.println("Hello world!");
                break;
        }
    }
}
