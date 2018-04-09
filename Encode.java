import java.util.Scanner;
import java.util.Stack;

public class Encode {

         static String k="";
		//@SuppressWarnings("unchecked")
		public static void main(String[] args) throws Exception  {
			// TODO Auto-generated method stub
			
			@SuppressWarnings("unused")
			
			String[] st=new String[10];
			@SuppressWarnings("unused")
			int a=1,b=2,c=3;
			String skr=null;
			Stack <String>stack=new Stack<String>();
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a equation including a, b & c:");
			String st1=sc.nextLine();
			int count=0;
			for(int i=0;i<st1.length();i++){
				if(st1.contains("ab") || st1.contains("++") || st1.contains("aa") || st1.contains("ac")||st1.contains("bb") ||
						st1.contains("bc") || st1.contains("--") || st1.contains("+-")||st1.contains("**") || st1.contains("//")||
						st1.contains("*/") || st1.contains("/-") ||st1.contains("/+") || st1.contains("+/")){
					count++;
				}
			}
			if(count>0){
				System.out.println("The equation is invalid");
			}
			else{
				System.out.println("The equation is valid");
				skr="1";
			}
			if(skr!="1"){
				return;
			}
			else{
				st1=st1.replaceAll("a", "1");
				st1=st1.replaceAll("b", "2");
				st1=st1.replaceAll("c", "3");
				char ch[]=st1.toCharArray();
				for(int i=0;i<ch.length;i++){
					String kt=String.valueOf(ch[i]);
					stack.push(kt);
				}
				System.out.println(st1);
			}
			if(!stack.isEmpty()) {
				k=k.concat(stack.pop());
			}
			else {
				System.out.println(k);
			}
			@SuppressWarnings("unused")
			PostfixEval pf=new PostfixEval(st1);
			
			
		}
		

	}

