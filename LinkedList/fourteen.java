// import org.w3c.dom.Node;

// public class fourteen {
//     public static Node reverseDLL(Node  head)
// {
//     Node current = head;
//     Node next = current.next;
    
//     current.prev = next;
//     current.next = null;
    
//     while(next != null){
//         next.prev = next.next;
//         next.next = current;
//         current = next;
//         next = next.prev;
//     }
//     head = current;
//     return current;
// }
// }
