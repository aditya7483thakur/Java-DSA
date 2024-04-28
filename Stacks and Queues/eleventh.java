// public class Eleventh {
//     import java.util.Stack;
// class HelloWorld {
//     public static void main(String[] args) {
//         String a = "((a+b)+(c+d)) ";
//         Stack<Character> stack = new Stack<>();
//         int count = 0;
//         boolean duplicate = false;

//         for(int i = 0;i<a.length();i++){
//             if(a.charAt(i)==')'){
//                 while(stack.peek()!='('){
//                     count++;
//                     stack.pop();
//                 }
//                 stack.pop();
//                 if(count==0){
//                     duplicate = true;
//                     break;
//                 }
//                 count=0;
//             }else{
//                 stack.push(a.charAt(i));
//             }
//         }
//         if(duplicate){
//         System.out.println("Duplicate");
//         }else{
//         System.out.println("Not Duplicate");
//         }
//     }
// }
// }
