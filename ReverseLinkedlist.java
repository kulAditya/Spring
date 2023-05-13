package javaPractice;

public class ReverseLinkedlist {
		
	public static Node ReverseLL(Node head)
	{
		Node p1,p2,p3;
		p1=head;
		p2=p1.next;
		p3=p2.next;
		
			while(p2!=null)
			{
				p2.next=p1;
				p1=p2;
				p2=p3;
				if(p3!=null)
					p3=p3.next;
			}
			head.next=null;
			head=p3;
			
			return head;
	}
	
	
	
	public static void main(String[] args) {
		
		
	}

}
