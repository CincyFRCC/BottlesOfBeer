import java.util.Scanner;

public class BottlesOfBeer {
    public static void main(String[] args) {
        //Scanner for reading the number of bottles
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of bottles:");
        //Assigning number of bottles
        int bottles = in.nextInt();
        //Store the initial value for number of bottles
        int numberofbottles = bottles;

        //while loop for the number of bottles
        while (bottles >= 0) {
            //if bottle is 1 giving the bottle instead of bottles
            if (bottles == 1) {
                System.out.printf("%d bottle of beer on the wall, %d bottle of beer.\n", bottles, bottles);
            } else System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n", bottles, bottles);

            //decreasing the bottles count
            bottles--;
            //bottle and bottles changes
            if (bottles > 1 || bottles == 0) {
                System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.\n\n", bottles);
            } else if (bottles == 1) {
                System.out.printf("Take one down and pass it around, %d bottle of beer on the wall.\n\n", bottles);
            }
            //last line of the song
            else
                System.out.printf("Go to the store and buy some more, %d bottles of beer on the wall.\n", numberofbottles);
        }
    }
}
