//converting byte array into string
byte[] x=new byte[]{97,98,99,100};
String str=new String(x);
System.out.println(str);

//converting string into byte array
String str="igate";
byte[] x=str.getBytes();
for(byte t:x)
	System.out.println(t);

//converting char array into string
char x[]=new char[]{'i','g','a','t','e'};
String str=new String(x);
System.out.println(str);

//converting string into char array
String str="igate";
char x[]=str.toCharArray();
for(char t:x)
	System.out.println(t);

//charAt() and length()
String str="solutions";
for(int i=0;i<str.length();i++)
	System.out.println(str.charAt(i));

//comparing lexicographically
String str1="iphone";
String str2="ipod";
if(str1.compareTo(str2)==0)
	System.out.println("Equals");
else if(str1.compareTo(str2)>0)
	System.out.println("Biggest string:"+str1);
else
	System.out.println("Biggest string:"+str2);

//searching for a word
String str="igate computer education";
if(str.contains("comp"))
	System.out.println("existed");
else
	System.out.println("Not existed");

//extracting tokens from a complex string
String str="red;black;green;blue;brown";
String x[]=str.split(";");
for(String t:x)
	System.out.println(t);

//Joining tokens
String x[]={"igate","kavali","nellore"};
String str=String.join(";",x);
System.out.println(str);

//repeating the string
String str="igate";
String res=str.repeat(5);
System.out.println("-".repeat(25));
System.out.println(res);
System.out.println("-".repeat(25));

//replacing
String str="hahahahahaha";
String str1=str.replace("ha","ra");
String str2=str.replace("ha","po");
System.out.println(str1);
System.out.println(str2);


//replace
String str="igate computer education";
String res=str.replaceAll(" ","-");
System.out.println(res);


//Checking beginning
String str="Miss. Kumari";
if(str.startsWith("Mr."))
	System.out.println("Male");
else if(str.startsWith("Mrs."))
	System.out.println("Married female");
else if(str.startsWith("Miss."))
	System.out.println("Unmarried female");


//converting other types into string
float x=12.45f;
String str=String.valueOf(x);
System.out.println(str);

//substring indexOf and lastIndexOf
String str="igate computer education";
String res=str.substring(6,14);
System.out.println(res);

String x=str.substring(str.indexOf(' ')+1,str.lastIndexOf(' '));
System.out.println(x);

