package com.baymin._42_;


/**
 * 反转工具类
 * @author Baymin
 * @date 2016年8月9日
 */
public class ReverseUtils {
	/**
	 * 完全反转
	 * @param ch
	 * @param begin
	 * @param end
	 * @return
	 */
	public static void reverseMethod(char[] ch,int begin,int end){
		if(begin < 0 || end >= ch.length)
			return ;
		while(begin<end){
			char temp = ch[begin];
			ch[begin] = ch[end];
			ch[end] = temp;
			
			begin++;
			end--;
		}
	}
	/**
	 * 反转句子，但不反转单词
	 * @param ch
	 * @return
	 */
	public static void reverseSenteceMethod(char[] ch){
		if(ch==null)
			return ;
		int begin = 0;
		int end = ch.length-1;
		
		reverseMethod(ch, begin, end);
		
		begin = end = 0;
		while(begin<ch.length-1){
			if(ch[begin]==' '){
				begin++;
				end++;
			}else if(ch[end]== ' '){
				reverseMethod(ch, begin, --end);
				begin = ++ end;
			}else if(end==ch.length-1){
				reverseMethod(ch, begin, end);
				break;
			}
			else
				end++;
		}
	}
	/**
	 * 左旋转字符
	 * @param ch
	 * @param n
	 */
	public static void leftRotateString(char[] ch,int n){
		if(ch == null)
			return;
		if(ch.length>0 && n>0 && n<ch.length){
			int firstBegin = 0;
			int firstEnd = n-1;
			int secondBegin = n;
			int secondEnd = ch.length-1;
			
			reverseMethod(ch, firstBegin, firstEnd);
			reverseMethod(ch, secondBegin, secondEnd);
			reverseMethod(ch, firstBegin, secondEnd);
		}
	}
}
