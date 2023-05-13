package javaPractice;

public class LinkedList {

	Node head;
	public LinkedList()
	{
		head=null;
	}
	
	public LinkedList(Node head)
	{
		
		this.head = head;
	}

	private void add(int data)
	{
		Node record,move;
	
		record=new Node(data);
		
		if(head==null)
			head=record;
		else 
		{
			
			for(move=head;move.next!=null;move=move.next);
			move.next=record;
		}
	}
	
	public void display(Node move)
	{
		 move=head;
		if(head==null)
		{
			System.out.println(" Linked List is empty !!! ");
			return ;
		}
		move=head;
		System.out.println();
		while(move.next!=null)
		{
			System.out.print(move.data+"-->");
			move=move.next;
		}
		System.out.print(move.data);
	}
	public static Node ReverseLL(Node head)
	{
		/*
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
				System.out.println(p3.data);	
			}
			
			head.next=null;
			head=p3;
			
			return head;
			*/
		Node cur=head;
		Node prev=null;
		Node temp=null;
		
		while(cur!=null)
		{
			temp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
		}
			return prev;

	}
	
	
	public static void main(String []args)
	{
		LinkedList ll=new LinkedList();
		ll.add(12);
		ll.add(15);
		ll.add(27);
		ll.add(52);
		ll.add(32);
		ll.add(39);
		ll.add(72);
		
		
		ll.display(ll.head);
		
		Node g=ll. ReverseLL(ll.head);
		
		ll.display(g);
	}
}
