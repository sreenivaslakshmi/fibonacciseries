package projectclassassignment2;

public class AmstrongNumberAreNot {

	public static void main(String[] args) {
int a=153,n=0,i=0,j=0;
n=a;
while(a>0) {
	i=a%10;
	j=j+(i*i*i);
	a=a/10;
}
if(n==j) {
	System.out.println("it is an amstrong number");
}
else 
{
	System.out.println("it is not an amstrong number");
}
	}

}
