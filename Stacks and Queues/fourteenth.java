// import java.util.Stack;

// public class fourteenth {
//     class GfG{
    
//     void correct_position(Stack<Integer> s,int x){
//         if(s.isEmpty() || s.peek()<x){
//             s.push(x);
//         }
//         else{
//             int a = s.pop();
//             correct_position(s,x);
//             s.push(a);
//         }
//     }
    
//     void popper(Stack<Integer> s){
//         while(!s.isEmpty()){
//             int x = s.pop();
//             popper(s);
//             correct_position(s,x);
//         }
//     }
    
// 	public Stack<Integer> sort(Stack<Integer> s)
// 	{
// 	    popper(s);
// 	    return s;
// 	}
// }
// }
