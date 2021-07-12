import java.util.Scanner;

public class MainRunner {

    /**
     * Name of months
     */
    public static final String DECEMBER = "december";
    public static final String JANUARY = "january";
    public static final String FEBRUARY = "february";
    public static final String APRIL = "april";
    public static final String MAY = "may";
    public static final String MARCH = "march";
    public static final String SEPTEMBER = "september";
    public static final String OCTOBER = "october";
    public static final String NOVEMBER = "november";
    public static final String JUNE = "june";
    public static final String JULY = "july";
    public static final String AUGUST = "august";

    /**
     * Name of seasons
     */
    public static final String SPRING = "spring";
    public static final String WINTER = "winter";
    public static final String AUTUMN = "autumn";
    public static final String SUMMER = "summer";

    /**
     * Error message
     */
    public static final String MESSAGE_INCORRECT_NAME = "please enter correct name!";
    public static final String EXIT_FORMAT_PROGRAM = "exit";

    private static boolean statusCycle = true;

    public static void main(String[] args) {
        while (statusCycle) {
            String input = readInput();
            print(input, "You have entered: %s");
            String month = searchMonthByInput(input);
            print(month, "The '%s' month is found!");
            attemptCloseProgram(input, month);
        }
    }

    private static void attemptCloseProgram(String input, String month) {
        if (input.compareToIgnoreCase(EXIT_FORMAT_PROGRAM) == 0 || month != null) {
            statusCycle = false;
        }
    }

    private static void print(String month, String format) {
        if (month == null || month.compareToIgnoreCase(EXIT_FORMAT_PROGRAM) == 0) {
            return;
        }
        System.out.println(String.format(format, month));
    }

    private static String searchMonthByInput(String month) {
        month = month.toLowerCase().trim();
        statusCycle = false;
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY: {
                return WINTER;
            }
            case APRIL:
            case MAY:
            case MARCH: {
                return SPRING;
            }
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER: {
                return AUTUMN;
            }
            case JUNE:
            case JULY:
            case AUGUST: {
                return SUMMER;
            }
            default:
                System.out.println(MESSAGE_INCORRECT_NAME);
                statusCycle = true;
                return null;
        }
    }

    private static String readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month name: ");
        return sc.nextLine();

    }
}
