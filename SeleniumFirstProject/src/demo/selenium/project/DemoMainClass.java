package demo.selenium.project;

public class DemoMainClass {

	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		wc.invokeBrowser(); //intiates chrome instance and deletes all cookies
		wc.getTitle();
		wc.navigateCommands();
		wc.closeBrowser();
		System.out.println("Hello");

	}

}
