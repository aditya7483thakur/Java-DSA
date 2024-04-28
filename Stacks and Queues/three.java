// import java.util.LinkedList;
// import java.util.Queue;

// public class three {
//     // Method 1
//     class MyStack {
    
//     Queue<Integer> q1 = new LinkedList<>();
//     Queue<Integer> q2 = new LinkedList<>();

//     public MyStack() {
//     }
    
//     public void push(int x) {
//         q1.add(x);
//     }
    
//     public int pop() {
//         int c =-1;
//         int size = q1.size();
//         for(int i = 0;i<size;i++){
//             if(i==size-1){
//                 c = q1.remove();
//             }
//             else{
//             int a = q1.remove();
//             q2.add(a);
//             }
//         }
//         while(!q2.isEmpty()){
//             int a = q2.remove();
//             q1.add(a);
//         }
//         return c;
//     }
    
//     public int top() {
//         int c =-1;
//         int size = q1.size();
//          for(int i = 0;i<size;i++){
//             if(i==size-1){
//                 c = q1.remove();
//                 q2.add(c);
//             }
//             else{
//             int a = q1.remove();
//             q2.add(a);
//             }
//         }
//         while(!q2.isEmpty()){
//             int a = q2.remove();
//             q1.add(a);
//         }
//         return c;
//     }
    
//     public boolean empty() {
//         return q1.isEmpty();
//     }
// }

//     // Method 2
//     class MyStack {
//         Queue<Integer> q = new LinkedList<>();
       
//        public void push(int x) {
//            q.add(x);
//            int size = q.size();
//            // Rotate the queue to make the newly added element at the front
//            for (int i = 0; i < size - 1; i++) {
//                q.add(q.poll());
//            }
//        }
//        public int pop() {
//            return q.poll();
//        }
//        public int top() {
//            return q.peek();
//        }
       
//        public boolean empty() {
//            return q.isEmpty();
//        }
//    }
// }
