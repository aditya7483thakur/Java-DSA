// import org.w3c.dom.Node;

// public class six {
    
// public class Solution
// {
//     1st Approach data is changed
//     public static Node sortList(Node head) {
//         int zeroCount=0 , oneCount=0, twoCount=0;
//         Node current = head;
//         while(current != null){
//             if(current.data == 0){
//                 zeroCount++;
//             }
//             else if(current.data == 1){
//                 oneCount++;
//             }
//             else{
//                 twoCount++;
//             }
//             current = current.next;
//         }

//         current = head;
//         while(current!=null){
//             if(zeroCount != 0){
//                 current.data = 0;
//                 zeroCount--;
//             }
//             else if(oneCount != 0){
//                 current.data = 1;
//                 oneCount--;
//             }
//             else{
//                 current.data = 2;
//                 twoCount--;
//             }
//             current = current.next;
//         }
//         return head;
//     }


//     2nd Approach - In which we have created different linked lists for 0s , 1s, and 2s and then merged it.

//     Node zeroTail = new Node(-1);
//         Node zeroHead = zeroTail;
//         Node oneTail = new Node(-1);
//         Node oneHead = oneTail;
//         Node twoTail = new Node(-1);
//         Node twoHead = twoTail;

//         Node current = head;
//         while(current != null){
//             if(current.data == 0){
//                 zeroTail.next = current;
//                 zeroTail = zeroTail.next;
//             }
//             else if(current.data == 1){
//                 oneTail.next = current;
//                 oneTail = oneTail.next;
//             }
//             else{
//                 twoTail.next = current;
//                 twoTail = twoTail.next;
//             }
//             current = current.next;
//         }

//         if(oneHead.next == null){
//             zeroTail.next = twoHead.next;
//         }
//         else{
//         zeroTail.next = oneHead.next;
//         }
//         oneTail.next = twoHead.next;
//         twoTail.next = null;

//         current = zeroHead.next;
//         return current;
//     }
// }
// }
