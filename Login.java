import javax.swing.JOptionPane;

public class Login {
	public static void main(String [] args){
		String [] User={"Username1", "User2", "User3", "1", "2","3","4","5"};
		String [] Pass={"Password1", "Pass2", "Pass3", "1", "2","3","4","5"};
		String [] Account={"Admin", "Staff", "Staff", "Student", "Student", "Student", "Student", "Student"};
		boolean loggedin=false;
		int UserIndex;
		do{
			boolean validUser=false;
			boolean correctPass=false;
			int i;
			
			String[] choices = { "Admin", "Student", "Staff"};
			String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);
	
			UserIndex=0;
			for(i=0; i<3;i++){
				String inputUser=JOptionPane.showInputDialog("enter your username");
				for(UserIndex=0;UserIndex<User.length;UserIndex++){
					if(inputUser.equals(User[UserIndex])){
						validUser=true;
						break;
					}
				}
				if(validUser==true){
					break;
				}else{
					JOptionPane.showMessageDialog(null,"Invalid username");
				}
			}
			for(i=i;i<3;i++){
				if(JOptionPane.showInputDialog("enter your Password").equals(Pass[UserIndex])){
					correctPass=true;
					break;
				}
				else{
					JOptionPane.showMessageDialog(null,"Incorrect password");
				}
			}
			if(correctPass==false){
				JOptionPane.showMessageDialog(null, "your account has been locked, please contact an administrator");
				System.exit(0);
			}
			if(input.equals(Account[UserIndex]))
			{
				loggedin=true;
			}
			else{
				JOptionPane.showMessageDialog(null, "Incorrect account type");
			}
		}while(loggedin==false);
		JOptionPane.showMessageDialog(null, "Welcome "+User[UserIndex]+"!");
	}
}

