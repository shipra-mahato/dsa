import java.util.HashMap;
import java.util.Stack;

public class ValidateParentheses {

    public static void main(String[] args) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        String pattern = "([{}])";
        int i = 0;
        boolean valid = true;
        while (i < pattern.length()) {
            if (map.containsKey(pattern.charAt(i)))
                stack.add(pattern.charAt(i));
            else {
                if (stack.isEmpty()
                        || (!stack.isEmpty() && !map.get(stack.peek()).equals(pattern.charAt(i)))) {
                    valid = false;
                    break;
                }
                stack.pop();
            }
            i++;
        }
        if (valid && stack.size() == 0)
            System.out.println("its a valid string");
        else
            System.out.println("its a not valid string");
    }
}
