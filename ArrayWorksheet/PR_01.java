/**
 * Assign the value 3*index-1 to
 * every element in an integer array
 * of length 20.
 */
public class PR_01
{
    public static void main(String[] args)
    {
        //declare the array
        int[] arr = new int[20];
        
        //fill the array with values
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = 3*i - 1;
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
