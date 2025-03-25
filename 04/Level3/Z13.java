import java.util.Random;

public class Z13 {

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication.");
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        throw new IllegalArgumentException("Matrix is not 2x2.");
    }

    public static int determinant3x3(int[][] matrix) {
        if (matrix.length == 3 && matrix[0].length == 3) {
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                    - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                    + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }
        throw new IllegalArgumentException("Matrix is not 3x3.");
    }

    public static double[][] inverse2x2(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            int determinant = determinant2x2(matrix);
            if (determinant == 0) {
                throw new IllegalArgumentException("Matrix is singular, inverse does not exist.");
            }

            double[][] inverse = new double[2][2];
            inverse[0][0] = matrix[1][1] / (double) determinant;
            inverse[0][1] = -matrix[0][1] / (double) determinant;
            inverse[1][0] = -matrix[1][0] / (double) determinant;
            inverse[1][1] = matrix[0][0] / (double) determinant;

            return inverse;
        }
        throw new IllegalArgumentException("Matrix is not 2x2.");
    }

    public static double[][] inverse3x3(int[][] matrix) {
        if (matrix.length == 3 && matrix[0].length == 3) {
            int determinant = determinant3x3(matrix);
            if (determinant == 0) {
                throw new IllegalArgumentException("Matrix is singular, inverse does not exist.");
            }

            double[][] adjugate = new double[3][3];
            adjugate[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
            adjugate[0][1] = matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2];
            adjugate[0][2] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
            adjugate[1][0] = matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2];
            adjugate[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
            adjugate[1][2] = matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2];
            adjugate[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
            adjugate[2][1] = matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1];
            adjugate[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

            double[][] inverse = new double[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    inverse[i][j] = adjugate[i][j] / determinant;
                }
            }
            return inverse;
        }
        throw new IllegalArgumentException("Matrix is not 3x3.");
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%.2f", matrix[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;

        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nAddition of Matrix 1 and Matrix 2:");
        displayMatrix(addMatrices(matrix1, matrix2));

        System.out.println("\nSubtraction of Matrix 1 and Matrix 2:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        System.out.println("\nMultiplication of Matrix 1 and Matrix 2:");
        displayMatrix(multiplyMatrices(matrix1, matrix2));

        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        System.out.println("\nDeterminant of Matrix 1: " + determinant3x3(matrix1));

        System.out.println("\nInverse of Matrix 1:");
        displayMatrix(inverse3x3(matrix1));
    }
}
