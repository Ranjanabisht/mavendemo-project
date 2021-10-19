package com.learnmaven.mavendemo;

/**
 * Hello world!
 *
 */
import org.apache.log4j.Logger;
public class App 
{
	final static Logger Logger = org.apache.log4j.Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Logger.debug(new Calculator().Sum(1,2));
    }
}
