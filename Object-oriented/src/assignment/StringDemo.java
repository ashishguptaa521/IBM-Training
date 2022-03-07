package assignment;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Hello";			//Created in primitive style, Stored in string pool.
		String s2 = new String("Hello"); //Created in object style, Stored in heap.
		String s3 = "Hello";
		
		System.out.println(s1);
		//Compares memory locations
		System.out.println(s1 == s2); // True, because same valued strings share same memory location
		System.out.println(s1 == s3);
		
		//Compares values
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		//String manipulation
		s1 = s1 + " World";
		System.out.println(s1);
		System.out.println(s1 == s2); // False, cuz memory location of s1 has changed after we modify it
		
		//String upper case and lower case
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//String indexing
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		//String slicing
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 6));
		
		
		
		
		

		
	}

}
