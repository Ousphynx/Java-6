
public class Wilder {
	private String firstname ;
	private boolean aware ;
	
	 // Constructeur
	public Wilder (String firstname, boolean aware) {
        this.firstname = firstname ;
        this.aware = aware;
        }
	

	// Getteur
	 public String getName() {
	        return this.firstname;
	}
	 
	 public boolean isAware() {
	        return this.aware;
	}
	 
	// Setteur
	 public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }
 
	 public void setAware(boolean aware) {
	        this.aware = aware;
	}
	 
	 public  String whoAmI() {
		  
		  if (!this.aware) {return "Je m'appelle " + this.getName() + " et je ne suis pas aware.";}
		  else { return "Je m'appelle " + this.getName() + " et je suis aware.";}
	    }
	 
}