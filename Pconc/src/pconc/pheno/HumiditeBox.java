package pconc.pheno;

public class HumiditeBox 
{
	   	java.lang.String s = "HumiditeBox";
	    double humidite;
	   	    	  	
	    public synchronized double transfert(Double humidite)
	    {
	    	if(humidite != null)
	    			this.humidite = humidite;
	    	System.out.println(this.s+" = "+this.humidite);
			return this.humidite;
	    }
}
// la piece : 	transfer(10);
// salle : 		double transfert(null )