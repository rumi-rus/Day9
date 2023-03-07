package exercise05;

import java.util.Scanner;

public class BrowserCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Browser browser=new Browser("yahoo","www.yahoo.com");
        browser.set("insta.com");
        browser.printUrl();
        //BookMark bookMark=new BookMark();
        Browser.BookMark bookMark=browser.new BookMark();// instance of browser class is needed for inner class
        bookMark.output();
        
    Browser b= new Browser("google","www.google.com") {//anonymous inner class of browser
      	
    	public void printBrowser() {
       		System.out.println(browserName);
        	}
       };
       b.printBrowser();
       browser.printBrowser();
       Browser.History history= new Browser.History();//static nested inner class
        history.print();
        Browser.History.printName();
	}

}
