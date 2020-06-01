String s = "Demo";

String s;
s = "Demo";

String obj = new String("Hello");

char arr[] = {'a','b','c','d','e',',f,};
String obj =new String(arr,2,3);
// cde

Methods of String class

String cancat(String obj);
String s1 = "Hello";
String s2 = "World";
String s3;
s3 = s1.concat(s2);	// Hello World
s3 = s1 + s2;








int length();











char charAt(int i);
String s1 = "Hello";
ch = s1.charAt(4);








int compareTo(String obj);











int compareToIgnoreCase(String obj);

boolean equals(String obj);


String s1 = "abc";
String s2 = "abc";
 
if(s1.equals(s2))
{
	System.out.print("Strings are equal");
}
else
{
	System.out.print("Strings are not equal");
}
///////////////////////////////////////////////////
String s1 = "abc";	// 1000
String s2 = "abc";	// //1000
 
if(s1==s2) // 1000 == 1000
{
	System.out.print("Strings are equal");
}
else
{
	System.out.print("Strings are not equal");
}
/////////////////////////////////////////////////

String s1 = new String("abc"); // 1000
String s2 = new String("abc"); //2000
 
if(s1 == s2) // 1000 == 2000
{
	System.out.print("Strings are equal");
}
else
{
	System.out.print("Strings are not equal");
}




s1 = "Hello"
s2 = "Hello World"
boolean startsWith(String obj);
s1.startsWith(s2);

boolean endsWith(String obj);

boolean indexOf(String obj);
s1.indexOf(s2);

String replace(char ch1, char ch2);
s1.replace('a','b');







class String
{
	public String()
	{
	
	}

	public String(char ar[])
	{
	
	}
}







	"MelBo World"






