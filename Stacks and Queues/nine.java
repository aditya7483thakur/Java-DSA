// import java.util.Stack;

// public class nine {
// class GfG {
// int min = Integer.MAX_VALUE;

// public void push(int a, Stack<Integer> s) {
// if (s.isEmpty()) {
// s.push(a);
// min = a;
// } else if (a < min) {
// s.push((2 * a - min));
// min = a;
// } else {
// s.push(a);
// }
// }

// public int pop(Stack<Integer> s) {
// int a = -1;
// if (s.peek() < min) {
// min = 2 * min - s.pop();
// a = min;
// } else {
// a = s.pop();

// }
// return a;
// }

// public int min(Stack<Integer> s) {
// return min;
// }

// public boolean isFull(Stack<Integer> s, int n) {
// return s.size() == n;
// }

// public boolean isEmpty(Stack<Integer> s) {
// return s.isEmpty();
// }
// }
// }
