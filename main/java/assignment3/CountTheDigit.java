package assignment3;

public class CountTheDigit {

	public static void main(String[] args) {
int a=254;
int count=0;
int i=0;
while(a>0) {
	a=a/10;
	count++;
}
System.out.println(count);
	}

}
