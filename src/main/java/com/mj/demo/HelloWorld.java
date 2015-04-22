package main.java.com.mj.demo;

public class HelloWorld {

	public static void main(String[] args) {
		MessageService messageService = new MessageService();
		String message = messageService.getMessage();
		System.out.println(message);
	}

}
