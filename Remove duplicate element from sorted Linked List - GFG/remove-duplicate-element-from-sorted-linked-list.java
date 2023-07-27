//{ Driver Code Starts
/* package whatever; // don't place package name! */
import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class Remove_Duplicate_From_LL
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        GfG g = new GfG();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }}
// } Driver Code Ends


/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	    // Your code here
	    Node res = head;
	    Node ans = head;
	    
	    head = head.next;
	    
	    while(head != null){
	        if(head.data != ans.data){
	            Node temp = new Node(head.data);
	            ans.next = temp;
	            ans = temp;
	            
	        }
	        head = head.next;
	    }
	    
	    
	   // while(head.next != null){
	   //     if(head.data != head.next.data){
	   //         Node temp = new Node(head.data);
	   //         if(ans == null){
	   //             res = ans = temp;
	                
	   //         }
	   //         else{
	   //             ans.next = temp;
	   //             ans = temp;
	   //         }
	   //     }
	   //     head = head.next;
	   // }
	    
	    return res;
	
    }
}