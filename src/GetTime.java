/*ģ�巽�����ģʽ�������в�ȷ���Ĳ��ֱ�¶��ȥ������ʵ��*/
abstract class GetTime {

	public final void getTime(int[] array) {
		long before = System.currentTimeMillis();
		runCode(array);
		long after = System.currentTimeMillis();
		System.out.println(after - before);
	}

	public abstract void runCode(int array[]);// ����Ҳ���ã�ֱ�ӳ��󡣳��󷽷�����д������
}