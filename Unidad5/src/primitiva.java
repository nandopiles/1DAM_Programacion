
import java.util.*;

public class primitiva {

    public static int random(int l) {
        int r = (int) (Math.random() * l);
        while (r == 0) {
            r = (int) (Math.random() * l);
        }
        return r;
    }

    public static void rellenar(int[] x, int l) {
        boolean dev;

        for (int i = 0; i < x.length; i++) {
            x[i] = random(l);
        }

        dev = compRep(x);
        if (dev == false) {
            rellenar(x, l);
        }
    }

    public static boolean compRep(int[] x) {
        //comprobar si hay números repetidos
        boolean dev = true;

        for (int t = 0; t < x.length; t++) {
            for (int i = t + 1; i < x.length && dev == true; i++) {
                if (x[t] == x[i]) {
                    dev = false;
                }
            }
        }
        return dev;
    }

    public static void visualizarC(int[] x) {
        int i;

        for (i = 0; i < x.length - 1; i++) {
            System.out.print(x[i] + "-");
        }
        System.out.print(x[i] + "   ");
    }

    public static void visCompl(int[] x) {
        System.out.print("(");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.print(")-> ");
    }

    public static void visRe(int[] x) {
        System.out.print("(Reintegro: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.print(")");
        System.out.println("");
    }

    public static void menu() {
        System.out.println("1. Jugar y Sorteo");
        System.out.println("2. Terminar");
    }

    public static void jugar() {
        int[] combG, compl, re, boleto, comple, reint;
        int c = 50, r = 10;
        //Ganador
        combG = new int[6];
        compl = new int[1];
        re = new int[1];
        //TU Boleto
        boleto = new int[6];
        comple = new int[1];
        reint = new int[1];

        //rellenar el Boleto Ganador
        rellenar(combG, c);
        rellenar(compl, c);
        rellenar(re, r);
        //Visualizar el Boleto Ganador
        System.out.println("Nº Ganador:");
        visCompl(compl);
        visualizarC(combG);
        visRe(re);
        System.out.println("____________");
        //Rellenar TU Boleto
        rellenarBoleto(boleto, comple, reint);
        //Visualizar TU Boleto
        System.out.println("");
        System.out.println("Tu Boleto es:");
        visCompl(comple);
        visualizarC(boleto);
        visRe(reint);
        //premio
        calcPremio(combG, compl, re, boleto, comple, reint);
    }

    public static void rellenarBoleto(int[] n, int[] c, int[] r) {
        Scanner eb = new Scanner(System.in);
        boolean dev;
        //rellenar el boleto

        for (int i = 0; i < n.length; i++) {
            System.out.print("Introduce el número " + i + " de tu Boleto: ");
            n[i] = eb.nextInt();
            while (n[i] < 1 || n[i] > 49) {
                System.out.print("Nº no válido, vuelve a repetir: ");
                n[i] = eb.nextInt();
            }
        }
        dev = compRep(n);
        if (dev == false) {
            System.out.println("");
            System.out.println("Nums repetidos, vuelve a introducir tu boleto:");
            rellenarBoleto(n, c, r);
        }

        //rellenar el complementario
        for (int i = 0; i < c.length; i++) {
            System.out.print("Introduce tu número complementario: ");
            c[i] = eb.nextInt();
            while (c[i] < 1 || c[i] > 49) {
                System.out.print("Nº no válido, vuelve a repetir: ");
                c[i] = eb.nextInt();
            }
        }
        //rellenar el reintegro
        for (int i = 0; i < r.length; i++) {
            System.out.print("Introduce tu reintegro: ");
            r[i] = eb.nextInt();
            while (r[i] < 1 || r[i] > 9) {
                System.out.print("Nº no válido, vuelve a repetir: ");
                r[i] = eb.nextInt();
            }
        }
    }

    public static int comprobarBoleto(int[] WBoleto, int[] boleto) {
        int contB = 0;

        for (int i = 0; i < boleto.length; i++) {
            if (WBoleto[i] == boleto[i]) {
                contB++;
            }
        }
        return contB;
    }

    public static int comprobarComplementario(int[] Wcompl, int[] compl) {
        int contC = 0;

        for (int i = 0; i < compl.length; i++) {
            if (Wcompl[i] == compl[i]) {
                contC++;
            }
        }
        return contC;
    }

    public static int comprobarReintegro(int[] Wre, int[] re) {
        int contR = 0;

        for (int i = 0; i < re.length; i++) {
            if (Wre[i] == re[i]) {
                contR++;
            }
        }
        return contR;
    }

    public static void calcPremio(int[] wB, int[] wC, int[] wR, int[] b, int[] c, int[] r) {
        int cB, cC, cR;

        cB = comprobarBoleto(wB, b);
        cC = comprobarComplementario(wC, c);
        cR = comprobarReintegro(wR, r);
        //resultados del premio
        premio(cB,cC,cR);
    }

    public static void premio(int B, int C, int R) {
        if (B == 6 && R == 1) {
            System.out.println("¡¡¡Premio Especial!!! --> 6 aciertos + reintegro");
            System.out.println("");
        }else if(B == 6 && R != 1){
            System.out.println("1er Premio --> 6 aciertos");
            System.out.println("");
        }else if(B == 5 && C == 1) {
            System.out.println("2º Premio --> 5 aciertos + complementario");
            System.out.println("");
        }else if (B == 5 && C != 1) {
            System.out.println("3er Premio --> 5 aciertos");
            System.out.println("");
        }else if (B == 4) {
            System.out.println("4º Premio --> 4 aciertos");
            System.out.println("");
        }else if (B == 3) {
            System.out.println("5º Premio --> 3 aciertos");
            System.out.println("");
        }else if (R == 1) {
            System.out.println("Reintegro");
            System.out.println("");
        }else{
            System.out.println("Tu boleto no tiene premio");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        int opc;

        do {
            do {
                menu();
                opc = eb.nextInt();
            } while (opc == 1 && opc == 2);

            switch (opc) {
                case 1:
                    jugar();
                    break;
                case 2:
                    break;
            }
        } while (opc != 2);
        System.out.println("Gracias por jugar");
    }
}