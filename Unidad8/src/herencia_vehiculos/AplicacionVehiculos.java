package herencia_vehiculos;

//@author Nando
public class AplicacionVehiculos {

    public static void main(String[] args) {
        Vehiculo[] array = new Vehiculo[4];
        Camion camion1, camion2;
        Coche coche1, coche2;

        //creamos los camiones y coches pasándoles los atributos necesarios
        camion1 = new Camion("32363HSX");
        camion2 = new Camion("54656LMN");
        coche1 = new Coche("45675FCV", 5); //al coche le tenemos que poner las ruedas que tiene
        coche2 = new Coche("23123JHC", 3);

        //añadimos los coches y camiones al array
        array[0] = camion1;
        array[1] = camion2;
        array[2] = coche1;
        array[3] = coche2;

        //poner remolque a los camiones del array
        for (int i = 0; i < array.length; i++) {
            try {
                if (array[i] instanceof Camion) { //te dice si el objeto es de tipo (en este caso)
                    Camion x = (Camion)array[i];
                    Remolque remolque = new Remolque(1000);
                    x.ponRemolque(remolque);
                    x.acelerar(110); //(método de la clase Camión con Downcasting)
                    System.out.println(x.toString());
                } else {
                    array[i].acelerar(110);
                    System.out.println(array[i].toString());
                }
            } catch(DemasiadoRapidoException e1) {
                System.out.println(e1.getMessage());
            }
        }
    }
}
