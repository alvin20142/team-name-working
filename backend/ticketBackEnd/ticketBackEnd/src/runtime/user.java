package runtime;

public class user {
	
	private String name;
	private String type;
	
	private double wallet;
	
	
	public user(String n, String t, double w){
		
		name = n;
		type = t;
		
		wallet = w;
		
	}
	
	
	//returns user's name
	public String getName(){
		
		return name;
		
	}
	
	
	//returns user's type
	public String getType(){
		
		return type;
		
	}
	
	
	//returns wallet value
	public double getWallet(){
		
		return wallet;
		
	}
	
	
	
	//updates the wallet value to newValue if its given a proper value
	public int updateWallet(double newValue){
		
		if(newValue < 0.0 || newValue > 999999.99)
			return -1; // cant give someone a negative balance or too much money
		else{
			
			wallet = newValue;
			return 0; // update passed
			
		}
		
	}
	
	
	
}
