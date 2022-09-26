public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1, 0 };
    insertionSort(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }

  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      for (int j = i; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
        }
      }
    }
  }

  public static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
}
