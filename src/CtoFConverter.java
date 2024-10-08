import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double tempC = 0;
        double tempF = 0;
        boolean num=false;
        String trash;

        do {
            System.out.println("What is the temperature in celsius?");
            if (in.hasNextDouble()){
                tempC = in.nextDouble();
                num=true;
            }
            else{
                trash = in.nextLine();
                System.out.println(trash+" is not a valid input, try again.");
            }

        }while(!num);
        tempF = (tempC * 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit is "+tempF);



    }
}