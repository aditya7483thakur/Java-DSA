// public class ten {
//     class Solution
// {
//     //Function to remove a loop in the linked list.
//     public static void removeLoop(Node head){
//         Node fast = head;
//         Node slow = head;
//         while(fast != null && fast.next != null){
//             fast = fast.next.next;;
//             slow = slow.next;
//             if(fast == slow){
//                 // break;
//                 slow = head;
//                 while(slow.next != fast.next){
//                 slow=slow.next;
//                 fast = fast.next;
//             }
//             if(slow == head && fast==head){
//                 while(fast.next != slow){
//                 fast = fast.next;
//                 }
//             }
//             fast.next = null;
//             break;
//             }
//         }
//     }
// }
// }
