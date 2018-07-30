package janani;
import java.util.Scanner;
public class Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
String str=String.valueOf(n);
String []a=str.split("");
int l=str.length();
for(i=0;i<l;i++){
	System.out.print(a[i]+" ");
}
	}

}
