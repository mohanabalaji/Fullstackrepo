package polymorphismdemo;

public class Poly1 
{
int i=100;

//overloading

void display(int x)
{
	System.out.println(x*2);
}
void display(String x)
{
	System.out.println(x);
}
void show(String s)
{
	System.out.println("Running from class poly1: "+s);
}
}
