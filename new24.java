package new24;
import java.util.Scanner;
public class new24 {
	public static void main(String[] args) {
		//WAP search a word inside a string
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the word");
		String word=sc.nextLine();
		String str="Samarth chinnappa satalgaon ";
		int index=str.indexOf("chinnappa");
		if(index==-1) {
			System.out.println("word is not prasent");
		}else {
			System.out.println("world is prasent");
		}
		
		
		//other method
		System.out.print(str.contains("chinnappa"));
		//2nd problem++++++++++++++++++++______________________
		boolean flag=true;
		
		String str2="NBN";
		str2=str2.toLowerCase();
		
		
		
		
		for(int i=0;i<str2.length()/2;i++) {
			if(str2.charAt(i)!=str2.charAt(str2.length()-i-1)) {
				flag=false;
				break;
				
			}
			
			
			
			
			
		}
		if(flag) {
			System.out.println("polindrome");
		}else {
			System.out.println("not polindrome");
		}
		
		//3rd ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		System.out.println("______________");
		String nm="walchad institute of technology";
		
		char[] arr4=nm.toCharArray();
		
		
		for(int i=arr4.length-1;i>=0;i--) {
			System.out.print(arr4[i]);
		}
	}
	}
