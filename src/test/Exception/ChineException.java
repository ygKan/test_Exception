package test.Exception;
/*异常连：
 * test1（），抛出一个异常；
 * test2（），调用test1（），来捕获异常，包装成运行时异常，继续抛出
 *main方法中来调用test2（），来捕获异常
 */

public class ChineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChineException test =new ChineException();
       try{
    	   test.test2();//main方法调用test2方法
       }catch(Exception e){
    	   e.printStackTrace();//来显示异常的地址
       }
	}

	public void test1()throws TimeException{
		//声明抛出的异常类型。TimeException是另外建的一个类（继承Exception类）
		throw new TimeException("四月是你的谎言");
		/*抛出异常.有参数的必须也在TimeException的有参构造器中添加参数，
		 * 并在方法体中 super（。。。）来引用。
		 */
	}
	public void test2(){
		try {
			//try catch来捕获及处理异常
			test1();                       //调用test1（）
		} catch (TimeException e) {
			// TODO Auto-generated catch block
	//创建一个RuntimeException的对象，调用RuntimeException的含参构造器，
			RuntimeException newExc =new RuntimeException("五月雨");
			/*RuntimeException newExc =new RuntimeException("五月雨");中
			 * 不写另外的参数，输入e时：
			 * RuntimeException newExc =new RuntimeException(e)
			 * 下面的newExc.initCause(e);则不被需要，
			 */
			newExc.initCause(e);
			/*包装成一个新异常后，调用initCause()方法，
			 * 再将其抛出给更上一层的调用者处理，它的作用你相当于保存了原始的异常信息。
			 * 其实这相当于形成一个异常链，可以很清楚地显示出原始的异常出处。
			 * 否则可能会丢失原始的异常信息。
			 */
			throw newExc;
		}
	}
}
