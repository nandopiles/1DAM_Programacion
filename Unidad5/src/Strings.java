
public class Strings {
    public static void main(String[] args) {
        String cad1, cad2;
        cad1 = "En un lugar de la Mancha";
        cad2 = "de cuyo nombre";
        
        System.out.println(cad1.concat(" ").concat(cad2));
        System.out.println(cad1+" "+cad2);
        System.out.println(cad1.length());
        System.out.println(cad1.charAt(4));//caract posi 4
        System.out.println(cad1.substring(3,9)); //print del caract 3 al 9
        System.out.println(cad1.indexOf("a"));//posi de la a en el string
        System.out.println(cad1.indexOf("a",10)); //posi de a a partir de posi 10
        System.out.println(cad1.lastIndexOf("a"));//ult posi que aparece a
        System.out.println(cad1.endsWith("cha"));//si acaba en cha
        System.out.println(cad1.replaceAll("a","A").replaceAll("u", "A"));
        System.out.println(cad1.replaceAll("un", "UN"));
        System.out.println(cad1.toUpperCase());//en mayúsculas
        //.toLoweCase() .equalsIgnoreCase (compara strings pero no si es mayus o min)
        //.length
        
    }
}
