package common_dsa_questions;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int l = 0, r = height.length -1, lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE, ans =0;
		
		while(l < r)
		{
			lmax = Math.max(lmax, height[l]);
			rmax = Math.max(rmax, height[r]);
			ans += (lmax < rmax ? lmax - height[l++]: rmax-height[r--]);
		}
		
		System.out.println(ans);
	}

}
