package codility;

import java.util.*;

class brackets {
    public int solution(String S) {
        Stack <Character> stack = new <Character> Stack();
        ArrayList <Character> array = new <Character> ArrayList();
        char s;

        array.add('[');
        array.add('{');
        array.add('(');

        for (int i=0; i < S.length(); i++) {

            s= S.charAt(i);

            if (array.contains(s)) {
                stack.push(s);
            }
            else if (s == ']') {
                if (stack.size() ==0 || stack.pop() != '[')
                    return 0;
            }
            else if (s == '}') {
                if (stack.size() ==0 || stack.pop() != '{')
                    return 0;
            }
            else if (s == ')') {
                if (stack.size() ==0 || stack.pop() != '(')
                    return 0;
            }
        }

        if (!stack.isEmpty())
            return 0;

        return 1;
    }
}
