package JavaSolutions;
/*
 * Dominant Number in an Array
 * A dominant number is a number whose frequency of occurrence in an array is
 * strictly greater than the count of unique elements present in that array.
 * You are given an integer array Your task is to identify and return all dominant 
 * numbers from the array.
 */

// for large elements we need to use hashmap
public class _01DominantNumber {
    public static void findDominant(int[] arr) {
        int len = arr.length;
        int freqArr[] = new int[1000]; // assuming there are numbers between 1 to 1000
        int uniqueCount = 0;
        for(int i=0; i<len; i++){
            if(freqArr[arr[i]] == 0){
                uniqueCount++;
            }
            freqArr[arr[i]]++;
        }

        for(int i=0; i<1000; i++){
            if(freqArr[i] > uniqueCount){
                System.err.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 2, 4, 2 };
        findDominant(arr);
    }

}