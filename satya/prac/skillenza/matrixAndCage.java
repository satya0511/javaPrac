package satya.prac.skillenza;
import java.util.*;

class matrixAndCage {
	static long count;
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int n = 0; n < t; n++) { 
            int rows =  sc.nextInt();
            int cols =  sc.nextInt();
            int [][] cells = new int[rows][cols]; 
            long rowWalls =  sc.nextInt();
            long colWalls =  sc.nextInt();
            count=((rowWalls+1)*(colWalls+1));
            System.out.println(count);
            count=0; 
        }

    }
}	