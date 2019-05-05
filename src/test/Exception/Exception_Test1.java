package test.Exception;
/*异常抛出及处理：try  catch  finally
 * 
 */
import java.util.*;
public class Exception_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_Test1 Test =new Exception_Test1();
		int result =Test.test();
		System.out.println("test()方法执行了，结果为："+result);
		

	}
	public int test(){
		Scanner input =new Scanner(System.in);
		try{
			int b =100;
			System.out.println("请输入a的值");
			int a =input.nextInt();
            while(a >0){
            	b = a+b/a;
            	a--;  	
            }
            return b;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("异常报出，a应该为整数值");
			return 0;
		}
		
	}

}
