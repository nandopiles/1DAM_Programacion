package PrimitivaPOO;

//@author Nando
import java.util.*;

public class Boleto {
    
    private TreeSet<Integer> nums;
    private int reintegro, complementario;

    public Boleto() {
    }
    
    public void premio(Boleto b) {
        int cN, cC, cR;
        
        cN = comprobarNum(b);
        cC = comprobarCompl(b);
        cR = comprobarReintegro(b);
        
        consultaPremio(cN, cC, cR);
    }
    
    public int comprobarNum(Boleto b/*Boleto Ganador*/) {
        TreeSet<Integer> numGanador;
        ArrayList<Integer>  ganador, miBoleto;
        int contN = 0;
        
        numGanador = b.getNums();
        //Pasamos los TreeSet a ArrayList
        ganador = new ArrayList<Integer>(numGanador);
        miBoleto = new ArrayList<Integer>(nums);
        
        for (int i = 0; i < ganador.size(); i++) {
            if (ganador.get(i) == miBoleto.get(i)) {
                contN++;
            }
        }
        return contN;
    }
    
    public int comprobarCompl(Boleto b/*Boleto Ganador*/) {
        int complGanador, contC = 0;
        
        complGanador = b.getComplementario();
        if (complGanador == complementario) {
            contC++;
        }        
        return contC;
    }
    
    public int comprobarReintegro(Boleto b/*Boleto Ganador*/) {
        int reintGanador, contR = 0;
        
        reintGanador = b.getReintegro();
        if (reintGanador == reintegro) {
            contR++;
        }       
        return contR;
    }

    public void rellenoManual() {
        Scanner fr = new Scanner(System.in);
        nums = new TreeSet<Integer>();
        int num;
      
        do {
            System.out.print("Complementario --> ");
            complementario = fr.nextInt();
            if (complementario > 50 || complementario < 0) {
                System.out.println("[-] Num no Válido");
            }
        } while (complementario > 50 || complementario < 0);
        
        do {
            for (int i = 0; i < 6; i++) {
                System.out.print("[" + (i+1) + "] Introduce num --> ");
                num = fr.nextInt();
                nums.add(num);
            }
            if (nums.size() != 6) {
                System.out.println("[-] Nums Repetidos... Repita:");
                nums.clear();
            }
        } while (nums.size() != 6);
        
        do {
            System.out.print("Reintegro --> ");
            reintegro = fr.nextInt();
            if (reintegro > 10 || reintegro < 0) {
                System.out.println("[-] Num no Válido");
            }
        } while (reintegro > 10 || reintegro < 0);
        System.out.println("");
    }

    public void visualizarBoleto() {
        Iterator r = nums.iterator();

        System.out.print("(" + complementario + ")-> ");
        while (r.hasNext()) {
            System.out.print(r.next() + " ");
        }
        System.out.println("\t(Reintegro: " + reintegro + ")"
                + "\n_______________________________________________");
    }

    public void rellenoAutomatico(int l, int x) {
        nums = new TreeSet<Integer>();

        do {
            complementario = random(l);
        } while (complementario > 50 || complementario < 0);

        do {
            for (int i = 0; i < 6; i++) {
                nums.add(random(l));
            }
            if (nums.size() != 6) {
                nums.clear();
            }
        } while (nums.size() != 6);

        do {
            reintegro = random(x);
        } while (reintegro > 10 || reintegro < 0);
        
    }
    
    public static void consultaPremio(int B, int C, int R) {
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

    public static int random(int l) {
        int r = (int) (Math.random() * l);

        return r;
    }

    public TreeSet<Integer> getNums() {
        return nums;
    }

    public int getReintegro() {
        return reintegro;
    }

    public int getComplementario() {
        return complementario;
    }
}
