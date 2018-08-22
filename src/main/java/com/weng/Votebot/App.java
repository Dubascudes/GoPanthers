package com.weng.Votebot;

import java.util.logging.Level;
import org.apache.commons.logging.LogFactory;
import com.gargoylesoftware.htmlunit.html.*;
import com.gargoylesoftware.htmlunit.*;
import java.net.URL;
import java.util.Scanner;

/*
 * Hello world!
 *
 */

public class App
{
	public static void  logon() throws Exception 
	{

		 //Turning off annoying JavaScript warnings. Thats what we do, right? Ignore warnings?
		LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
	    java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF); 
	    java.util.logging.Logger.getLogger("org.apache.commons.httpclient").setLevel(Level.OFF);

	   
	    //making sure this baby runs
       System.out.println( "Hello World!" );
     

	    try
	    {


    		for(int x = 1; x < 100000; x++){
    		    WebClient webClient = new WebClient(BrowserVersion.CHROME);
    		    webClient.getOptions().setThrowExceptionOnScriptError(false);
    	    	HtmlPage login = (HtmlPage) webClient.getPage("http://www.news4jax.com/sports/football-friday/app-game-of-the-week-voting");
    	    	login.getElementById("sgE-4525339-3-2-10002").click();
        		login.getElementById("sg_SubmitButton").click();
	    		//re.handleRefresh(login, url, 0);

	    		System.out.println("another one (number "+x+")");
	    		webClient.close();
	    }

	    } 
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    } finally 
	    {

	    }
	}
	public static void main( String[] args ) throws Exception
    	{ 
			logon();
	    }
    }