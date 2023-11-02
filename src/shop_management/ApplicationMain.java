package shop_management;

import java.io.IOException;
import java.util.Scanner;

import product_management.ProductManagement;
import user_management.UserManagement;

public class ApplicationMain {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in); 

		boolean canIKeepRunningTheProgram = true;

		System.out.println("**** Welcome to Shop Management *****");
		
		System.out.println("\n");
		System.out.println("Enter login name : ");
		String loginName = scanner.nextLine();
		System.out.println("Enter password : ");
		String password = scanner.nextLine();

		if(!UserManagement.validateUserAndPassword(loginName, password)) 
		{
			System.out.println("!!!!!!!! Login failed. Closing the application");
			return;
		}

		while (canIKeepRunningTheProgram == true) {

			System.out.println("**** Welcome to Shop Management *****");
			System.out.println("\n");
			
			System.out.println("What would you like to do ?");
			System.out.println("1. User Management");
			System.out.println("2. Product Management");
			System.out.println("5. Quit");

			int optionSelectedByUser = scanner.nextInt();

			if (optionSelectedByUser == 1) {				
				UserManagement.userManagement();
			} else if (optionSelectedByUser == 2) {
				ProductManagement.productmanagement();

			} else if (optionSelectedByUser == 5) {
				break;
			}

		}
	}
}
