public class Exercises {
    public static void main(String[] args) {
        System.out.println("Exercise 1.1");
        System.out.println("Welcome to Java");
        System.out.println("Learning Java now");
        System.out.println("Programming is fun");

        System.out.println("Exercise 1.2");
        int i = 0;
        while (i <= 4) {
            System.out.println("I love Java");
            i++;

        }
        System.out.println("Exercise 1.4");
        System.out.println("a   a^2   a^3   a^4");
        System.out.println("1     1     1     1 ");
        System.out.println("2     4     6     16");
        System.out.println("3     9     27    81");
        System.out.println("4     16    64    256");


        System.out.println("Exercise 1.5");

        System.out.print("(7.5*6.5)-(4.5*3)/(47.5-5.5)=");
        System.out.println((7.5*6.5)-(4.5*3)/(47.5-5.5));


        System.out.println("Exercise 1.6");
        System.out.println("(1+2+3+4+5+6+7+8+9+10)");
        System.out.print(1+2+3+4+5+6+7+8+9+10);


        System.out.println("Exercise 1.12");
        System.out.println("Distance miles 24");
        System.out.println("Distance kilometres to miles * 1.6");
        System.out.println("time travelled 1 hour 40 minutes 35 seconds");

        int distanceinmiles = 24;
        double distanceinkilometres = distanceinmiles*1.6;
        int hours = 1;
        int minutes = 40;
        int seconds = 35;

        int timeinseconds = hours*3600*minutes+seconds;
        System.out.print("time in seconds");
        System.out.println(timeinseconds);
        double timeinhours = (float)timeinseconds/3600;
        System.out.print("time in hours");
        System.out.println(timeinhours);
        double speedinkilometres = distanceinkilometres/timeinhours;
        System.out.print("speed in kmh:");
        System.out.println(speedinkilometres);


















    }
}

