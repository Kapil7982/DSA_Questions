package common_dsa_questions;

public class InterpetSymbols {

	public static void main(String[] args) {
		
		String str = "^@!@";
		
		int n = str.length();
		
		int num = 2;
		
		for(int i=0; i<n; i++) 
        {
            char ch = str.charAt(i);
            
            switch(ch) 
            {
                case '@':
                    num *= 10;
                    break;
                case '!':
                    num += 2;
                    break;
                case '%':
                    num -= 5;
                    break;
                case '^':
                    num *= num;
                    break;
                case '$':
                    num += 37;
                    break;
                default:
                    System.out.println("Invalid operation!");
                    return;
            }
        }

        System.out.println(num);

	}

}
