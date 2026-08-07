/*
Find Maximum, Second Maximum, Minimum, and Second Minimum from an Array
This program takes an array of integers as input and identifies:
• the Maximum element,
• the Second Maximum element,
• the Minimum element, and
• the Second Minimum element.
The array must contain at least four distinct elements to determine all four values correctly.
 */

class _02MinMax {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 6, 2, 7, 4, 9 };
        int max = arr[0];
        int second_max = arr[0];

        // max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
        int min = arr[0];
        int second_min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                second_min = min;
                min = arr[i];
            } else if(arr[i] < second_min && arr[i] != min){
                second_min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(second_max);
        System.out.println(min);
        System.out.println(second_min);
    }
}
