package sorting;

public class HeapSort {

  private static void buildHeap(int[] a, int n) {
    for (int i = n / 2; i >= 1; --i) {
      heapify(a, n, i);
    }
  }

  public static void heapify(int[] a, int n, int i) {
    int maxPos;
    while (true) {
      maxPos = i;
      if (i * 2 < n && a[i] < a[i * 2]) maxPos = i * 2;
      if (i * 2 + 1 < n && a[maxPos] < a[i * 2 + 1]) maxPos = i * 2 + 1;
      if (i == maxPos) break;
      swap(a, i, maxPos);
      i = maxPos;
    }
  }

  private static void swap(int[] a, int i, int maxPos) {
    int temp = a[i];
    a[i] = a[maxPos];
    a[maxPos] = temp;
  }

  // 0 1 5 6 8 3 78 9 2 44
  // 0 78 44 9 8 3 6 1 2 5

  public static void printArr(int[] a) {
    for (int mem : a) {
      System.out.print(mem + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] a = new int[] {0, 1, 5, 6, 8, 3, 78, 9, 2, 44};

    printArr(a);
    buildHeap(a, a.length - 1);
    printArr(a);
  }

  static class heap {
    int[] members = null;
    int capacity;
    int count;

    public heap(int[] a, int capacity) {
      this.capacity = capacity;
      members = a;
      this.count = 0;
    }
  }
}
