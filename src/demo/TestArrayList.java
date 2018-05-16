/**
 * 
 */
package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author lenovo
 *
 */
public class TestArrayList {

	/**
	 * 数组列表demo
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList();
		a.add(1);//int类型1 自动装箱成integer
		a.add(2);
		a.add(9);
		a.add(5);
		a.add(7);
		a.add(6);
		a.add(8);
		Iterator<Integer> iterator =a.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("---------------下面是数组转化成数组列表之后操作");
		Integer[] b ={1,3,5,4,2,7,6,9,8};
		Arrays.sort(b);//使用数组的方法 将b排序
		for(int t:b){
			System.out.println(t);
		}
		System.out.println("---------------下面是数组转化成数组列表之后操作");
		List bl= Arrays.asList(b);//注：asList方法返回的是一个List，而不是ArrayList类型
		Iterator<Integer> iterator1 =bl.iterator();
		while(iterator1.hasNext()){
			System.out.println(iterator1.next());
		}

	}

}
