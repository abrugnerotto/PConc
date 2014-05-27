package pconc.pheno;

public class Lumiere extends SuperPhenomene implements Runnable{
	   java.lang.String s = "Lumiere";
	    Thread t ;
	    
	    public Lumiere()    {
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
