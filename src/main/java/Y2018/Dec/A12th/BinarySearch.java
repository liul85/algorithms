package Y2018.Dec.A12th;

public class BinarySearch {
    public int search(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int recursiveSearch(int[] a, int value) {
        return recursiveSearchInternal(a, 0, a.length - 1, value);
    }

    private int recursiveSearchInternal(int[] a, int low, int high, int value) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] > value) {
            return recursiveSearchInternal(a, low, mid - 1, value);
        } else {
            return recursiveSearchInternal(a, low + 1, high, value);
        }
    }
}
