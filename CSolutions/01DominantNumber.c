/*
 * Dominant Number in an Array
 * A dominant number is a number whose frequency of occurrence in an array is
 * strictly greater than the count of unique elements present in that array.
 * You are given an integer array Your task is to identify and return all dominant
 * numbers from the array.
 */

// for large elements we need to use hashmap
#include <stdio.h>

void findDominant(int arr[], int len)
{
    int freqArr[1000] = {0}; // assuming there are numbers between 1 to 1000 and {0} means initialise whole array with 0
    int uniqueCount = 0;
    for (int i = 0; i < len; i++)
    {
        if (freqArr[arr[i]] == 0)
        {
            uniqueCount++;
        }
        freqArr[arr[i]]++;
    }

    for (int i = 0; i < 1000; i++)
    {
        if (freqArr[i] > uniqueCount)
        {
            printf("%d, ", i);
        }
    }
}

void main () {
    int arr[] = {1, 2, 2, 2, 3, 3, 3, 3, 3, 2, 4, 2};
    int len = sizeof(arr) / sizeof(arr[0]);
    findDominant(arr, len);
}