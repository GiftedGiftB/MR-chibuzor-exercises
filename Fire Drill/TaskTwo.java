import java.util.Scanner;
    public class TaskTwo{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int counter = 0;
            int sum = 0;
            int average = 0;

            System.out.print("Enter number of scores: ");
            int userInput = input.nextInt();

            while(counter != userInput) {

                System.out.print("Enter score: ");
                int score = input.nextInt();
                counter++;
                average = userInput / score;
            }
                System.out.print("The average is: " + average);


        
    }


}
