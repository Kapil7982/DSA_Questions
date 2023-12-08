package common_dsa_questions;

public class MinimumPlatformsRequired {
	    
	    public static void main(String[] args) {
	        
	        int n = 6;
	        String[] arrivalTimes = {"9:00", "9:40", "9:50", "11:00", "15:00", "18:00"};
	        String[] departureTimes = {"9:10", "12:00", "11:20", "11:30", "19:00", "20:00"};

	        int[] arr = new int[n];
	        int[] dep = new int[n];

	        // Convert arrival times to array of integers
	        for (int i = 0; i < n; i++) {
	            String str = arrivalTimes[i];
	            str = str.replace(":", "");
	            arr[i] = Integer.parseInt(str);
	        }

	        // Convert departure times to array of integers
	        for (int i = 0; i < n; i++) {
	            String str = departureTimes[i];
	            str = str.replace(":", "");
	            dep[i] = Integer.parseInt(str);
	        }

	        int arri = 1;
	        int depart = 0;
	        int count = 1;
	        int platf = 1;

	        while (arri < n && depart < n) {
	            if (arr[arri] < dep[depart]) {
	                platf++;
	                arri++;

	                if (platf > count) {
	                    count = platf;
	                }
	            } else {
	                platf--;
	                depart++;
	            }
	        }
	        System.out.println(count);
	    }
	

}
