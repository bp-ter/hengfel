/*
* File: Hengfel.java
* Author: Berta Péter
* Copyright: 2025, Berta Péter
* Group: Szoft II/2/N
* Date: 2025-01-15
* Github: https://github.com/bp-ter/
* Licenc: MIT
*/

import java.util.Scanner;

public class Hengfel {
    public static void Solution(String[] args) {
        // Scanner objektum a bemenet olvasásához
        Scanner scanner = new Scanner(System.in);

        // Kérjük be a henger sugarát és magasságát
        System.out.print("Adja meg a henger sugarát (r): ");
        double r = scanner.nextDouble();
        
        System.out.print("Adja meg a henger magasságát (h): ");
        double h = scanner.nextDouble();

        // A kör alapú henger felszíne
        double surfaceArea = 2 * Math.PI * r * (r + h);

        // Eredmény kiírása
        System.out.println("A henger felszíne: " + surfaceArea + "cm2");
        
        // Scanner bezárása
        scanner.close();
    }
}
