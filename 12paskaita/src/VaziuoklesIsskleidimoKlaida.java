
public class VaziuoklesIsskleidimoKlaida extends Exception {
	private String priezastis;
	
	public VaziuoklesIsskleidimoKlaida(String priezastis) { 
		this.priezastis = priezastis; 
		}
	public String getPriezastis() { 
		return priezastis; 
		}

}
