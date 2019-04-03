import java.io.*;
import java.util.*;
class BinarySearchClass {
public static int binarySearch(int arr[], int element, int left, int right)
	{
	    if(right >= 0)
	   {
	   int mid=left+(right-1)/2;
	   if(arr[mid] == element)
	        return mid;
	    if(arr[mid] > element)
	        return binarySearch(arr, element, 0, mid-1);
	    if(arr[mid] < element)
	        return binarySearch(arr, element, mid+1, right);
	   }
	   return -1;
	}
}
