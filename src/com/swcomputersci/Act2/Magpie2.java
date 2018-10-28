package com.swcomputersci.Act2;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Let's have a little chat, shall we?";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	private String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf(" no ") >= 0)
		{
			response = "Why so gosh darn negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else
		{
			response = getAnotherResponse();
		}
		return response;
	}
private String getAnotherResponse()
{
	String response = "";
	if (statement.indexOf(" cat ") >= 0)
		(
				response = "I love cats!!!"
		)
	else if (statement.indexOf ("school" )>= 0
		|| statement.indexOf("class")>=0
		|| statement.indexOf("student")>=0
		|| statement.indexOf("college")>=0
		|| statement.indexOf("homework")>=0
	(
			response = "School can be a lot some times."
	)
	else
	(
			response = getSecondResponse();
			)
	return response;
}
private String getSecondResponce ()
{
	String response = "";
	if (statement.indexOf("sad")>= 0)
		|| statement.indexOf ("bad")>=0
		|| statement.indexOf ("annoying")>=0
		|| statement.indexOf ("boring")>=0
		

}
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, maybe you should write a book about it and see if anyone cares.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm. I literally could care less";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
