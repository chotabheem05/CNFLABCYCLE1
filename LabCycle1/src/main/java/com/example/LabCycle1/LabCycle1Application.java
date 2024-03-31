package com.example.LabCycle1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LabCycle1Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SpringApplication.run(LabCycle1Application.class, args);
		ApplicationContext ac = new ClassPathXmlApplicationContext("csticket.xml");
		Customer cs = (Customer)ac.getBean("customer");
		Ticket t = (Ticket) cs.getTicket();
		
		while (true) {
			System.out.println("1. Insert the details\n 2. Display details\n 3.exit");
			System.out.println("Enter Your Choice");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Enter the customer name");
				cs.setName(sc.next());
				System.out.println("Enter the customer address");
				cs.setAddress(sc.next());
				System.out.println("Enter the ticket number");
				t.setTicno(sc.nextInt());
				System.out.println("Enter the ticket seat no");
				t.setSeatno(sc.nextInt());
				System.out.println("Enter the ticket price");
				t.setPrice(sc.nextInt());
				System.out.println("Enter the ticket type - Economic/Gold/Platinum");
				t.setTicktype(sc.next());
				cs.setTicket(t);
				break;
			case 2:
				System.out.println("Customer Details");
				System.out.println("Name:" + cs.getName() + " " + " Address:" + cs.getAddress());
				System.out.println("Ticket details");
				t = cs.getTicket();
				System.out.println("Tick no: " + t.getTicno());
				System.out.println("Ticket type: " + t.getTicktype());
				System.out.println("Ticker seat no: " + t.getSeatno());
				System.out.println("Ticket price: " + t.getPrice());
				break;
			case 3:
				System.exit(0);
			}

		}
	}

}