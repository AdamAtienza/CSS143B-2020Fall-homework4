package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        // homework
        int x = 0;
        int y = data.length - 1;

        while (x <= y) {
            int m = x + (y - x) / 2;

            if (data[m] == target)
                return m;

            if (data[m] < target)
                x = m + 1;

            else
                y = m - 1;
        }
        return -1;
    }
}
