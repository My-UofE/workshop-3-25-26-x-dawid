import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class SumSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        //System.out.print("Enter your name: ");

        // Read in line from standard input
        //String name = in.nextLine();

        //System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        double startNum = in.nextInt(); in.nextLine(); // Reads in an int from standard input
        
        System.out.print("Please enter the end value: ");
        double endNum = in.nextInt();

        System.out.println("Sequence of squares from " + startNum + " to " + endNum + ":");
        double sumNum = 0;
        double iteration = 0;
        do {
            double squareNum = startNum * startNum;
            sumNum = sumNum + squareNum;
            ++startNum; ++iteration;

        } while(startNum <= endNum );
        double averageNum = sumNum / iteration;
      
        System.out.println(averageNum);
    }

}