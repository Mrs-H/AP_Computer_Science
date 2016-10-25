/**
 * Average the Values in an Array
 * Create a 100 element int array that 
 * contains random numbers from 1 to 6. 
 * Calculate the average of the values 
 * stored in the array. 
 * Print out “Average value: NN” 
 * where NN is the value of the average.
 */
public class PR_03
{
    public static void main(String[] args)
    {
        //declare the array
        int[] arr = new int[100];
        //declare a variable to hold
        //the sum of the elements
        int sum = 0;
        
        //fill the array with values
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int)(Math.random()*6)+1;
            sum = sum + arr[i];
        }
        
        System.out.println("Average value: " + (sum/arr.length));  
    }
}

