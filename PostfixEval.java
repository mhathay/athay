import java.util.Stack;

public class PostfixEval {
	private String string;
    private Stack<Character> s;
    public PostfixEval(String iString){
            string = iString;
            s = new Stack<Character>();
            String outputString = "";
            boolean fI = false;
            for(int i = 0;i < string.length();i++){
                    char curChar = string.charAt(i);
                    if(!isOperator(curChar)){
                            outputString += Character.toString(curChar);
                            if(i == (string.length()-1)){
                                    while(!s.empty()){
                                            outputString += s.pop();
                                    }
                            }
                    }else{
                            if(fI){
                                    if(pMin(curChar) && pMin((Character)s.peek())){
                                            outputString += s.pop();
                                            s.push(curChar);
                                            if(i == (string.length()-1)){
                                                    while(!s.empty()){
                                                            outputString += s.pop();
                                                    }
                                            }
                                    }else if(mDiv(curChar) && mDiv((Character)s.peek())){
                                            outputString += s.pop();
                                            s.push(curChar);
                                            if(i == (string.length()-1)){
                                                    while(!s.empty()){
                                                            outputString += s.pop();
                                                    }
                                            }
                                    }else if(pMin(curChar) && mDiv((Character)s.peek())){
                                            outputString += s.pop();
                                            s.push(curChar);
                                            if(i == (string.length()-1)){
                                                    while(!s.empty()){
                                                            outputString += s.pop();
                                                    }
                                            }
                                    }else if(mDiv(curChar) && pMin((Character)s.peek())){
                                            s.push(curChar);
                                            if(i == (string.length()-1)){
                                                    while(!s.empty()){
                                                            outputString += s.pop();
                                                    }
                                            }
                                    }else{
                                            outputString += Character.toString(curChar);
                                            if(i == (string.length()-1)){
                                                    while(!s.empty()){
                                                            outputString += s.pop();
                                                    }
                                            }
                                    }
                            }else{
                                    s.push(curChar);
                                    fI = true;
                            }
                    }
            }
            System.out.println(outputString);
            Stack<String> stack=new Stack<String>();
            try {
            for(int i=0;i<outputString.length();i++) {
            	char cah=outputString.charAt(i);
            	String st=String.valueOf(cah);
            	if(st.equals("+")) {
            		String s=stack.pop().toString();
            		int num=Integer.parseInt(s);
            		String s1=stack.pop().toString();
            		int num1=Integer.parseInt(s1);
            		int result1=0;
            		result1=num1+num;
            		System.out.println(result1);
            		String k=String.valueOf(result1);
            		stack.push(k);
            	}
            	else if(st.equals("-")) {
            		String s=stack.pop().toString();
            		int num=Integer.parseInt(s);
            		String s1=stack.pop().toString();
            		int num1=Integer.parseInt(s1);
            		int result1=0;
            		result1=num1-num;
            		System.out.println(result1);
            		String k=String.valueOf(result1);
            		stack.push(k);
            	}
            	else if(st.equals("*")) {
            		String s=stack.pop().toString();
            		int num=Integer.parseInt(s);
            		String s1=stack.pop().toString();
            		int num1=Integer.parseInt(s1);
            		int result1=0;
            		result1=num1*num;
            		System.out.println(result1);
            		String k=String.valueOf(result1);
            		stack.push(k);
            	}
            	
            	else if(st.equals("/")) {
            		String s=stack.pop().toString();
            		int num=Integer.parseInt(s);
            		String s1=stack.pop().toString();
            		int num1=Integer.parseInt(s1);
            		int result1=0;
            		result1=num1/num;
            		System.out.println(result1);
            		String k=String.valueOf(result1);
            		stack.push(k);
            	}
            	
            	else {
            		stack.push(st);
            	}
            }
            
            String sk=stack.pop().toString();
            int result=Integer.parseInt(sk);
            System.out.println(result);
            }
            catch(NumberFormatException se){
            	se.printStackTrace();
            }
       
    }

    public boolean isOperator(char op){
            switch(op){
                    case '+':
                            return true;
                    case '-':
                            return true;
                    case '/':
                            return true;
                    case '*':
                            return true;
                    case '^':
                            return true;
                    default:
                            return false;
            }
    }

    public boolean pMin(char op){
            switch(op){
                    case '+':
                            return true;
                    case '-':
                            return true;
                    default:
                            return false;
            }
    }

    public boolean mDiv(char op){
            switch(op){
                    case '*':
                            return true;
                    case '/':
                            return true;
                    default:
                            return false;
            }
    }
}
