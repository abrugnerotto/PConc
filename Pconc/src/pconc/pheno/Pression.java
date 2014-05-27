/**
 * 
 */
package pconc.pheno;

/**
 * @author 13jphillot
 *
 */
public class Pression extends SuperPhenomene implements Runnable {
	   java.lang.String s = "Pression";
	    Thread t ;
	    
	    public Pression()    {
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
