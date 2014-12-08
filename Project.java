//JFrameMenu code based on JMenuFrame used from X:\lab\John W\OOP2_2014\Sample Programs\Units13_15
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;

public class Project extends JFrame implements ActionListener
{//start of class
	Container cPane;
	JMenu homeMenu;
	JMenu accountMenu;
	JMenu shopMenu;
	JMenu aboutMenu;
	JLabel response;
	JLabel welcomeLabel;
	JLabel transferLabel;
	JButton playstationBtn;
	JButton xboxBtn;
	JButton ipodBtn;
	JButton iphoneBtn;
	JButton footballBtn;
	JButton gaafootballBtn;
	JButton nikeShoesBtn;
	JButton nikeShirtBtn;
	JButton checkOutBtn;
	JButton addAccountBtn;
	JButton account1Btn;
	JButton account2Btn;
	JTextArea aboutArea;

	
	
	public static void main (String args[]){//start of main
		Project frame = new Project();
		frame.setVisible(true);	
               
        }//end of main
	public Project() {//start of constructor
		super("Project");
		setTitle("Home Page");
		setSize(500,500);
		setLocation(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.CYAN);  
		
		
		cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		createHomeMenu();
		createAccountMenu();
		createShopMenu();
		createAboutMenu();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.setBackground(Color.gray);
		menuBar.add(homeMenu);
		menuBar.add(accountMenu);
		menuBar.add(shopMenu);
		menuBar.add(aboutMenu);
		createAboutMenu();
		response = new JLabel();
		cPane.add(response);
		transferLabel = new JLabel("<html> here are your recent transactions:<br> transNo3498053:	53Debit<br>transNo4498445: 		240Credit<br>transNo634954:	650Credit");
		cPane.add(transferLabel);
		transferLabel.setVisible(false);
		
		welcomeLabel = new JLabel("<html>Welcome to your online banking account! <br>From here you can transfer funds from different accounts to yours,<br> as well as shop selected items. Enjoy");
		welcomeLabel.setSize(300,500);
		
		cPane.add(welcomeLabel);
		

	}//end of constructor
	public void actionPerformed(ActionEvent event) {//start of actionPerformed method
		String menuName;
		menuName = event.getActionCommand();
		if(menuName.equals("Quit")){
			System.exit(0);
		}
		
		else if(menuName.equals("Transactions")){
                        setTitle("Transactions");
                        welcomeLabel.setVisible(false);
                        transferLabel.setVisible(true);
		}
		else if(menuName.equals("Transfer")){
            setTitle("Transfer");
			response.setVisible(true);
			response.setText("Choose which account you would like to transfer money from: ");
			createAddAccountMenu();
			if(event.getSource() == addAccountBtn){
				/*AddAccount[] account1 = new AddAccount[3];
		int count=0; 
		
		
		String continyou="Yes";
		
					
		while (continyou.equalsIgnoreCase("Yes")&& count<3){
			
			AddAccount acc1 = new AddAccount();
			
			acc1.setAccountNo(JOptionPane.showInputDialog("Enter Account No: "));
			//acc1.setOwner(JOptionPane.showInputDialog("Enter the name of the owner "));
			acc1.setFunds(Integer.parseInt(JOptionPane.showInputDialog("Enter amount of funds available")));
			
			acc1.setAccountType(enterAccountType());

			JOptionPane.showMessageDialog(null,"\n\n" + acc1.toString());
			
			continyou=JOptionPane.showInputDialog("Continue Yes/No");
			
			account1[count]=acc1;
			count++;
			}//end outer while loop
			System.exit(0);
	}
       /* public static String[] enterAccountType(){
			String []acctype= new String[7];
			int count=0;
			String accountType="Unknown";
			
			while (!accountType.equalsIgnoreCase("")&&count<2){
			accountType = JOptionPane.showInputDialog("Please enter account type: " + (count+1));
			
			if (accountType.equals(""))
				for (int i=count;i<acctype.length-1;i++)acctype[i]=null;
			else
				acctype[count]=accountType;
			count++;
			}//end while
			return acctype;*/

			}//end of action performed metthod
			welcomeLabel.setVisible(false);
			
		}
		
		else if(menuName.equals("Electronics")){
                        setTitle("Shop");
              response.setText("Choose which items you would like to purchase: ");
              createElectronicsButtonMenu();
              if(event.getSource() == xboxBtn || event.getSource() == playstationBtn || event.getSource() == iphoneBtn || event.getSource() == ipodBtn){// getSource method retrieved from http://stackoverflow.com/questions/8214958/the-getsource-and-getactioncommand
              	createCheckOutMenu();
              }
               if(event.getSource() == checkOutBtn){
               	JOptionPane.showMessageDialog(null, "You have paid!");
               }
			welcomeLabel.setVisible(false);
			cPane.revalidate();
		}
		
		else if (menuName.equals("Sports")){
                        setTitle("Shop");
			response.setText("Choose which items you would like to purchase:  ");
			welcomeLabel.setVisible(false);
			createSportsButtonMenu();
			if(event.getSource() == footballBtn || event.getSource() == gaafootballBtn || event.getSource() == nikeShoesBtn || event.getSource() == nikeShirtBtn){
              	createCheckOutMenu();
		}
		else if(event.getSource() == checkOutBtn){
               	JOptionPane.showMessageDialog(null, "You have paid!");
               }
               welcomeLabel.setVisible(false);
			cPane.revalidate();
			
	}
		else if(menuName.equals("Details"))
			displayAbout();
	}
	//Located below are the methods for creating JMenus and JButtons
	
	private void createHomeMenu() {// cretaes Jmenu items for home
		JMenuItem item;
		
		homeMenu = new JMenu("Home Page");
		
		item = new JMenuItem("Quit");
		item.addActionListener(this);
		homeMenu.add( item );
	}
	private void createAccountMenu() {//creates Jmenu items for account
		JMenuItem item;
		
		accountMenu = new JMenu("Account");
		
		item = new JMenuItem("Transactions");
		item.addActionListener(this);
		accountMenu.add( item );
		
		item = new JMenuItem("Transfer");
		item.addActionListener(this);
		accountMenu.add( item );
	}
	private void createShopMenu() {// creates Jmenu items for shop
		JMenuItem item;
		
		shopMenu = new JMenu("Shop");
		
		item = new JMenuItem("Electronics");
		item.addActionListener( this );
		shopMenu.add( item );
		
		item = new JMenuItem("Sports");
		item.addActionListener( this );
		shopMenu.add( item );
		
	}
	private void createAboutMenu() {
		JMenuItem item;
		
		aboutMenu = new JMenu("About");
		item = new JMenuItem("Details");
		item.addActionListener( this );
		aboutMenu.add(item );
	}
	private void createElectronicsButtonMenu() { //creates buttons for electronic items
		
		xboxBtn = new JButton("Xbox");
		cPane.add(xboxBtn);
		xboxBtn.addActionListener( this );
		xboxBtn.revalidate();
		
		playstationBtn = new JButton("Playstation");
		cPane.add(playstationBtn);
		playstationBtn.addActionListener( this );
		playstationBtn.revalidate();
		
		ipodBtn = new JButton("Ipod");
		cPane.add(ipodBtn);
		ipodBtn.addActionListener( this );
		ipodBtn.revalidate();
		
		iphoneBtn = new JButton("Iphone");
		cPane.add(iphoneBtn);
		iphoneBtn.addActionListener( this );
		iphoneBtn.revalidate();
		
	}
	private void createAccountButtonMenu() {// creates account buttons
		account1Btn = new JButton("AccountNo: 23934979: = 500 EUR	");
		cPane.add(account1Btn);
		account1Btn.addActionListener( this );
		
		account2Btn = new JButton("AccountNo: 45476945: = 270 EUR	");
		cPane.add(account2Btn);
		account2Btn.addActionListener( this );
		
		
	}
		private void createSportsButtonMenu() {// sports item buttons
		
		footballBtn = new JButton("Football");
		cPane.add(footballBtn);
		footballBtn.addActionListener( this );
		
		gaafootballBtn = new JButton("GAA Football");
		cPane.add(gaafootballBtn);
		gaafootballBtn.addActionListener( this );
		
		nikeShoesBtn = new JButton("Nike Shoes");
		cPane.add(nikeShoesBtn);
		nikeShoesBtn.addActionListener( this );
		
		nikeShirtBtn = new JButton("Nike Shirt");
		cPane.add(nikeShirtBtn);
		nikeShirtBtn.addActionListener( this );
		
	}				
		private void createCheckOutMenu() {//creates checkout button
			checkOutBtn = new JButton("Check Out");
			cPane.add(checkOutBtn);
			checkOutBtn.addActionListener( this );
		}
		private void createAddAccountMenu() {//creates account button
			addAccountBtn = new JButton("Add account");
			cPane.add(addAccountBtn);
			addAccountBtn.addActionListener( this );
		}
		private void displayAbout() {//method displays jTextArea with details
			aboutArea = new JTextArea();
			
			aboutArea.setText("Author: Leo O' Connell" +
								"\nDescription: Java Project 2014" +
									"\nCourse: OOP 2" +
										"\nLecturer: John Walsh");
			
			cPane.add(aboutArea);
		}
	
}//end of class
	
        
	
