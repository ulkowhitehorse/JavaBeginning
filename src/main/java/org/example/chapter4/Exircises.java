public class Exircises {

    double[] masDouble;
    int[] masInt;

    public Exircises(int sizeInt, int sizeDouble) {
        masInt = new int[sizeInt];
        for(int i = 1; i <= sizeInt; i++) {
            masInt[i-1] = i;
        }

        masDouble = new double[sizeDouble];
        for(double i = 1; i <= sizeDouble; i++) {
            masDouble[(int) (i-1)] = i;
        }
    }


    void printMasInt() {
        System.out.print("Массив int: ");
        for(int i = 0; i < masInt.length; i++) {
            System.out.print(" " + masInt[i] );
        }
        System.out.println();
    }

    void printMasDouble() {
        System.out.print("Массив double: ");
        for(int i = 0; i < masDouble.length; i++) {
            System.out.print(" " + masDouble[i]);
        }
        System.out.println();
    }

    void everageMasDouble() {
        double evMas = 0;
        for(int i = 0; i < masDouble.length; i++) {
            evMas += masDouble[i];
        }
        System.out.println("Среднее арифметическое массива double = " + evMas/masDouble.length);
    }
    
    

}

class EDemo {
    public static void main(String[] args) {
        Exircises exircises = new Exircises(5, 10);
        exircises.printMasInt();
        exircises.printMasDouble();
        exircises.everageMasDouble();
    }
}
