package simple_1;

public class Testfibonacci {

	public static int fibonacci(int n)  {
	    if(n == 0 || n == 1){
	    	return n;
	    }else{
	    	 int n1=0,n2=1,n3=0;    
	    	for(int i = 2 ; i<n+1 ; i++){
		    	  n3=(n1+n2)%1000000;    
		    	  n1=n2;    
		    	  n2=n3; 	    		
	    	}
	    	return n3;
	    }
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = fibonacci(44);
		System.out.println("Result" + result);

	}

}
