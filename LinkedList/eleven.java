// import org.w3c.dom.Node;

// public class eleven {
//     int intersectPoint(Node head1, Node head2)
// 	{
// 	    int l1 = 0;
// 	    int l2 = 0;
// 	    Node temp1 = head1;
// 	    Node temp2 = head2;
// 	    while(temp1 != null){
// 	        l1++;
// 	        temp1 = temp1.next;
// 	    }
// 	    while(temp2 != null){
// 	        l2++;
// 	        temp2 = temp2.next;
// 	    }
// 	    temp1 = head1;
// 	    temp2 = head2;
// 	    int difference = Math.abs(l1-l2);
// 	    if(l1>=l2){
// 	        for(int i=0;i<difference;i++){
// 	            temp1 = temp1.next;
// 	        }
// 	        while(temp1 != null && temp2 != null){
// 	            if(temp1 == temp2){
// 	                return temp1.data;
// 	            }
// 	            temp1 = temp1.next;
// 	            temp2 = temp2.next;
// 	        }
// 	    }
// 	    else{
// 	        for(int i=0;i<difference;i++){
// 	            temp2 = temp2.next;
// 	        }
// 	        while(temp1 != null && temp2 != null){
// 	            if(temp1 == temp2){
// 	                return temp1.data;
// 	            }
// 	            temp1 = temp1.next;
// 	            temp2 = temp2.next;
// 	        }
// 	    }
// 	    return -1;
// 	}
// }
