        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

        /**
         * Created by Borislav on 11/15/2015.
         */
        public class SoftUniDefence {
            public static void main(String[] args) {
                double totalLiters = 0;
                Scanner sc = new Scanner(System.in);
                String line = sc.nextLine();
                Pattern p = Pattern.compile("([A-Z][a-z]{1,}).*?([A-Z][a-z]*[A-Z]).*?(\\d+)L");
                while (!line.equals("OK KoftiShans")) {
                    Matcher m = p.matcher(line);
                    while(m.find()) {
                        String name = m.group(1);
                        String drink = m.group(2).toLowerCase();
                        int liters = Integer.parseInt(m.group(3));
                        totalLiters += liters;
                        System.out.printf("%s brought %d liters of %s!\n", name, liters, drink);
                    }
                    line = sc.nextLine();
                }
                totalLiters /= 1000.0;
                System.out.printf("%.3f softuni liters", totalLiters);
            }
        }
