class PrePostDemo {
	
	public static void main(String[] args) {
		
		int i = 3;
		i++;						// add 1 to i
		// prints 4
		System.out.println(i);		// display this number
		
		++i;						// add 1 to i again
		// prints 5
		System.out.println(i);		// display this number
		
		// prints 6
		System.out.println(++i);	// first add 1 to i, then display it
		
		// prints 6
		System.out.println(i++);	// first display i, then after its been displayed, add 1 to i
		
		// prints 7
		System.out.println(i);		// Number 7 
	}
}