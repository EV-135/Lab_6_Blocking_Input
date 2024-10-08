import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        boolean one=false;
        boolean two=false;
        boolean three=false;
        double galGas = 0.0;
        double gasEff = 0.0;
        double price = 0.0;
        String trash1;
        String trash2;
        String trash3;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("What is the amount of gas in gallons that is in the tank?");
            if (in.hasNextDouble()){
                galGas = in.nextDouble();
                one = true;
            }else{
                trash1 = in.nextLine();
                System.out.println("That is not a valid input, try again.");
            }
        }while(!one);

        do{
            System.out.println("What is the fuel efficiency in miles per gallon?");
            if (in.hasNextDouble()){
                gasEff = in.nextDouble();
                two = true;
            }else{
                trash2 = in.nextLine();
                System.out.println("That is not a valid input, try again.");
            }
        }while(!two);

        do{
            System.out.println("What is the price of gas per gallon?");
            if (in.hasNextDouble()){
                price = in.nextDouble();
                three=true;
            }else{
                trash3 = in.nextLine();
                System.out.println("That is not a valid input, try again.");
            }
        }while (!three);

        System.out.println("The cost to drive 100 miles is $"+ (100/gasEff)*price);
        System.out.println("The car can go "+galGas*gasEff+" miles with a full tank");
    }
}
