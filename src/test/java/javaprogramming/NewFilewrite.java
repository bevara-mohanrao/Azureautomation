package javaprogramming;
import java.io.*;
public class NewFilewrite {

	public static void main(String[] args) throws IOException {

		FileWriter filew = new FileWriter("D:\\TestAutomation\\AutomationIntegration\\Mohanfile.txt");
		BufferedWriter bfw = new BufferedWriter(filew);
		
		bfw.write("My name is Mohan rao \n");
		bfw.write("I am practice java programming \n");
		bfw.write("Most of the sample programs completed \n");
		bfw.write("Next step to practice Cypress with API automation \n");
		bfw.write("Next step to practice JAVA selenium with API automation");



		
		System.out.println("Finish writing");
		bfw.close();
		

	}

}
