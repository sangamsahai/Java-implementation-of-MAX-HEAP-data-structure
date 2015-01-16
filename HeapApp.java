import java.util.Scanner;

/*Keep entering the numbers whic you want to insert in heap.
 * When you are done , enter 'done' and all the elements will be deleted one by one.
 * */
public class HeapApp {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Heap heap=new Heap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter next integer,'done' to stop");
		String line=sc.next();
		while(!line.equals("done"))
		{
			heap.insert(Integer.parseInt(line));
			System.out.println(heap);
			System.out.println("Enter next integer,'done' to stop");
			 line=sc.next();
		}
		//when 'done' is entered by the user, then delete operation is performed on HEAP untill the heap becomes empty
		while(heap.isEmpty()==false)
		{
			int max=heap.delete();
			System.out.println(max+"  "+heap);
		}

	}

}
