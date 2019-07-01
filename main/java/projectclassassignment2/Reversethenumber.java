package projectclassassignment2;

public class Reversethenumber {

	public static void main(String[] args) {
int a=123;
int i=0,j=0;
while(a>0) {
	i=a%10;
	j=(j*10)+i;
	a=a/10;
}
System.out.println(j);
	}

}
