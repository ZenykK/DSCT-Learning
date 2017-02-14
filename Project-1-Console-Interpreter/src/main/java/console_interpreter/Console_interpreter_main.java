package console_interpreter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Console;
import java.util.Scanner;

public class Console_interpreter_main {

	//Echo an input message in the console. Syntax: echo <text:String>
	static void echo (String input_message) throws IOException {
		
		/*input_message = xxx.readLine("echo ");*/
		System.out.println("Reply:"+input_message);
	
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
		//String echo = 1234;
		String user_context = user_input.nextLine();
		System.out.println(key_word);
	    System.out.println(user_context);
		//user_input.close();
		if (key_word.equals("echo")) {
			
			System.out.println("Reply:"+user_context);
		}
		else System.out.println("Type a valid command!");
		
	}

}
