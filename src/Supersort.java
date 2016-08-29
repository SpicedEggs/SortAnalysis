
public class Supersort extends GetTime {
	public void runCode(int array[]) throws ArrayIndexOutOfBoundsException {

		int col = 10;
		int[][] shuzu = new int[array.length][col];
		for (int i = 0, j = 0; i < shuzu.length; i++, j = 0) {
			while (j < col) {
				shuzu[i][j] = -1;
				j++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			int j = 0;
			while (shuzu[array[i]][j] != -1)
				j++;
			shuzu[array[i]][j] = array[i];
		}

		for (int i = 0, j = 0, k = 0; k < shuzu.length; j = 0) {
			while (shuzu[i][j] != -1 && j < 10) {
				array[k] = shuzu[i][j];
				j++;
				k++;
			}
			i++;

		}

	}

}
