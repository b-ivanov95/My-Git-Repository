import java.util.Scanner;

/**
 * Created by Borislav on 11/15/2015.
 */
public class PalatkaKonf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfGuests = sc.nextInt();
        int N = sc.nextInt();
        int bedsAvailable = 0;
        int mealsavailable = 0;

        for (int i = 0; i <= N; i++) {
            String data = sc.nextLine();
            String [] dataArgs = data.split(" ");
            switch(dataArgs[0]) {
                case "tents":
                    if(dataArgs[2].equals("normal")) {
                        bedsAvailable += (Integer.parseInt(dataArgs[1]))*2;
                    }
                    else if(dataArgs[2].equals("firstClass")) {
                    bedsAvailable += (Integer.parseInt(dataArgs[1]))*3;
                }
                    break;
                case "rooms":
                    if (dataArgs[2].equals("single")) {
                        bedsAvailable += Integer.parseInt(dataArgs[1]);
                    }
                    else if(dataArgs[2].equals("double")) {
                            bedsAvailable += (Integer.parseInt(dataArgs[1]))*2;
                    }
                    else if(dataArgs[2].equals("triple")) {
                        bedsAvailable += (Integer.parseInt(dataArgs[1]))*3;
                    }

                    break;
                case "food":
                    if(dataArgs[2].equals("zakuska")) {
                        mealsavailable += 0;
                    }
                    else  {
                        mealsavailable += (Integer.parseInt(dataArgs[1]))* 2;
                    }
                    break;
            }

        }
        if(bedsAvailable >= numberOfGuests) {
        System.out.println(String.format("Everyone is happy and sleeping well. Beds left: %d", bedsAvailable-numberOfGuests));
        }
        else {
            System.out.println(String.format("Some people are freezing cold. Beds needed: %d", numberOfGuests-bedsAvailable));
        }

        if(mealsavailable>=numberOfGuests) {
            System.out.println(String.format("Nobody left hungry. Meals left: %d", mealsavailable-numberOfGuests));
        }
        else if(numberOfGuests > mealsavailable) {
            System.out.println(String.format("People are starving. Meals needed: %d", numberOfGuests-mealsavailable));
        }
    }
}
