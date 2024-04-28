// import java.util.Queue;
// import java.util.Stack;

// public class fourth {
// // Method 1
// class GfG{
// //Function to reverse the queue.
// public Queue<Integer> rev(Queue<Integer> q){
// Stack<Integer> s = new Stack<>();
// while(!q.isEmpty()){
// s.push(q.remove());
// }
// while(!s.isEmpty()){
// q.add(s.pop());
// }
// return q;
// }
// }

// Method 2 (using Recurssion)
// class GfG{
// //Function to reverse the queue.
// public void func(Queue<Integer> q){
// if(q.isEmpty()){
// return;
// }
// int a = q.poll();
// rev(q);
// q.add(a);
// }
// public Queue<Integer> rev(Queue<Integer> q){
// func(q);
// return q;
// }
// }
// }
