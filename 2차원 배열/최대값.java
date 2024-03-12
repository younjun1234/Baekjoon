import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int row = 1;
        int col = 1;
        for (int i=1; i < 10; i++) {
            String[] numberRow = sc.nextLine().split(" ");
            for(int j=1; j<10; j++) {
                int n = Integer.parseInt(numberRow[j-1]);
                if (n > max) {
                    max = n;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max + "\n" + row + " " + col);
  
    }
}
