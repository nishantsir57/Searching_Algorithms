import java.io.*;
import java.util.*;
class LinearSearch {
public static int search(int arr[], int element)
	{
	    int length=arr.length;
	    for(int i=0;i<length;i++)
	    {
	        if(element == arr[i])
	        return i;
	    }
	     return -1;
	}
}
