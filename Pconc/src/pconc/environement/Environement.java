package pconc.environement;

import pconc.pheno.Humidite;
import pconc.pheno.HumiditeBox;
import pconc.pheno.Lumiere;
import pconc.pheno.Pression;
import pconc.pheno.Temp;

public class Environement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumiditeBox humiditeBox = new HumiditeBox();
		Runnable ThHumidite = new Humidite(humiditeBox);  
		Runnable ThLumiere = new Lumiere();  
		Runnable ThPression = new Pression();  
		Runnable ThTemp = new Temp();  
	}

}
