
public class QuickSort extends GetTime {
	public void runCode(int array[]) {
		int low = 0;
		int high = array.length - 1;
		QuicklySort(array, low, high);
	}

	void QuicklySort(int array[], int low, int high) {

		if (low < high) {
			int pivotpos = Partition(array, low, high);
			QuicklySort(array, low, pivotpos - 1); // pivotpos��������Ҫ��������
			QuicklySort(array, pivotpos + 1, high);
		}
	}

	int Partition(int array[], int low, int high) {// һ�˲����󣬱���Ԫ�ر�pivotһ��Ϊ��
		int pivot = array[low];
		while (low < high) {
			while (low < high && array[high] >= pivot)
				--high;
			array[low] = array[high];
			while (low < high && array[low] <= pivot)
				++low;
			array[high] = array[low];
		}
		array[low] = pivot;
		return low;
	}
}
