import java.util.*;


public class Array {

	
	public static void main(String[] args) {
		 System.out.println("Enter the words:");
	        Scanner s1 = new Scanner(System.in);
	        String b = s1.nextLine(); //ma
	        
	        char[] s = new char[b.length()] ;
	                Set<String> t1 = new HashSet<>();
	        int n = b.length();
	        for (int i = 0, j = 1; i < n; j++, i++) {


	            s[i]=b.charAt(i);

	         
	t1.add(Character.toString(s[i]));
	        }
	       
	       

	        
	        System.out.println("the value of identical is"+t1);
	      
	       
	}

}
