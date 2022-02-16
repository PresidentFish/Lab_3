
package com.mycompany.lab_3;


public class driver {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
  
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static int linearSearch(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    
    
    
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    
    
    // Driver method to test above
    public static void main(String args[])
    {
        driver ob = new driver();
        int arr[] = {7, 2, 5, 1, 9, 11, 3};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr); 
        int x =0;
        
        
        //start linear search
        int result = linearSearch(arr, x);
        if (result == 1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at index "
                             + result);
        
       
        //start binary search
        int result2 = ob.binarySearch(arr, x);
        if (result2 == 1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                               + "index " + result2);
    }
    
    
    
    
}
