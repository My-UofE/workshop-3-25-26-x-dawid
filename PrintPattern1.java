import java.util.Scanner;
public class PrintPattern1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int sizeNum = in.nextInt(); in.nextLine();
        for(int row=sizeNum;row>=0;row--){
            for (int col =1; col<=sizeNum-row;col++){
                System.out.print(col);

            }
            System.out.println("");
        }


    }
}