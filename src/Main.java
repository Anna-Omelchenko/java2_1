public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676;
        byte bonus = 20;
        int milesEarned = ticketPrice / bonus;
        byte noMiles;
        boolean priceHigherThanBonus = milesEarned >= 1;
        if (priceHigherThanBonus) {
            milesEarned = ticketPrice / bonus;
        } else {
            noMiles = 0;
        }
        System.out.println("Начисленные мили = " + milesEarned);
    }
}