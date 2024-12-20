package org.example.chapter2;

public class LogicalOpTable {
    public void logicalOpTable() {
        boolean p, q;

        System.out.println("\nP\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
    }

    public void logicalOpTableZeroUnit() {
        boolean bP, bQ; // логические представления операций b - boolean

        System.out.println("\nP\tQ\tAND\tOR\tXOR\tNOT");

        byte zP, zQ; // представления значений в нулях и единицах z - zero
        byte zAND, zOR, zXOR, zNOT;

        bP = true; bQ = true;
        if (bP) zP = 1; else zP = 0;
        if (bQ) zQ = 1; else zQ = 0;
        if (bP & bQ) zAND = 1; else zAND = 0;
        if (bP | bQ) zOR = 1; else zOR = 0;
        if (bP ^ bQ) zXOR = 1; else zXOR = 0;
        if (!bP) zNOT = 1; else zNOT = 0;
        System.out.print(zP + "\t" + zQ + "\t");
        System.out.print(zAND + "\t" + zOR + "\t");
        System.out.println(zXOR + "\t" + zNOT);

        bP = true; bQ = false;
        if (bP) zP = 1; else zP = 0;
        if (bQ) zQ = 1; else zQ = 0;
        if (bP & bQ) zAND = 1; else zAND = 0;
        if (bP | bQ) zOR = 1; else zOR = 0;
        if (bP ^ bQ) zXOR = 1; else zXOR = 0;
        if (!bP) zNOT = 1; else zNOT = 0;
        System.out.print(zP + "\t" + zQ + "\t");
        System.out.print(zAND + "\t" + zOR + "\t");
        System.out.println(zXOR + "\t" + zNOT);

        bP = false; bQ = true;
        if (bP) zP = 1; else zP = 0;
        if (bQ) zQ = 1; else zQ = 0;
        if (bP & bQ) zAND = 1; else zAND = 0;
        if (bP | bQ) zOR = 1; else zOR = 0;
        if (bP ^ bQ) zXOR = 1; else zXOR = 0;
        if (!bP) zNOT = 1; else zNOT = 0;
        System.out.print(zP + "\t" + zQ + "\t");
        System.out.print(zAND + "\t" + zOR + "\t");
        System.out.println(zXOR + "\t" + zNOT);

        bP = false; bQ = false;
        if (bP) zP = 1; else zP = 0;
        if (bQ) zQ = 1; else zQ = 0;
        if (bP & bQ) zAND = 1; else zAND = 0;
        if (bP | bQ) zOR = 1; else zOR = 0;
        if (bP ^ bQ) zXOR = 1; else zXOR = 0;
        if (!bP) zNOT = 1; else zNOT = 0;
        System.out.print(zP + "\t" + zQ + "\t");
        System.out.print(zAND + "\t" + zOR + "\t");
        System.out.println(zXOR + "\t" + zNOT);
    }
}
