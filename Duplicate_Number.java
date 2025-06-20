import java.util.*;
import java.lang.*;
class Duplicate_Number {
    public static void main(String[] args) {
        int arr[] = {1,2,7,5,5};
        System.out.println(duplicate(arr));
    }
    public static int duplicate(int arr[])
    {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            if(hs.contains(arr[i]))
                return arr[i];
            hs.add(arr[i]);
        }
        return -1;
    }
}
