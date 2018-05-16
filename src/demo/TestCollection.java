/**
 * 
 */
package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lenovo
 *
 */
public class TestCollection {

	/**
	 * @param <T>
	 * @param args
	 */
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		List<T> list = new ArrayList();
		//Collections.binarySearch(arg0, arg1);
		//用Collections中的syschronizedList后，生成的列表是线程安全的
		List xianchenganquanList=Collections.synchronizedList(list);
		//Collections.synchronizedMap(m)

	}

}
