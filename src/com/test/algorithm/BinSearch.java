package com.test.algorithm;
/**
 *
 * 〈一句话功能简述〉<br>
 * 二分查找：
 * 1.顺序表
 * 2.有序
 *
 *二分查找的基本思想是将n个元素分成大致相等的两部分，去a[n/2]与x做比较，如果x=a[n/2],则找到x,算法中止；如果x<a[n/2],则只要在数组a的左半部分继续搜索x,如果x>a[n/2],则只要在数组a的右半部搜索x.

时间复杂度无非就是while循环的次数！

总共有n个元素，

渐渐跟下去就是n,n/2,n/4,....n/2^k，其中k就是循环的次数

由于你n/2^k取整后>=1

即令n/2^k=1

可得k=log2n,（是以2为底，n的对数）

所以时间复杂度可以表示O()=O(log2n)

 * @author tukun
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BinSearch {
 /**
  *
  * 功能描述: <br>
  * 递归二分查找
  *
  * @param low
  * @param high
  * @param e 待查值
  * @param a 有序数组
  * @return
  * @see [相关类/方法](可选)
  * @since [产品/模块版本](可选)
  */
private  static  int binSearch1(int low,int high,int e,int a[]){
 
 if(low<=high){
  int mid=(low+high)>>1;
  if(e==a[mid]){
   return mid;
  }else if(e<a[mid]){
   return binSearch1(low,mid-1,e,a);
  }else{
  return binSearch1(mid+1,high,e,a);
  }
 }
 else{
  //找不到 返回-1
  return -1;
 }
}
/**
 *
 * 功能描述: <br>
 * 非递归二分查找
 *
 * @param a
 * @param e
 * @return
 * @see [相关类/方法](可选)
 * @since [产品/模块版本](可选)
 */
private static int binSearch2(int a[],int e){
 int low=0;
 int high=a.length;
 while(low<=high){
  int mid=(low+high)>>1;
 if(e==a[mid]){
  return a[mid];
 }else if(e<a[mid]){
  high=mid-1;
 }
 else{
  low=mid+1;
 }
 
 }

 return -1;
}


public static void main(String []args){
 int a[]={1,3,5,7,9,11};
 int key=5;
 System.out.println("递归二分查找"+key+":"+a[binSearch1(0,a.length,key,a)]);
 System.out.println("非递归二分查找"+key+":"+binSearch2(a,key));
}


}
