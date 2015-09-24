package Main;


import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        int[] game = {0, 0, 0, 0, 0, 0};
        int number = 0, f = 0, games = 0;
        int day, month, year;
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();

        games = Integer.parseInt(args[0]);

        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        System.out.println("------Sweet Million--------");
        System.out.println("----Date---" + (month + 1) + "/" + day + "/" + year + "-------\n----Time---" + hour + ":" + minute + " Pm EST-----");

        do {
            for (int i = 0; i <= 5; i++) {
                Random generator = new Random();
                number = generator.nextInt(40);
                game[i] = number;

            }

            Arrays.sort(game);
            for (int k = 0; k < 5; k++) {
                if (game[k] == game[k + 1]) {
                    game[k] = number - 1;
                }

            }
            Arrays.sort(game);
            f++;
            if (f < 10) {
                System.out.printf("  (0" + f + ")");
            } else {
                System.out.printf("  (" + f + ")");
            }
            System.out.printf(" ");
            for (int j = 0; j <= 5; j++) {
                game[j]++;
                if (game[j] < 10) {
                    System.out.printf("0" + game[j] + " ");
                } else {
                    System.out.printf("" + game[j] + " ");
                }

            }
            games--;
            System.out.println("");
        } while (games > 0);
        System.out.println("---(c) New York Lottery ---\n" + "---------------------------");
    }

}
