
public class BubbleSort extends GetTime {

	public void runCode(int array[]) {
		for (int i = array.length - 1; i > 0; i--)
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1])
					swap(array, j, j + 1);
			}
	}

	private static void swap(int[] array, int a, int b)// ���������е�Ԫ����Ҫ�����鱾����ȥ
	{
		array[a] = array[a] + array[b];
		array[b] = array[a] - array[b];
		array[a] = array[a] - array[b];
	}
}
