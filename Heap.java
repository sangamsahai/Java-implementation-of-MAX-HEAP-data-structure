import java.util.ArrayList;

/*This class implements the operation on a MAX HEAP. Where ever I use the word heap here , by that I mean MAX HEAP.
 * */

public class Heap {

	/**
	 * @param args
	 */
	
	public static  ArrayList<Integer> items=new ArrayList<Integer>();//Heap will be represented by this Array List
	
	//Sift up is the operation which is done after any node is added.
	//The node added is the sifted all the way up until the tree represents a MAX HEAP
	public static  void siftUp()
	{
		int current=items.size()-1;
		while(current>0)
		{
			int parent=(current-1)/2;
			if(items.get(parent)<items.get(current)){
				//swap
				int temp=items.get(current);
				items.set(current,items.get(parent));
				items.set(parent,temp);
			}//end of if
			else
			{
				break;
			}
			//move one level up
			current=parent;
		}//end of while
	}
	
	//This function is used when any node is deleted from the top of MAP HEAP.
	//The top element is then replaced by the right most element in the lowest level.
	//Then that node is sifted all the way down untill the tree represents a MAP HEAP
	public static  void siftDown() throws Exception
	{
		
		int current=0;
		
		
		while(current<=items.size()-1)
		{
		int leftChild=(2*current)+1;
		int rightChild=(2*current)+2;
		int locationOfMax=current;
		
		if((leftChild<=items.size()-1) && (rightChild<=items.size()-1))
		{
		if(items.get(rightChild)>items.get(current))locationOfMax=rightChild;
		if(items.get(leftChild)>items.get(current))locationOfMax=leftChild;
		if(locationOfMax!=current)
		{
			//swap
			int temp=items.get(current);
			items.set(current,items.get(locationOfMax));
			items.set(locationOfMax,temp);
		}
		else
		{
			break;
		}
		//move one level down
		current=locationOfMax;
		}//end of inner if
		else
		{
			break;
		}
		}
		
	}
	
	public static int delete() throws Exception
	{
		if(items.isEmpty()==true)
		{
			throw new Exception("The Heap is empty");
		}
		if(items.size()==1)
		{
			return items.remove(0);
		}
		
		int current=0;
		int topValue=items.get(current);
		items.set(current,items.get(items.size()-1));//setting last item as first item
		items.remove(items.size()-1);//removing last item from list
		siftDown();
		return topValue;//returning the deleted value
		
	}
	
	public static void insert(int item)
	{
		items.add(item);
		siftUp();
	}
	
	
	public int size()
	{
		return items.size();
	}
	
	public boolean isEmpty()
	{
		return items.isEmpty();
	}
	
	public String toString()
	{
		return items.toString();
	}
	
//this is the implementation of heap sort algorithm.
	public void heapSort() throws Exception
	{
		int size=items.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(delete());
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	}

}
	