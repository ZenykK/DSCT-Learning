package console_interpreter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Console;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Console_interpreter_main {
		
	//Echo an input message in the console. Syntax: echo <text:String>
	static void echo (String input_message) throws IOException {
		
		System.out.println("Reply:"+input_message);
		/**Below I just had fun with <code>swing</code> and displayed reply in a pop-up window.
		*The window will appear below all the other windows.*/
		//JOptionPane.showMessageDialog(null, "Reply:"+input_message);
	
	}
	
	//Ping a socket. Syntax: ping <ip-address/domain>
	/*static void ping (Socket socket) {
		
	}*/
	
	//Login to the server. Syntax: login <username:String> <password:String>
	/*static void login () {
		
	}*/
	
	//Show a list of current users
	/*static void list () {
		
	}*/
	
	//Send a message to selected user. Syntax: msg <name:String> <text:String>
	/*static void msg () {
		
	}*/
	
	//Send a file to the specified user. SYntax: file <destinationUser:String> <filename:String>
	/*static void file () {
		
	}*/
	
	//Terminates the program
	/*static void exit () {
		
	}*/
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Console Interpreter by Zenyk!\nPlease type your input below:\n");
		Scanner user_input = new Scanner (System.in);
		String key_word = user_input.next();
		String user_context = user_input.nextLine();
		System.out.println(key_word);
	    System.out.println(user_context);
		//user_input.close();
		while (true) {
		    try {
				if (key_word.equals("echo") || key_word.equals("Echo") || key_word.equals("ECHO")) {
	
					echo(user_context);
	
				}
	
				else if (key_word.equals("ping") || key_word.equals("Ping") || key_word.equals("PING")) {
	
					//ping(user_context);
	
				}
				
				else if (key_word.equals("login") || key_word.equals("Login") || key_word.equals("LOGIN")) {
					
					//login(user_context);
	
				}
				
				else if (key_word.equals("list") || key_word.equals("List") || key_word.equals("LIST")) {
					
					//list(user_context);
	
				}
	
				else
					System.out.println("Type a valid command!");
			} 
		    
		    catch (IOException e) {
				// TODO: handle exception
		    	System.err.println("Input error!");
		    	System.exit(1);
			}
		}
	}

	//Privates
	private static final String fExit = "exit";
	
}
