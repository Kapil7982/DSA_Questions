package common_dsa_questions;

public class CountDuration {

	public static void main(String[] args) {
		
//		int sh = 1;
//        int sm = 44;
//        int eh = 2;
//        int em = 14; 
		
		int sh = 2;
        int sm = 42;
        int eh = 8;
        int em = 23;
        
        int diffm =(eh*60+em)-(sh*60+sm);
        
        int diffh = diffm / 60;
        
        diffm = diffm%60;

        System.out.println(diffh + " " + diffm);

	}

}
