-->Integer to Character 

int a = 1
char b = Integer.toString(a).charAt(0);

-->Character to Integer

char c='1';  
int a=Character.getNumericValue(c);  

OR

char c='1';  
int a=Integer.parseInt(String.valueOf(c));  

--> Integer to String

int i = 11;
String s = Integer.toString(i);


