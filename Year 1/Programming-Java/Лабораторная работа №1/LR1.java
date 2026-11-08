import java.lang.Math;

public class LR1 {
    public static void main(String[] args) {
        int n = 10; // размер первого массива
        int m = 17; // размер второго массива
        // объявляем массив c и заполняем его
        short[] c = new short[n];
        for (short index = 0, i = 6; i <= 24; i+=2, index++) {
            c[index] = i;
        }
        // объявляем массив x и заполняем его
        double[] x = new double[m];
        for (int j = 0; j < m; j++) {
            /* Рандомное число в диапазоне [min,max) = min + (max - min) * Math.random
            Math.random - случайное число double в диапазоне [0.0, 1.0) */ 
            x[j] = -14.0 + (13.0 + 14.0) * Math.random();
        }
        // объявляем массив e и заполняем его
        double[][] e = new double[n][m];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                e[i][j] = calculateMatrixElement(c[i], x[j]);
            }
        }
        // вывод полученного массива e
        System.out.println("Массив e:");
        printMatrix(e);
    }

    // статический метод, проверяющий наличие элемента c в массиве {8, 14, 16, 18, 20}
    public static boolean isInArray(short c) {
        short[] arr = new short[] {8, 14, 16, 18, 20};
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i])
                return true;
        }
        return false;
    }
    
    // статический метод подсчета нового элемента двумерного массива
    public static double calculateMatrixElement(short c, double x) {
        if (c == 24)
            return Math.tan(Math.pow(Math.cos(x) / 2, 3));
        else if (isInArray(c))
            return Math.log(Math.pow(Math.pow(Math.E , x) / (Math.pow(5/Math.abs(x), x) + 1), 2));
        else
            return ((double)3/4) / (1 - Math.sin(Math.asin(Math.pow((x - 0.5) / 27, 2))));
    }

    // статический метод вывода двумерного массива в виде матрицы
    public static void printMatrix(double[][] e) {
        for (int i = 0; i < e.length; i++) {
            for(int j = 0; j < e[i].length; j++) {
                System.out.printf("%8.4f ", e[i][j]);
            }
            System.out.println();
        }
    }
}
