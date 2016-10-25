/**
 * Write a description of class PR_02 here.
 */
import java.util.Scanner;

public class PR_02
{
    public static void main(String[] args)
    {
        //declare the array
        int[] arr = new int[5];
        
        //declare a Scanner
        Scanner sc = new Scanner(System.in);
        
        //fill the array with values
        for (int i=0; i<arr.length; i++)
        {
            System.out.println("Enter an integer value:");
            arr[i] = sc.nextInt();
        }
        
        //print out the first element
        System.out.print(arr[0]);
        
        //print out the remaining array 
        //separated by "|"
        for (int i=1; i<arr.length; i++)
        {
            System.out.print("|" + arr[i]);
        }
        
    }
}