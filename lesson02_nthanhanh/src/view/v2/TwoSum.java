package view.v2;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = new int[] {2,3,7,4,8};
		int target = 6;
		int[] reuslt = getTwoSum(numbers, target);
		System.out.println("2 chỉ số là --> " + 
				Arrays.toString(reuslt));
	}
	
	private static int[] getTwoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
	
}
