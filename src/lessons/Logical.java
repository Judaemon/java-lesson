package lessons;
public class Logical {
    public static void main(String[] args) {
        // Logical Operators
        boolean isSunny = true;
        boolean isWarm = true;

        if (isSunny && isWarm) {
            System.out.println("It's a perfect day for a picnic!");
        } else if (isSunny || isWarm) {
            System.out.println("The weather is okay; you can still go outside.");
        } else {
            System.out.println("You might want to stay indoors today.");
        }


        // Comparison Operators
        int myAge = 18;
        int votingAge = 18;


        if (myAge == votingAge) {
            System.out.println("I am eligible to vote.");
        } else {
            System.out.println("I am not eligible to vote.");
        }


        double price = 25.0;
        double discountPrice = 20.0;


        if (price > discountPrice) {
            System.out.println("You can save money by buying now!");
        } else if (price < discountPrice) {
            System.out.println("The discounted price is a good deal.");
        } else {
            System.out.println("The price is the same as the discounted price.");
        }

    }
}
