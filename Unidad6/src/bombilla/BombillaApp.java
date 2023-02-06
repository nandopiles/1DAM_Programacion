package bombilla;

//@author 6jmati
import java.util.Scanner;

public class BombillaApp {

    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla();
        Bombilla general = new Bombilla();

        int opc;

        System.out.println("Buenas, su interruptor general está apagado...\n________________________________________________");
        do {
            menu();
            opc = eb.nextInt();
            switch (opc) {
                case 1:
                    if (general.estadoGeneral() == false) {
                        System.out.println("El general está apagado, no se puede encender NADA\n");
                    } else {
                        if (bombilla1.getBombilla() == false) {
                            bombilla1.setEstadoBombillaOn();
                        } else {
                            System.out.println("La bombilla1 ya está ENCENDIDA\n");
                        }
                    }
                    break;

                case 2:
                    if (general.estadoGeneral() == false) {
                        System.out.println("El general está apagado, no se puede encender NADA\n");
                    } else {
                        if (bombilla2.getBombilla() == false) {
                            bombilla2.setEstadoBombillaOn();
                        } else {
                            System.out.println("La bombilla2 ya está ENCENDIDA\n");
                        }
                    }
                    break;

                case 3:
                    if (general.estadoGeneral() == false) {
                        System.out.println("El general está apagado...\n");
                    } else {
                        if (bombilla1.getBombilla() == true) {
                            bombilla1.setEstadoBombillaOff();
                        } else {
                            System.out.println("La bombilla1 ya está APAGADA\n");
                        }
                    }
                    break;

                case 4:
                    if (general.estadoGeneral() == false) {
                        System.out.println("El general está apagado...\n");
                    } else {
                        if (bombilla2.getBombilla() == false) {
                            bombilla2.setEstadoBombillaOff();
                        } else {
                            System.out.println("La bombilla2 ya está APAGADA\n");
                        }
                    }
                    break;

                case 5:
                    general.setEncendidoGeneral();
                    if (bombilla1.getBombilla() == true) {
                        System.out.println("Bombilla 1 --> encendida");
                    } else {
                        System.out.println("Bombilla 1 --> apagada");
                    }
                    if (bombilla2.getBombilla() == true) {
                        System.out.println("Bombilla 2 --> encendida\n");
                    } else {
                        System.out.println("Bombilla 2 --> apagada\n");
                    }
                    break;

                case 6:
                    general.setApagadoGeneral();
                    System.out.println("GENERAL apagado, no podrá hacer NADA\n");
                    break;

                case 7:
                    System.out.println("\nHasta la próxima");
                    break;

                default:
                    System.out.println("opc no válida");
            }
        } while (opc != 7);
    }

    public static void menu() {
        System.out.print("1. ENCENDER Bombilla 1\n2. ENCENDER Bombilla 2\n3. APAGAR Bombilla 1\n4. APAGAR Bombilla 2\n"
                + "5. ENCENDER General / Consultar estado Bombillas\n6. APAGAR General\n7. FINALIZAR\n");
    }
}
