class MultiDimArrayDemo {

	public static void main(String[] args) {
	
		String[][] names = {
			{"Mr. ", "Mrs. ", "Ms. "}, 
			{"Smith", "Jones"}
			};
		
		System.out.println(names[0][0] + names[1][0]); // Mr. Smith
		System.out.println(names[0][2] + names[1][1]); // Ms. Jones
		System.out.println(names.length); //Size = 2
		
		/* Evaluation = String[0][1] -> 00=Mr 10=Smith
		   02=Ms 11=Jones	*/
	}
}
		