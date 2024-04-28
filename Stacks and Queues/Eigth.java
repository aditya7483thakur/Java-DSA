// import java.util.Stack;

// public class Eigth {
//     class Solution {
//     // Function to convert an infix expression to a postfix expression.
//     public static String infixToPostfix(String exp) {
//         Stack<Character> stack = new Stack<>();
//         StringBuilder result = new StringBuilder("");

//         for(int i = 0;i<exp.length();i++){
//             if(Character.isLetter(exp.charAt(i))){
//                  result.append(exp.charAt(i));
//             }else{
//                 if(exp.charAt(i)=='('){
//                     stack.push(exp.charAt(i));
//                 }else if(exp.charAt(i)==')'){
//                     while(!stack.isEmpty() && stack.peek() != '('){
//                         result.append(stack.pop());
//                     }
//                     // stack.pop();
//                 }else{
//                     while(!stack.isEmpty() && (prec(stack.peek())>prec(exp.charAt(i)) || prec(stack.peek()) == prec(exp.charAt(i)) )){
//                         result.append(stack.pop());
//                     }
//                     stack.push(exp.charAt(i));
//                 }
//             }
//         }
        
//         while(!stack.isEmpty()){
//             result.append(stack.pop());
//         }
        
//         return result.toString();
//     }
    
//     static int prec(char c){
//         if(c=='^'){
//             return 3;
//         }else if(c=='*' || c=='/'){
//             return 2;
//         }else if(c=='+' || c=='-'){
//             return 1;
//         }else{
//             return -1;
//         }
//     }
// }
// }
