import java.util.*;
import java.lang.*;
class String_anagrams {
    static final int num = 26;
    public static void main(String[] args) {
        String str1 ="geeks";
        String str2 ="eekgsmg";
        System.out.println(anagrams(str1,str2));
    }
    public static boolean anagrams(String str1,String str2)
    {
        str1 = str1.replace(" ","");
        str2 = str2.replace(" ","");
        int n= str1.length();
        int n2 = str2.length();
        if(n!=n2)
            return false;
        int freq[] = new int[num];
        for(int i=0;i<n;i++)
            freq[str1.charAt(i)-'a']++;
        for(int i=0;i<n2;i++)
            freq[str2.charAt(i)-'a']--;
        for(int count : freq)
        {
            if(count!=0)
                return false;
        }
        return true;
    }
}
