package projectclassassignment2;

public class Palindromnumber {

	public static void main(String[] args) {
int i=0,n=0,j=0;
int a=141;
n=a;
while(a>0) {
	i=a%10;
	j=(j*10)+i;
	a=a/10;
}
if(n==j) {
	System.out.println("it is a palindrom");
}
else {
	System.out.println("it is not a palindrom");
}
	}

}
