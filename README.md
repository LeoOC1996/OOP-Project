//OOP-Project
===========

//Project OOP
//JFrameMenu code based on JMenuFrame used from X:\lab\John W\OOP2_2014\Sample Programs\Units13_15
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener
{
	JMenu homeMenu;
	JMenu accountMenu;
	JMenu shopMenu;
	JLabel response;
	
	public static void main (String args[]){
		String username = "user";
		String password = "password";
		int count = 0;
		Project frame = new Project();
		frame.setVisible(true);
		
		//username = JOptionPane.showInputDialog("Username: ");
		//password = JOptionPane.showInputDialog("Password: ");
		//if(username != username || password != password){
			
			//JOptionPane.showMessageDialog(null,"Username and/or password incorrect! Please try again")
			//count++;
			
		//}
		/*do{
			JOptionPane.showMessageDialog(null,"Username and/or password incorrect! Please try again. Login attempts remaining: " + (3-count));
			username = JOptionPane.showInputDialog("Username: ");
			password = JOptionPane.showInputDialog("Password: ");
			count++;
			
		}while(username != "user" || password != "password");
		
		if(username != username || password != password && (3-count==0)){
			JOptionPane.showMessageDialog(null,"Account compromised....Shutting down");
			System.exit(0);
		}
		else{
		
			frame.setVisible(true);
		}
		//System.exit(0);*/
		
			
	}
	
	public Project() {
		Container cPane;
		//String username;
		//String password;
		//username = JOptionPane.showInputDialog("Username: ");
		//password = JOptionPane.showInputDialog("Password: ");
		//if(username == "t00172464" || password == "programming"){
		//	JOptionPane.showMessageDialog(null,"Username and/or password incorrect! Please try again");
			
		//}
		//else
		setTitle("Login");
		setSize(500,500);
		setLocation(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.CYAN);  
		
		cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		createHomeMenu();
		createAccountMenu();
		createShopMenu();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.setBackground(Color.orange);
		menuBar.add(homeMenu);
		menuBar.add(accountMenu);
		menuBar.add(shopMenu);
		
		response = new JLabel ("Welcome!");
		response.setSize(500,500);
		cPane.add(response);
		
	}
	public void actionPerformed(ActionEvent event) {
		String menuName;
		menuName = event.getActionCommand();
		if(menuName.equals("Quit")){
			System.exit(0);
		}
		else if(menuName.equals("Transactions")){
			response.setText("Account Overview: \n	11/01/09: Paypal 68.77CR\n13/01/09Pay Cheque 212.64	DR \n");
			
			
			//response.setText("Menu Item " + menuName + " was selected");
		//	response.equals(JOptionPane.showMessageDialog(null,"Hello"));
			//System.exit(0);
			
			/*JButton startButton = new JButton("Start");//The JButton name.
		add(startButton);//Add the button to the JFrame.
		startButton.addActionListener(this);//Reads the action.*/

		}
	}
	
	private void createHomeMenu() {
		JMenuItem item;
		
		homeMenu = new JMenu("Home");
		
		item = new JMenuItem("Quit");
		item.addActionListener(this);
		homeMenu.add( item );
	}
	private void createAccountMenu() {
		JMenuItem item;
		
		accountMenu = new JMenu("Account");
		
		item = new JMenuItem("Transactions");
		item.addActionListener(this);
		accountMenu.add( item );
		
		item = new JMenuItem("Transfer");
		item.addActionListener(this);
		accountMenu.add( item );
	}
	private void createShopMenu() {
		JMenuItem item;
		
		shopMenu = new JMenu("Shop");
		
		item = new JMenuItem("Electronics");
		item.addActionListener( this );
		shopMenu.add( item );
		
		item = new JMenuItem("Sports");
		item.addActionListener( this );
		shopMenu.add( item );
		
		item = new JMenuItem("Clothes");
		item.addActionListener( this );
		shopMenu.add( item );
	}
}
