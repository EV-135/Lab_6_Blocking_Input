import java.util.Scanner;
public class RectangleInfo {
    public static void main(String [] args){
        double length=0.0;
        double width=0.0;
        boolean len=false;
        boolean wid=false;
        String trash;
        double pythag =0.0;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("What is the length of the rectangle?");
            if (in.hasNextDouble()){
                length=in.nextDouble();
                len=true;
            }else{
                trash = in.nextLine();
                System.out.println("Your input is invalid, try again.");
            }
        }while(!len);

        do{
            System.out.println("What is the width of the rectangle?");
            if (in.hasNextDouble()){
                width=in.nextDouble();
                wid=true;
            }else{
                trash = in.nextLine();
                System.out.println("Your input is invalid, try again.");
            }
        }while(!wid);

        pythag = Math.sqrt((length*length)+(width*width));
        System.out.println("The area of the rectangle is "+length*width+" units squared, and the perimeter is "+((length*2)+(width*2))+"units");
        System.out.println("The length of the diagonal is "+pythag);
    }
}
