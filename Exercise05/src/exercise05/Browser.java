package exercise05;

import java.util.ArrayList;
import java.util.Scanner;

public class Browser {
	String browserName;
	public static ArrayList<String> url= new ArrayList<String>();
	
	Browser(String name,String s){
		browserName=name;
		url.add(s);
		}
	public void set(String s) {
		url.add(s);
	}
	public void printUrl() {
		System.out.println(url);
	}
	public void printBrowser() {
		System.out.print(browserName);
	}
	
	public class BookMark{//member inner class
		public ArrayList bookMarked= new ArrayList<String>();
		

		void output() {
			Scanner c = new Scanner(System.in);
			String s;
			System.out.println("enter the url to bookmark:");
            s =c.nextLine();
            for(String in:url) {
            	if(in.equals(s)) {
            		bookMarked.add(s);
            	}
            	
            }
			System.out.println("\nmessage from member inner class and the bookmarks are "+bookMarked);
		}
	}
	
	public static class History{//static inner class
		void print() {
			System.out.println("\nmessage from static inner class and the history is "+url);
		}
		public static void  printName() {
			System.out.println("hello");
		}
	}
}
