package com.test.algorithm;

public class InsertSort {
	/**
	 * 
	 * 功能描述: <br>
	 * 插入排序 有小到大
	 * 默认前n-1个元素 已排好序  原理同交换排序   
	 * 时间复杂度 O(n^2)
	 *
	 * @param a
	 * @param n
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
  public static void insertSort1(int a[],int n){
	int i=0;
	int j=0;
	int temp=0;
	for(i=1;i<n;i++){
		temp=a[i];
		for(j=i-1;j>=0;j--){
		 if(a[j+1]<a[j]){
			 a[j+1]=a[j];
			 a[j]=temp;
		 }
		}
	}
}
  public static void insertSort2(int a[],int n){
	int i=0;
	int j=0;
	int temp=0;
	for(i=1;i<n;i++){
		temp=a[i];
		for(j=i-1;j>=0;j--){
		 if(a[j+1]>a[j]){
			 a[j+1]=a[j];
			 a[j]=temp;
		 }
		}
	}
}
  public static void main(String []args){
		int a[]={5,6,4,3,1};
		System.out.println("排序前：");
		for(int i=0;i<a.length;i++){
		
			System.out.print(a[i]);
		}
		System.out.print("\n");
		insertSort2(a,a.length);
		System.out.println("排序后：");
		for(int i=0;i<a.length;i++){
		
			System.out.print(a[i]);
		}
	}
}
