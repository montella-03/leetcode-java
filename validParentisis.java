import java.util.Stack;

public class Ques {

    public static void main(String[] args) {
        String name = "[{}]";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '[' || name.charAt(i) == '{' || name.charAt(i) == '(') {
                stack.push(name.charAt(i));
            } else if (!stack.isEmpty() && ((name.charAt(i) == '}' && stack.peek() == '{') ||
                    (name.charAt(i) == ']' && stack.peek() == '[') ||
                    (name.charAt(i) == ')' && stack.peek() == '('))) {
                stack.pop();
            } else
                stack.push(name.charAt(i));

        }
        if (stack.isEmpty()) {
            System.out.println("valid parenthis");
        }
        else
            System.out.println("not valid");
    }
}
