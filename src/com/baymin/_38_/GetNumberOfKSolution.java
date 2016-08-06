package com.baymin._38_;
/**
 * ���������������г��ֵĴ���
 * @author Baymin
 * @date 2016��8��6��
 */
public class GetNumberOfKSolution {
	/**
	 * ��õ�һ��k
	 * @param data
	 * @param k
	 * @param start
	 * @param end
	 * @return
	 */
	public static Integer getFirstK(int[] data,int k,int start,int end){
		if(data==null){
			System.out.print("The data is ");
			return null;
		}
		int midIndex = (start+end)/2;
		int midData = data[midIndex];
		if(midData==k){
			if((midIndex>0 && data[midIndex-1]!=k) || midIndex==0)
				return midIndex;
			else
				end = midIndex-1;
		}else if(midData>k)
			end = midIndex-1;
		else
			start = midIndex+1;
		return getFirstK(data, k, start, end);
	}
	/**
	 * ������һ��k
	 * @param data
	 * @param k
	 * @param start
	 * @param end
	 * @return
	 */
	public static Integer getLastK(int[] data,int k,int start,int end){
		if(data==null){
			System.out.print("The data is ");
			return null;
		}
		int midIndex = (start+end)/2;
		int midData = data[midIndex];
		if(midData==k){
			if((midIndex<data.length-1 && data[midIndex+1]!=k) || midIndex==data.length-1)
				return midIndex;
			else
				start = midIndex+1;
		}else if(midData<k)
			start=midIndex+1;
		else
			end = midIndex-1;
		return getLastK(data, k, start, end);
	}
	public static int getNumberOfK(int[] data,int k){
		int count = 0;
		if(data!=null && data.length>0){
			int first = getFirstK(data, k, 0, data.length-1);
			int last = getLastK(data, k, 0, data.length-1);
			if(first>-1 && last>-1)
				count = last-first+1;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] data = {1,2,3,3,3,3,4,5};
		System.out.println(getNumberOfK(data, 3));
	}

}
