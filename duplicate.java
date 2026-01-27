public class duplicate {

    static boolean hasDuplicate(int[] arr) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};

        if (hasDuplicate(arr))
            System.out.println("Duplicate found");
        else
            System.out.println("No duplicate");
    }
}
