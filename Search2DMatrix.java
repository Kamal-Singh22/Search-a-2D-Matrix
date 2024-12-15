public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Treat the matrix as a flattened sorted array
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / cols][mid % cols];

            if (midElement == target) {
                return true; 
            } else if (midElement < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target1 = 3;
        System.out.println("Is target " + target1 + " in the matrix? " + searchMatrix(matrix1, target1)); 

        int[][] matrix2 = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target2 = 13;
        System.out.println("Is target " + target2 + " in the matrix? " + searchMatrix(matrix2, target2)); 
    }
}
