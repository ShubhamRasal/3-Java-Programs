// This program is used to demonstate URLConnection class
// This class is used to connect to an appropriate site.

import java.io.*;
import java.net.*;
import java.util.*;

class URLConnection
{
	public static void main(String args[])
	{
		URL obj = new URL("http://www.facebook.com/index.html");		
		URLConnection cobj = obj.openConnection();
	}
}