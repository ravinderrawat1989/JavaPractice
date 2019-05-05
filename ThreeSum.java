package oneMorePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {

		int[] arr={-1, 0, 1, 2, 1, -4};

		
		//System.out.println(get3Sum(arr));
		
		System.out.println(get3SumExactTossum(arr,4));
		//System.out.println(findClosestToSum(arr,0));
		
		//System.out.println(" combinationSumGet  " + combinationSum( new int[]{1,2,3,4},4));
	}
	
	static ArrayList<ArrayList<Integer>> get3Sum(int arr[]){

		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();

		if(arr==null || arr.length==0)
			return null;
		
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length-2;i++){
			
			  
			if(i==0  ||  arr[i] > arr[i-1]){
				
				int j=i+1;
				int k= arr.length-1;
				
				while(j<k){
				
					if(arr[i]+arr[j]+arr[k]==0){
					
						ArrayList<Integer> temp=new ArrayList<Integer>();
						temp.add(arr[i]);temp.add(arr[j]);temp.add(arr[k]);
						list.add(temp);
						j++;
						k--;
					
					
						//REmove duplicates
					
						while(j<k && arr[j]==arr[j-1])
							j++;
					
						while(j<k && arr[k] == arr[k+1])
							k--;
					
					}else if (arr[i] + arr[j] + arr[k] < 0)
						j++;
					else
						k--;
				
					}
				}
		}
		return list;
	}

	

	static ArrayList<ArrayList<Integer>> get3SumExactTossum(int arr[],int val){

		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();

		if(arr==null || arr.length==0)
			return null;
		
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length-2;i++){
			
			  
			if(i==0  ||  arr[i] > arr[i-1]){
				
				int j=i+1;
				int k= arr.length-1;
				
				while(j<k){
				
					if(arr[i]+arr[j]+arr[k]==val){
					
						ArrayList<Integer> temp=new ArrayList<Integer>();
						temp.add(arr[i]);temp.add(arr[j]);temp.add(arr[k]);
						list.add(temp);
						j++;
						k--;
					
					
						//REmove duplicates
					
						while(j<k && arr[j]==arr[j-1])
							j++;
					
						while(j<k && arr[k] == arr[k+1])
							k--;
					
					}else if (arr[i] + arr[j] + arr[k] < val)
						j++;
					else
						k--;
				
					}
				}
		}
		return list;
	}

	
	
	static ArrayList<ArrayList<Integer>> findClosestToSum(int arr[],int val){

		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		
		if(arr ==null || arr.length<3)
			return list;

		int min=Integer.MAX_VALUE;
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-2;i++){
			
			int j=i+1;
			int k=arr.length-1;
			
			while(j<k){
				
				int sum = arr[i]+arr[j]+arr[k];
				
				if(Math.abs(val-sum) < min){
					min=Math.abs(val-sum);
					list.clear();
					ArrayList<Integer> temp= new ArrayList<Integer>();
					temp.add(arr[i]);temp.add(arr[j]);temp.add(arr[k]);
					list.add(temp);
				}
				
				if(sum<val)
					j++;
				else 
					k--;
				
			}
			
		}
		return list;	

		
		
	}

	/*
	 *   Combination Sum

Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
The same repeated number may be chosen from C unlimited number of times.
	 * */
	
	static ArrayList<ArrayList<Integer>> combinationSum(int arr[],int val){
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		
		if(arr==null || arr.length==0)
			return list;
		
		Arrays.sort(arr);
		
		combinationSumGet(arr,4,0,new ArrayList<Integer>(), list);
		return list;
	}
	
	
	
	static void combinationSumGet(int arr[],int target,int j,ArrayList<Integer> cur,ArrayList<ArrayList<Integer>> result){
				
		if(target==0){
			
			ArrayList<Integer> temp=new ArrayList<Integer>(cur);
			result.add(temp);
			System.out.println("added" + temp);
			return;
		}
		
		
		for (int i=j; i<arr.length;i++){
		
			if(target<arr[i])
				return;
			
			cur.add(arr[i]);
			
			System.out.println("i=" + i + " j=" + j +" target="+target + " cur="+cur );
			combinationSumGet(arr,target-arr[i],i,cur,result);
			cur.remove(cur.size()-1);
			
		}
		
	}	
	}	
	


