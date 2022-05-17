package ai.jobiak.instance;

interface Sayable{  
    void say();  
}  

public class InstanceMthodReference {

	public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
	
	public static void main(String[] args) {
		
		 InstanceMthodReference methodReference = new InstanceMthodReference(); // Creating object  
	        // Referring non-static method using reference  
	            Sayable sayable = methodReference::saySomething;  
	        // Calling interface method  
	            sayable.say();  
	            // Referring non-static method using anonymous object  
	            Sayable sayable2 = new InstanceMthodReference()::saySomething; // You can use anonymous object also  
	            // Calling interface method  
	            sayable2.say();  

	}

}
