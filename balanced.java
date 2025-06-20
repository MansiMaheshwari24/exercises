import java.util.*;
import java.lang.*;
class balanced {
    public static void main(String[] args) {
        String s = "([{}))";
        System.out.println(balanced_brackets(s));
    }
    public static boolean balanced_brackets(String s)
    {
         Stack<Character> st = new Stack<>();
         if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
             return false;
         for(char c: s.toCharArray())
         {
             if(c=='('||c=='{'||c=='[')
                 st.push(c);
             else {
                 char ch = st.peek();
                 if(!st.empty()&&((c==')'&& ch=='(')||(c=='}'&& ch=='{')||(c==']'&& ch=='[')))
                     st.pop();
                 else
                     return false;
             }
         }
         return st.empty();
    }
}
