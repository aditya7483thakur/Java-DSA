// import org.w3c.dom.Node;

// public class twelve {
//     Node flatten(Node root)
//     {
//         if(root == null){
//             return null;
//         }
//         Node current = root;
//         Node tail = root;
//         Node temp = null;
//         while(tail.next != null){
//             tail = tail.next;
//         }
//         while(current != tail){
//             if(current.bottom != null){
//                 tail.next = current.bottom;
//                 temp = current.bottom;
//                 while(temp.next != null){
//                     temp = temp.next;
//                 }
//                 tail = temp;
//             }
//             current = current.next;
//         }
//         return root;
// }
