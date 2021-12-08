import  java.io.*;
class area
{
 public static double circlearea(double r)
{
 return Math.PI*r*r;
}
public static double squarearea(double side)
{
 return side*side;
}
public static double rectarea(double width,double height)
{
return width*height;
}
public static double triarea(double base,double height1)
{
return 0.5*base*height1;
}
public static String readLine()
{
String input="";
BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
try
{
input=in.readLine();
}
catch(Exception e)
{
System.out.println("Error"+e);
}
return input;
}
public static void main(String args[])
{
System.out.println("Enter the radius");
Double radius=Double.parseDouble(readLine());
System.out.println("Area of Circle="+circlearea(radius));

 System.out.println("Enter the side");
Double side=Double.parseDouble(readLine());
System.out.println("Area of Square="+squarearea(side));

System.out.println("Enter the width");
Double width=Double.parseDouble(readLine());
System.out.println("Enter the height");
Double  height=Double.parseDouble(readLine());
System.out.println("Area of rectangle="+rectarea(width,height));

System.out.println("Enter the base");
Double base=Double.parseDouble(readLine());
System.out.println("Enter the height");
Double  height1=Double.parseDouble(readLine());
System.out.println("Area of triangle="+triarea(base,height1));
}
}

 