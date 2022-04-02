package org.variable;

public class Variable {
	
	 public int b=52;//instance variable
	
	 public static int c=78;//static variable
	 
	 private void empId() {
		System.out.println("b:"+b );
		b++;
		System.out.println("b:"+b);
		
		System.out.println("c:"+c);
		c++;
		System.out.println("c:"+c);
		

	}
	 
	
	public static void main(String[] args) {
		
         Variable v = new Variable();
         v.empId();
         
         Variable v1 = new Variable();
         v1.empId();
		
         Variable v2 = new Variable();
         v2.empId();
	
		
		
		
		
		
	
	
	}
	

}
