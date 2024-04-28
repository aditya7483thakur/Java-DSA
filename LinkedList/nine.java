// public class nine {
//     class Solution {
//         public void reorderList(ListNode head) {
//             if(head==null || head.next==null){
//                 return;
//             }
//             ListNode fast = head;
//             ListNode slow = head;
//             ListNode prev = head;
//             //Catching the mid
//             while(fast != null && fast.next != null){
//                 prev = slow;
//                 slow = slow.next;
//                 fast = fast.next.next;
//             }
//             //breaking the previous link with two separate two lists
//             prev.next = null;
//             ListNode l1 = head;
//             ListNode l2 = slow;
//             //reversing the second list
//             ListNode previous = l2;
//             ListNode current = l2.next;
//             while(current != null){
//                 ListNode nextNode = current.next;
//                 current.next = previous;
//                 previous = current;
//                 current = nextNode;
//             }
//             l2.next = null;
//             l2 = previous;
    
//             ListNode temp = l1;
//             int count = 1;
//             while(l1 != null && l2 != null){
//                 if(count%2!=0){
//                     l1 = l1.next;
//                     temp.next = l2;
//                 }
//                 else{
//                     l2 = l2.next;
//                     temp.next = l1;
//                 }
//                 temp = temp.next;
//                 count++;
//             }
//         }
//     }
// }
