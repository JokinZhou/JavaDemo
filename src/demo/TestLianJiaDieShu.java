/**
 * 
 */
package demo;

/**
 * 计算sum=a+aa+aaa+....+a...a
 * 
 *找规律1、没多一个数， 相当于原来总数多加一个a规律 即  sum += a规律
 *a规律本身t  是  a*n个10 +加上之前本身
 * sum
 * @author lenovo
 *
 */
public class TestLianJiaDieShu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lianjia(2,5);

	}
	
	public static void lianjia(int a, int n){
		int t=0,sum=0;//放到for循环外面，不然每次循环都会被初始化
		for(int i=1;i<=n;i++){
			
			t +=a;
			sum +=t;
			a=a *10;
/*			(int) Math.pow(10, n);*/
		}
		System.out.println(sum);
	}

}
