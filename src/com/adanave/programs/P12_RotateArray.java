package com.adanave.programs;

public class P12_RotateArray {

	public void rotate(int[] nums, int k) {
		if(k > nums.length)
		k=k%nums.length;
		int[] result = new int[nums.length];
		for(int i=0; i < k; i++){
		result[i] = nums[nums.length-k+i];
		}
		int j=0;
		for(int i=k; i<nums.length; i++){
		result[i] = nums[j];
		j++;
		}
		System.arraycopy( result, 0, nums, 0, nums.length );
		
		for(int i=1; i<nums.length;i++) {
		System.out.println(nums[i]);
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray= {'1','2','3','4','5','6','7'};
		P12_RotateArray obj= new P12_RotateArray();
		obj.rotate(numArray,5);
	}

}
