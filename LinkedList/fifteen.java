// import org.w3c.dom.Node;

// public class fifteen {
//      Node reversed(Node head){
//         Node prev = head;
//         Node curr = head.next;
//         while(curr != null){
//             Node next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         head.next = null;
//         return prev;
//     }
    
//     Node compute(Node head){
//         head = reversed(head);
//         Node prev = head;
//         Node curr = head.next;
//         int max = prev.data;
//         while(curr != null){
//             if(curr.data >= max){
//                 max = curr.data;
//                 prev = curr;
//                 curr = curr.next;
//             }
//             else{
//                 prev.next = curr.next;
//                 curr = prev.next;
//             }
//         }
//         head = reversed(head);
//         return head;
//     }
// }
