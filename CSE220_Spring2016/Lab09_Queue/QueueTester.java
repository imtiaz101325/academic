class QueueTester{

	public static void main(String[] args) throws Exception{
		
		ArrayQueue a = new ArrayQueue();
		ListQueue l = new ListQueue();

		//array queue

		System.out.println("***********************Array*****************");

		System.out.println("Size: "+a.size());
		System.out.println("Epmtiness: "+a.isEmpty());
 
		a.enqueue(10);
		a.enqueue(20);
		a.enqueue(30);
		a.enqueue(40);
		a.enqueue(50);

		System.out.println(a.toString());

		a.dequeue();
		a.dequeue();
		System.out.println(a.toString());

		System.out.println(a.peek());

		System.out.println("Searching for 50..");
		System.out.println("Found at: "+a.search(50));



		//list queue

		System.out.println("***************************List**********************");

		System.out.println("Size: "+l.size());
		System.out.println("Epmtiness: "+l.isEmpty());

		l.enqueue(10);
		l.enqueue(20);
		l.enqueue(30);
		l.enqueue(40);
		l.enqueue(50);

		System.out.println(l.toString());

		l.dequeue();
		l.dequeue();
		System.out.println(l.toString());

		System.out.println(l.peek());

		System.out.println("Searching for 50..");
		System.out.println("Found at: "+l.search(50));


	}
}