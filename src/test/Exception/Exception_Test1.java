package test.Exception;
/*�쳣�׳�������try  catch  finally
 * 
 */
import java.util.*;
public class Exception_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_Test1 Test =new Exception_Test1();
		int result =Test.test();
		System.out.println("test()����ִ���ˣ����Ϊ��"+result);
		

	}
	public int test(){
		Scanner input =new Scanner(System.in);
		try{
			int b =100;
			System.out.println("������a��ֵ");
			int a =input.nextInt();
            while(a >0){
            	b = a+b/a;
            	a--;  	
            }
            return b;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("�쳣������aӦ��Ϊ����ֵ");
			return 0;
		}
		
	}

}
