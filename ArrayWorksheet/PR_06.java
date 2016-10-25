
/**
 * Find the Maximum Value - 
 * Create a 100 element int array that 
 * contains random numbers from 1 to 500. 
 * Find the maximum value stored in the array. 
 * Print out “The maximum value in the array is NN” 
 * where NN is the value of the maximum.
 */
public class PR_06
{
    public static void main(String[] args)
    {
        //declare the array
        int[] arr = new int[100];
        
        //declare a variable to store the max value
        int max = 0;
        
        //fill the array with values
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int)(Math.random()*500) + 1;
        }
        
        //set max to the value of the first element
        max = arr[0];
        
        //search the array for the maximum value
        for (int i=1; i<arr.length; i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        
        System.out.println("The maximum value in the array is " + max);
    }
}
