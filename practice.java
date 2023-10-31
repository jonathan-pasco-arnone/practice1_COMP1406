import java.util.Scanner;
import java.util.ArrayList;

public class practice {

    public static void main(String[] args)  {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int currentNum = 0;
        float average = 0;

        Scanner objNum1 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = objNum1.nextInt();
        while (num > 0) {
            // Adds and removes the first value if more than 10 values
            numbers.add(num);
            currentNum++;
            if (currentNum > 10) {
                average = (average * (numbers.size() - 1) - numbers.get(0) + numbers.get(numbers.size() - 1)) / (numbers.size() - 1);
                numbers.remove(0);
            } else {
                average = (average * (numbers.size() - 1) + numbers.get(numbers.size() - 1)) / numbers.size();
            }

            System.out.println("The average of the last 10 numbers is " + average);
            System.out.println("\n\nPlease enter a number: ");
            num = objNum1.nextInt();
        }

    }
}
