/**
 * 
 */
package demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author lenovo
 *
 */
public class B extends A {

	/**
	 * 
	 */
	public B() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void shuchu(){
		//System.out.println("我是子类B的方法");//如若重写方法里面无内容，则重写后调用子类的该方法的就是空方法
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.shuchu();
		String a= "12345";
		char[] d =a.toCharArray();
		for(int i=d.length-1;i>=0;i--){
			System.out.println(d[i]);
		}
		ArrayList al = new ArrayList();
		
		for(char t:d){
			al.add(String.valueOf(t));//基本数据类型，都可以通过String类的静态方法valueOf()方法进行转换
		}
		
		Collections.reverse(al);//只有这个集合工具类才有反转的方法
		System.out.println(al);

	}

}
