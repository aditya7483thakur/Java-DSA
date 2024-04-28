// public class eight {
//     Method - 1;
//     public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
//         if(head.next == null){
//             return null;
//         }
//         int size=0;
//         ListNode currentNode = head;
//         while(currentNode != null){
//             currentNode = currentNode.next;
//             size++;
//         }
//         if(n==size){
//             return head.next;
//         }
//         currentNode = head;
//         int indextosearch = size-n;
//         int i=1;
//         while(i<indextosearch){
//             currentNode = currentNode.next;
//             i++;
//         }
//         currentNode.next = currentNode.next.next;
//         return head;
//     }

//     Method-2
//     class Solution {
//         public ListNode removeNthFromEnd(ListNode head, int n) {
//             ListNode startNode = new ListNode();
//             startNode.next = head;
//             ListNode fast = startNode;
//             ListNode slow = startNode;
//             for(int i = 1;i<=n;i++){
//                 fast = fast.next;
//             }
//             while(fast.next != null){
//                 slow = slow.next;
//                 fast = fast.next;
//             }
//             slow.next = slow.next.next;
//             return startNode.next;
//         }
//     }
// }
