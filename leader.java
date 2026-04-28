public class Leaders {
    public static void main(String[] args) {
        int[] arr = {16, 1, 4, 3, 5, 2};

        int max = arr[arr.length - 1];
        System.out.print(max + " "); 

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
    }
}
