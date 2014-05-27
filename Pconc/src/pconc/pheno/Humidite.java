/**
 * 
 */
package pconc.pheno;

/**
 * @author 13jphillot
 *
 */
public class Humidite extends SuperPhenomene implements Runnable {
	   java.lang.String s = "humidite";
	    Thread t ;
	    HumiditeBox humiditeBox;
	    
	    public Humidite(HumiditeBox humiditeBox)    {
	        t = new Thread(this) ; 
	        t.start() ;
	        this.humiditeBox = humiditeBox;
	    }
	  	    
	    public void run() {
	    	
	    	Double i = 0.;   
	    	for (i = 0.; i < 10.; i++) {  
	    		humiditeBox.transfert(i);
	    		System.out.println(this.s+" est : " + i);     
	    	}  
	   }

}
