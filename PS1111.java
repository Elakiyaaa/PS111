package PS11;

import java.util.Scanner;

public class PS1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array size");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int count=0;
		System.out.print("enter the first array");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			}
		System.out.print("enter the second array");
		for(int j=0;j<n;j++){
			b[j]=s.nextInt();
		}
		System.out.println("COMMON");
			for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
			if(a[i]==b[j]){
				count++;
				System.out.println(a[i]);
			}
		}
			}
			System.out.println("COUNT IS "+count);
	}
	

	}


