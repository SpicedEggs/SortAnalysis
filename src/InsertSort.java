
public class InsertSort extends GetTime {

	public void runCode(int array[]) {
		int j, notes;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				notes = array[i];
				for (j = i; j > 0 && notes < array[j - 1]; j--) {
					array[j] = array[j - 1];
				}
				array[j] = notes;
			}

		}

	}
}