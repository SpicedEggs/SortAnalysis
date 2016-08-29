//This sort  of analysis is trying to analyze some typical sorts by the time when they sort the random numbers

public class SortAnalysis {

	public static void main(String[] args) {
		final int SUM = 100000;
		int[] arr1 = new int[SUM];
		int[] arr2 = new int[SUM];
		int[] arr3 = new int[SUM];
		int[] arr4 = new int[SUM];
		int[] arr5 = new int[SUM];
		int[] arr6 = new int[SUM];
		for (int i = 0; i < SUM; i++) {
			arr1[i] = (int) (Math.random() * SUM);
			// arr1[i]=i;
			arr2[i] = arr1[i];
			arr3[i] = arr1[i];
			arr4[i] = arr1[i];
			arr5[i] = arr1[i];
			arr6[i] = arr1[i];
		}

		// PrintArray.printArray(arr1);

		BubbleSort bubble = new BubbleSort();
		System.out.print("bubble: ");
		bubble.getTime(arr1);
		// PrintArray.printArray(arr1);

		AdvBubbleSort advbubble = new AdvBubbleSort();
		System.out.print("advanced bubble: ");
		advbubble.getTime(arr4);
		// PrintArray.printArray(arr4);

		SelectSort select = new SelectSort();
		System.out.print("select: ");
		select.getTime(arr2);
		// PrintArray.printArray(arr2);

		InsertSort insert = new InsertSort();
		System.out.print("insert: ");
		insert.getTime(arr3);
		// PrintArray.printArray(arr3);

		QuickSort quick = new QuickSort();
		System.out.print("quick: ");
		quick.getTime(arr5);
		// PrintArray.printArray(arr5);

		Supersort sup = new Supersort();
		System.out.print("super: ");
		sup.getTime(arr6);
		// PrintArray.printArray(arr6);

		// System.out.println(Arrays.equals(arr1, arr6));
	}
}
