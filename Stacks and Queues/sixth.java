// import java.util.Queue;
// import java.util.Stack;

// public class sixth {
// class GfG {
// // Function to reverse first k elements of a queue.
// public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
// Stack<Integer> s = new Stack<>();
// for(int i = 0;i<k;i++){
// s.push(q.poll());
// }
// while(!s.isEmpty()){
// q.offer(s.pop());
// }
// for(int i = 0;i<q.size()-k;i++){
// q.offer(q.poll());
// }
// return q;
// }
// }
// }
