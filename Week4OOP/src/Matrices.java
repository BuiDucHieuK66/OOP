package OOP.Week4;

import java.util.Random;

public class Matrices {
    public static void createRandomMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = new Random().nextInt(1, 10);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        return new int[rows][cols];
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length)
            return true;
        else
            return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length)
            return true;
        else
            return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return matrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] matrix = new double[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return matrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return matrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] matrix = new double[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return matrix;
    }

    public static int[][] mutiply(int[][] matrix1, int[][] matrix2) {
        int[][] product = new int[matrix1.length][matrix2[0].length];

        for (int row = 0; row < product.length; row++) {
            for (int col = 0; col < product[0].length; col++) {
                for (int i = 0; i < matrix1[0].length; i++) {
                    product[row][col] += matrix1[row][i] * matrix2[i][col];
                }
            }
        }
        return product;
    }

    public static double[][] mutiply(double[][] matrix1, double[][] matrix2) {
        double[][] product = new double[matrix1.length][matrix2[0].length];

        for (int row = 0; row < product.length; row++) {
            for (int col = 0; col < product[0].length; col++) {
                for (int i = 0; i < matrix1[0].length; i++) {
                    product[row][col] += matrix1[row][i] * matrix2[i][col];
                }
            }
        }
        return product;
    }
}
