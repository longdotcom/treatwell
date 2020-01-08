
import java.util.*;


public class Treatwell
{

    public static void main(String[] args){
        int height = 0;
        int width = 0;
        String continued = "y";
        Scanner scanner = new Scanner(System.in);
        while(continued.equals("y")){

            try{
                System.out.println("\n Please enter height: ");
                height = Integer.parseInt(scanner.nextLine());
                System.out.println("\n Please enter width: ");
                width = Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Needs to be a number!");
            }

            printShapeTwo(height, width);
            System.out.println("\n Do you wish to continue? y/n");
            continued = scanner.nextLine();

        }
    }
    public static void printShapeTwo(int height, int width){
        char topleft = '┌';
        char topright = '┐';
        char bottomleft = '└';
        char bottomright = '┘';
        char horizontal = '─';
        char vertical = '|';

        if(height <2 || width < 2){
            System.out.println("Cannot make a shape with those dimensions");
            return;
        }
        // creates top row of shape
        for(int i = 0; i<width; i++){

            if(i == 0){

                System.out.print(topleft + " ");

            }
            else if(i == width-1){

                System.out.print(topright);

            } 
            else{

                System.out.print(horizontal + " ");

            }   

        }
        
        //creates middle row(s) of shape
        // 
        if(height-2 > 0){
            StringBuilder middle = new StringBuilder();

            for(int i = 0; i<width;i++){

                if(i == 0){

                    middle.append("| ");

                }else if(i == width-1){
                    middle.append("|");
                }
                else{
                    middle.append("  ");
                }

            }

            for(int i = 0; i<height-2;i++){

                if(i == 0){
                    System.out.println("\n" + middle);
                }
                else{
                    System.out.println(middle);
                }

            }
        }else{
            System.out.println("");
        }
        // creates bottom row of shape
        for(int i = 0; i<width; i++){

            if(i == 0){
                
                System.out.print(bottomleft + " ");

            }
            else if(i == width-1){

                System.out.print(bottomright);

            } 
            else{

                System.out.print(horizontal + " ");

            }   

        }

    }
}
