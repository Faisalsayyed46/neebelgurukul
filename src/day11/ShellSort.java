package day11;

public class ShellSort {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 1, 7, 11, 2, 9, 4, -21 };
	shellSort(arr);

	for (int i : arr) {
	    System.out.print(i + " ");
	}
    }

    public static void shellSort(int[] arr) {
	int n = arr.length;
	int j = 0;
	for (int g = n / 2; g >= 1; g = g / 2) {
	    for (int i = g; i < n; i++) {
		int temp = arr[i];
		for (j = i; j >= g && arr[j - g] > temp; j -= g) {
		    arr[j] = arr[j - g];
		}
		arr[j] = temp;
	    }
	}
    }
}