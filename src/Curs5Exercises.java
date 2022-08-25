import java.util.Random;

public class Curs5Exercises {
    public static void main(String[] args) {
        int[] numbers = {39, -894, 6594, 58, 93};
        int number = 55;
        System.out.println("Sum of numbers is: " + sumOfArrayNumbers(numbers));

        System.out.println("Number of odd elements is: " + numberOddElements(numbers));

        System.out.println("Greater numbers than " + number + " are ");
        for (Integer element : greaterNumbers(numbers, number)) {
            if (!(element == null)) {
                System.out.println(element);
            }
        }

        int sumOfDonations = 10000;
        System.out.println(donations(sumOfDonations) + " " + sumOfDonations);

        int limit = 5;
        System.out.println(donationsLimited(sumOfDonations,limit) + " " + sumOfDonations);

        String phrase = "Ieri a plouat mult. Azi e soare. Maine va fi noros.";
        String [] sentences = printSentence(phrase);
        if (printSentence(phrase) == null) {
            System.out.println("The text is null");
        } else {
            for (String sentence : sentences) {
                System.out.println(sentence+".");
            }
            }
    }

    // Sum of numbers from an array of int
    private static int sumOfArrayNumbers(int[] numbers) {
        int sum = 0;
        for (int a : numbers) {
            sum += a;
            }
        return sum;
    }

    // Return number of odds elements
    private static int numberOddElements(int[] numbers) {
        int nr = 0;
        for (int a : numbers) {
            if (a % 2 != 0) {
                nr++;
            }
        }
        return nr;
    }

    // All greater numbers
    private static Integer[] greaterNumbers(int[] numbers, int number) {
        Integer[] elements = new Integer[numbers.length];
        int i = 0;
        for (int element : numbers) {
            if (element > number) {
                elements[i] = element;
                i++;
            }
        }
        return elements;
    }

    // Donations Function
    private static String donations(int sumOfDonations) {
        int donationTotal = 0;
        System.out.println("Donations :");
        while (donationTotal < (sumOfDonations-1)) {
            Random random = new Random();
            int donate = random.nextInt(1,sumOfDonations - donationTotal+2);
            System.out.println(donate);
            donationTotal += donate;
         }
        return "Succes";
    }
    // Donations function with limited subscriptions
    private static String donationsLimited(int sumOfDonations, int limit) {
        int donationTotal = 0;
        System.out.println("Donations :");
        for (int i =0; i<limit; i++) {
            Random random = new Random();
            int donate = random.nextInt(1, sumOfDonations - donationTotal + 2);
            System.out.println(donate);
            donationTotal += donate;
            if (donationTotal == sumOfDonations) break;
        }
        if (donationTotal == sumOfDonations) return "Succes";
        else return "Insucces";
    }
    //Prints sentences in new lines
    private static String [] printSentence(String phrase) {
    if (phrase != null) {
        return phrase.split("\\.");
    } else {
        return null;
    }
    }

}
