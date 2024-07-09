import java.util.*;
public class anagram {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int f=0;
		char ar1[]=a.toCharArray();
		char ar2[]=b.toCharArray();
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		for(int i=0;i<b.length();i++) {
			if(ar1[i]==ar2[i]) {
				f=1;
			}else {
				break;
			}
		}
		if(f==1) {System.out.print("anagram");
	
		}
}}		


