// public class one {
//     class Solution {
//         public ListNode reverseList(ListNode head) {
//             if(head==null || head.next == null){
//                 return head;
//             }
//             ListNode prevNode = head;
//             ListNode currNode = head.next;
//             while(currNode != null){
//                 ListNode nextNode = currNode.next;
//                 currNode.next = prevNode;
    
//                 //update
//                 prevNode = currNode;
//                 currNode = nextNode;
//             }
//             head.next = null;
//             head = prevNode;
//             return head;
//         }
//     }
// }
