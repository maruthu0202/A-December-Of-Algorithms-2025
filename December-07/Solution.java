import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] ops = new String[n];

        for (int i = 0; i < n; i++) {
            ops[i] = sc.next();
        }

        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop();
            } 
            else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } 
            else if (op.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();
                stack.push(last);
                stack.push(last + secondLast);
            } 
            else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        System.out.println(sum);
    }
}
