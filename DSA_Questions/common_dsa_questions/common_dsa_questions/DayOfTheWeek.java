package common_dsa_questions;

public class DayOfTheWeek {

	public static void main(String[] args) {
		
		//int n = 5;
		
		int n = 3;
		
        String str = "";
        
        switch(n) 
        {
            case 0: str = "Sunday"; break;
            case 1: str = "Monday"; break;
            case 2: str = "Tuesday"; break;
            case 3: str = "Wednesday"; break;
            case 4: str = "Thursday"; break;
            case 5: str = "Friday"; break;
            case 6: str = "Saturday"; break;
        }
        System.out.println(str);
	}
}
