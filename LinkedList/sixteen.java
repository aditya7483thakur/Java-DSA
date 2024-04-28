// import org.w3c.dom.Node;

// public class sixteen {
//     class Solution{
//     Node divide(int N, Node head){
//         Node lasteven = new Node(-1);
//         Node lastodd = new Node(-1);
//         Node templastodd = lastodd;
//         Node templasteven = lasteven;
//         Node curr = head;
//         while(curr != null){
//             if(curr.data % 2 == 0){
//                 templasteven.next = curr;
//                 templasteven = templasteven.next;
//             }
//             else{;
//                 templastodd.next = curr;
//                 templastodd = templastodd.next;
//             }
//             curr = curr.next;
//         }
//         templasteven.next = lastodd.next;
//         templastodd.next = null;
//         return lasteven.next;
//     }
// }
// }
