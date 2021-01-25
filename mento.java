package package1;
public class mento{

int a;
int b;
int c;

public void sub(int a, int b)
{
this.a=a;
this.b=b;
 c= a-b;
 System.out.println("the substraction is"+c);
} 
public static void main(String[] args) {
	mento t=new mento();
t.sub(32,12);
}
}