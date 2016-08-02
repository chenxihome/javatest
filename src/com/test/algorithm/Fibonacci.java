package com.test.algorithm;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * Fibonacci数列的实现-----要求输入序号 n 返回 相应的数列 
 * Fibonacci数列:0 1 1 2 3 5 8 13 21 34 ... 
 * 归纳:
 * 数列个数为n
 * F(0)=0
 * F(1)=1
 * 当n>1 
 * F(n)=F(n-2)+F(n-1)
 *
 * @author tukun
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Fibonacci {
public static void main(String []args){
	
}

private  int  getFibonacci(int n) throws Exception{
	if(n==0){
		return 0;
	}else if(n==1){
		return 1;
	}else if(n>1){
		return getFibonacci(n-1)+getFibonacci(n-2);
	}else{
		   throw new Exception("IllegalArgument value for n,please enter n>=0 ");
	}
}
}