//Based off of code used for animal and animal driver in Solutions under John Walsh file
import javax.swing.JOptionPane;

public class AddAccount{//start of class
	private String accountNo;
	private String[] accountType;
	private String owner;
	private int funds;

	public AddAccount(){
		this("No account number",null,"no owner",0);
	}

	public AddAccount(String accountNo,String[] accountType,String owner,int funds){
		setAccountNo(accountNo);
		setAccountType(accountType);
		set0wner(owner);
		setFunds(funds);
	}//end of class

	// Mutators

	public void setAccountNo(String accountNo){
		this.accountNo = accountNo;
	}

	public void setAccountType(String[] accountType){
		this.accountType = accountType;
	}

	public void set0wner(String owner){
		this.owner= owner;
	}

	public void setFunds(int funds){
		this.funds = funds;
	}

	// Accessors

	public String getAccountNo(){return accountNo;}

	public String[] getAccountType(){return accountType;}

	public String getOwner(){return owner;}

	public int getFunds(){return funds;}

	public String toString(){
		String acctype= "";
		int i;

		if(accountType == null)
			acctype = "Not specified";
		else{
			for(i=0;i<accountType.length;i++){
				if (accountType[i] == "" || accountType[i] == null)
					break;
				else
					acctype += accountType[i] +", ";
			}

			//Remove preceeding comma
			acctype = acctype.substring(0,acctype.length()-2);
		}

		return "AccountNo: " + accountNo + "\nAccountType: " + accountType + "\nOwner: " + owner + "\nFunds: " + funds;
	}
}