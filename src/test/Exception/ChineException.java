package test.Exception;
/*�쳣����
 * test1�������׳�һ���쳣��
 * test2����������test1�������������쳣����װ������ʱ�쳣�������׳�
 *main������������test2�������������쳣
 */

public class ChineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChineException test =new ChineException();
       try{
    	   test.test2();//main��������test2����
       }catch(Exception e){
    	   e.printStackTrace();//����ʾ�쳣�ĵ�ַ
       }
	}

	public void test1()throws TimeException{
		//�����׳����쳣���͡�TimeException�����⽨��һ���ࣨ�̳�Exception�ࣩ
		throw new TimeException("��������Ļ���");
		/*�׳��쳣.�в����ı���Ҳ��TimeException���вι���������Ӳ�����
		 * ���ڷ������� super���������������á�
		 */
	}
	public void test2(){
		try {
			//try catch�����񼰴����쳣
			test1();                       //����test1����
		} catch (TimeException e) {
			// TODO Auto-generated catch block
	//����һ��RuntimeException�Ķ��󣬵���RuntimeException�ĺ��ι�������
			RuntimeException newExc =new RuntimeException("������");
			/*RuntimeException newExc =new RuntimeException("������");��
			 * ��д����Ĳ���������eʱ��
			 * RuntimeException newExc =new RuntimeException(e)
			 * �����newExc.initCause(e);�򲻱���Ҫ��
			 */
			newExc.initCause(e);
			/*��װ��һ�����쳣�󣬵���initCause()������
			 * �ٽ����׳�������һ��ĵ����ߴ��������������൱�ڱ�����ԭʼ���쳣��Ϣ��
			 * ��ʵ���൱���γ�һ���쳣�������Ժ��������ʾ��ԭʼ���쳣������
			 * ������ܻᶪʧԭʼ���쳣��Ϣ��
			 */
			throw newExc;
		}
	}
}
