package projectclassassignment2;

public class AmstrongNumberUpto600 {

	public static void main(String[] args) {

		for(int k=0;k<=600;k++) {
			
			int a=k,i=0,j=0,n=0;
			n=a;
			while(a>0) {
				i=a%10;
				j=j+(i*i*i);
				a=a/10;
				
			}if(n==j) {
				System.out.println(j);
			}
		}
	}

}
