public class CalcClass {
    long SumOfMax;
    long maxInCol;
    long SumOfMin = 0;
    long minInCol;
    //задаємо значення матриць; i-rows, j-colums
    public long matrA[][] = {
            {4, 4, 12, 3, 5},
            {5, 6, 5, 23, 5},
            {0, 11, 52, 13, 14},
            {5, 16, 6, 1, 1},
    };

    int numberOfColumnsInA = matrA[0].length;
    int numberOfRowsInA = matrA.length;

    public long matrB[][] = {
            {4, 65, 0, 8, 45},
            {93, 6, 5, 45, 2},
            {5, 5, 2, 79, 1},
            {8, 4, 39, 7, 2},
    };
    int i, j;

    int numberOfColumnsInB = matrB[0].length;
    int numberOfRowsInB = matrB.length;


    //виводимо матриці на екан і перевіряємо на к-сть символів в рядках
    void call_outA() {
        System.out.println("Matrix A:");

        System.out.println("Matrix A columns:" + numberOfColumnsInA);
        System.out.println("Matrix A rows:" + numberOfRowsInA);

        for (i = 0; i < matrA.length; i++) {
            for (j = 0; j < matrA[i].length; j++) {

                System.out.print(matrA[i][j] + " ");
            }
            if (matrA[i].length != numberOfColumnsInA) {
                throw new ArithmeticException("Matrix has rows of different lengths!");
            }
            System.out.println();
        }

    }

    void call_outB() {
        System.out.println("Matrix B:");

        System.out.println("Matrix B columns:" + numberOfColumnsInB);
        System.out.println("Matrix B rows:" + numberOfRowsInB);

        for (int i = 0; i < matrB.length; i++) {
            for (int j = 0; j < matrB[i].length; j++) {
                System.out.print(matrB[i][j] + " ");
            }
            if (matrB[i].length != numberOfColumnsInB) {
                throw new ArithmeticException("Matrix has rows of different lengths!");
            }
            System.out.println("");
        }

    }

    //для додавання матриці мають бути однакові і треба це якось перевірити
    void check_addition() {
        if (numberOfColumnsInB != numberOfColumnsInA) {
            throw new ArithmeticException("Number of columns in matrix A and matrix B must be the same");
        } else if (numberOfRowsInA != numberOfRowsInB) {
            throw new ArithmeticException("Number of rows in matrix A and matrix B must be the same");
        } else {
            System.out.println("Все правильно! Нарешті переходимо до додавання!!!");
        }
    }

    //додавання і вивід
    public long matrC[][] = new long[numberOfRowsInB][numberOfColumnsInB];

    void matrc() {
        for (i = 0; i < matrC.length; i++) {
            for (j = 0; j < matrC[i].length; j++) {
                matrC[i][j] = matrA[i][j] + matrB[i][j];
            }
        }
        System.out.println("Matrix C:");
        for (i = 0; i < matrC.length; i++) {
            for (j = 0; j < matrC[i].length; j++) {
                System.out.print(matrC[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    int numberOfColumnsInC = numberOfColumnsInB;

    void additional() {
        System.out.print("Найбільші елементи в стовпцях матриці з парними номерами: ");
        for (j = 1; j < numberOfColumnsInC; j += 2) {
            maxInCol = matrC[0][j];
            for (i = 0; i < matrC.length; i++) {
                if (maxInCol < matrC[i][j]) {
                    maxInCol = matrC[i][j];
                }
            }

            System.out.print(maxInCol + " ");
            SumOfMax += maxInCol;
        }
        System.out.println("\nСума: " + SumOfMax);

        System.out.print("Найменші елементи в стовпцях матриці з непарними номерами: ");
        for (j = 0; j < numberOfColumnsInC; j += 2) {
            minInCol = matrC[0][j];
            for (i = 0; i < matrC.length; i++) {
                if (minInCol > matrC[i][j]) {
                    minInCol = matrC[i][j];
                }
            }
            System.out.print(minInCol + " ");
            SumOfMin += minInCol;
        }
        System.out.println("\nСума: " + SumOfMin);
        long Sum = SumOfMin + SumOfMax;
        System.out.println("Result: " + Sum);
    }

}
