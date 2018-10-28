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
			response = "Tell me more about your family. Or don't. Actually, please don't.";
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
	if (statement.indexOf(" pet ") >= 0)
		|| statement.indexOf(" cat ")>=0
		|| statement.indexOf(" dog ")>=0
		|| statement.indexOf(" hamster ")>=0
		|| statement.indexOf(" guinea pig")>=0

		(
				response = "Fun fact: I am allergic to all mammals including humans!!!"
		)
	else if (statement.indexOf ("school" )>= 0
		|| statement.indexOf("class")>=0
		|| statement.indexOf("student")>=0
		|| statement.indexOf("college")>=0
		|| statement.indexOf("homework")>=0
	(
			response = "Oh worm!"
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
	(
			response = "oh? get over it please and thank"
	)
	else
	(
			response = getThirdResponse ()
			)
	return response;


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
			response = "You really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
			response = "I diagnose you with: being one corndog short of a pinic."

		return response;
	}
}
