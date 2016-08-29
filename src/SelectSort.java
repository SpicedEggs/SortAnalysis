
public class SelectSort extends GetTime {

	public void runCode(int array[]) {
		for (int i = 0; i < array.length - 1; i++)// ��Ϊ���һ��û�б�Ҫ�Ƚ�
		{
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min])
					min = j;
			}
			if (min != i)
				swap(array, i, min);
		}
	}

	private static void swap(int[] array, int a, int b)// ���������е�Ԫ����Ҫ�����鱾����ȥ
	{
		array[a] = array[a] + array[b];
		array[b] = array[a] - array[b];
		array[a] = array[a] - array[b];
		// int t =array[a];
		// array[a]=array[b];
		// array[b]=t;
	}
}