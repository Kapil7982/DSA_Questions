package common_dsa_questions;

public class InsertAndMaximize {

	public static void main(String[] args) {
		
		
//		int n= 5, d= 4;
//		String num = "76543";
		
//		int n = 1,  d = 0;
//		String num = "1";
		
//		int n = 2, d = 5;
//		String num = "44";
		
		int n = 3, d = 6;
		String num = "666";
		
		System.out.println(insertAndMaximize(num, d));

	}

	private static String insertAndMaximize(String num, int d) {
		
		StringBuilder sb = new StringBuilder();

        boolean flag = false;

        for(char ch : num.toCharArray()) 
        {
            int digit = ch - '0';
            
            if(flag || digit >= d) 
            {
                sb.append(ch);
            } 
            else 
            {
                sb.append(d);
                sb.append(ch);
                flag = true;
            }
        }

        if (!flag) {
            sb.append(d);
        }

        return sb.toString();
	}

}
