package LinkedList;

// LinkedList class has all the methods to work with a linkedList
public class LinkedList 
{
	Node head;
	
	// method to insert data at the end ( default )
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else 
		{
			Node temp=new Node();
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	// method to display to linkedlist
	public void show() 
	{
		Node node=new Node();
		node=head;
		try 
		{
			while(node.next!=null)
			{
				System.out.print(node.data);
				System.out.print(" --> ");
				node=node.next;
			}
			System.out.println(node.data);
		} catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("No data Found");
		}
		
	}
	
	// method to insert data at any position of linkedlist
	public void insertAt(int index, int data) 
	{
		Node node=new Node();
		node.data=data;
		
		Node temp=head;
		try 
		{
			for(int i=1;i<index-1;i++)
			{
				temp=temp.next;
			}
			node.next=temp.next;
			temp.next=node;
		} catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Index Not Found");
		}
	}
	
	// method to insert data at beginning of the linkedlist
	public void insertFirst(int data) 
	{
		Node node=new Node();
		node.data=data;
		if (head!=null) 
		{
			node.next=head;
			head=node;
		}
		else 
		{
			head=node;
		}
		
	}
	
	// method to delete last element from the linkedlist
	public void deleteLast() 
	{
		Node temp;
		temp=head;
		if(temp.next!=null)
		{
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
		}
		else 
		{
			head=null;
		}
		
	}
	
	// method to delete element from any position of the linkedlist
	public void deleteAt(int index)
	{
		try 
		{
			if(index>1)
			{
				Node temp;
				temp=head;
				for(int i=1;i<index-1;i++)
				{
					temp=temp.next;
				}
				temp.next=temp.next.next;
				
			}
			if(index==1)
			{
				head=head.next;
			}
		} catch (Exception e) 
		{
			System.out.println("No data Found to Delete");
		}
		
	}
	
	// method to delete data from starting of the linkedlist
	public void delete(int data)
	{
		Node temp;
		temp=head;
		if(temp.data==data)
		{
			head=head.next;
		}
		else 
		{
			while(temp.next!=null)
			{
				if(temp.next.data==data && temp.next.next==null)
				{
					temp.next=null;
					break;
				}
				else if(temp.next.data==data)
				{
					temp.next=temp.next.next;
				}
				temp=temp.next;
			}
			
		}
	}
	
	// method to find the count of node in the linkedlist
	public int len()
	{
		if(head==null)
		{
			return 0;
		}
		Node temp=head;
		int count=1;
		while(temp.next!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	// method to check whether specific element present in the linkedlist or not
	public boolean isFound(int data)
	{
		Node temp=head;
		boolean found=false;
		if(temp.data==data)
		{
			found=true;
			return found;
		}
		while(temp.next!=null)
		{
			if(temp.data==data || temp.next.data==data)
			{
				found=true;
				break;
			}
			
			temp=temp.next;
		}
		return found;
	}


}









