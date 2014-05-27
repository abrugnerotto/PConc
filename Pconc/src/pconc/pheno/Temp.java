package pconc.pheno;

public class Temp extends SuperPhenomene implements Runnable {
	   java.lang.String s = "Temp";
	    Thread t ;
	    
	    public Temp()    {
	        t = new Thread(this) ; 
	        t.start() ;
	    }
	  	    
	    public void run() {
	       
	    	int i = 0;   
	    	for (i = 0; i < 10; i++) {       
	    		System.out.println(this.s+" est : " + i);     
	    	}  
	   }

}
