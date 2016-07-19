package training.oops;

public class SortMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int[][][] arr = new int[][][] { { { 3, 5, 2 }, { 7, 9, 1 }, { 5, 4 } }, { { 33, 2, 5 }, { 5, 3, 7 } },
				{ { 7, 5, 16 }, { 44, 5, 21 }, { 2 } } };

		System.out.println("UnSorted array");
		for (int[][] is : arr) {
			for (int[] is2 : is) {
				System.out.println("");
				for (int i : is2) {
					System.out.print("  " + i);
				}
			}
		}
		//sorting descending
		for (int[][] is : arr) {
			for (int[] is2 : is) {

				for (int i = 0; i < is2.length; i++) {
					int small = is2[i];
					for (int j = 0; j < is2.length - 1; j++) {
						if (small > is2[j]) {
							temp = is2[j];
							is2[j] = small;
							small = temp;
						}
					}
					is2[i] = small;
				}

			}
		}
		//print it
		System.out.println("");
		System.out.println("Sorted array- Descending order");
		for (int[][] is : arr) {
			for (int[] is2 : is) {
				System.out.println("");
				for (int i : is2) {
					System.out.print("  " + i);
				}
			}
		}
		//sorting ascending
		for (int[][] is : arr) {
			for (int[] is2 : is) {

				for (int i = 0; i < is2.length; i++) {
					int large = is2[i];
					for (int j = 0; j < is2.length - 1; j++) {
						if (large < is2[j]) {
							temp = is2[j];
							is2[j] = large;
							large = temp;
						}
					}
					is2[i] = large;
				}

			}
		}
		//print it
		System.out.println("");
		System.out.println("Sorted array- Ascending order");
		for (int[][] is : arr) {
			for (int[] is2 : is) {
				System.out.println("");
				for (int i : is2) {
					System.out.print("  " + i);
				}
			}
		}

	}

}
