//��û���κ�һ��Ԫ�ؽ���ʱ���������ص�bubblesort 
public class AdvBubbleSort extends GetTime {

	public void runCode(int array[]) {
		boolean swapflag = false;
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
					swapflag = true;
				}
			}
			if (swapflag == false)
				return;
		}
	}

	private static void swap(int[] array, int a, int b)// ���������е�Ԫ����Ҫ�����鱾����ȥ
	{
		array[a] = array[a] + array[b];
		array[b] = array[a] - array[b];
		array[a] = array[a] - array[b];
	}
}
