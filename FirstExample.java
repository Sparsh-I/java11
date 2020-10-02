/*
 * FirstExample.java
 * Example of different ways of outputting data to the screen
 * (especially String literals (text between " ")
 * 
 * Note:
 * IBIO <- we use this to abbreviate some longer
 * Java expressions/methods
 */
 
public class FirstExample {
	// special characters:
	// \n = new line
	// \t = tab (usually 4 spaces)
	public static void main(String[] args) {
		IBIO.output("Ayyyy I got it to work");
		IBIO.out("\tHaha Aaryan stupid");
		IBIO.out("\nImagine using Atom");

		/* Output
		--------------------------
		Ayyyy I got it to work
				Haha Aaryan stupid
		Imagine using Atom
		----------------------- */
	}
}
