// import org.w3c.dom.Node;

// public class thirteen {
//     class Solution{
// 	public static Node zigZag(Node head){
// 	    Node currNode = head;
// 	    Node nextNode = head.next;
// 	    int count = 1;
	    
// 	    while(currNode.next != null){
// 	        if(count%2 != 0){
// 	            if(currNode.data<nextNode.data){
// 	                currNode = currNode.next;
// 	                nextNode = nextNode.next;
// 	                count++;
	                
// 	            }else{
// 	                int temp = currNode.data;
// 	                currNode.data = nextNode.data;
// 	                nextNode.data =temp;
// 	                currNode = currNode.next;
// 	                nextNode = nextNode.next;
// 	                count++;
// 	            }
// 	        }else{
// 	            if(currNode.data>nextNode.data){
// 	                currNode = currNode.next;
// 	                nextNode = nextNode.next;
// 	                count++;
// 	            }else{
// 	                int temp = currNode.data;
// 	                currNode.data = nextNode.data;
// 	                nextNode.data =temp;
// 	                currNode = currNode.next;
// 	                nextNode = nextNode.next;
// 	                count++;
// 	            }
// 	        }
// 	    }
// 	    return head;
//     }
// }
// }
