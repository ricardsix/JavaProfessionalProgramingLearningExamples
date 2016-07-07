import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarPersonas {

    static List<Persona> ordenarpersonaList = new ArrayList<>();


    public static void main(String[] args) {


        Persona persona1 = new Persona(2L, "47666936B", "Ivan", 32);


        Persona persona2 = new Persona(1L, "47566936B", "Pepe", 20);
        Persona persona3 = new Persona(3L, "4756566B", "Lolo", 50);
        Persona persona4 = new Persona(3L, "4756566B", "Lolita", 5);


        List<Persona> ordenarpersonaList = new ArrayList<>();

        ordenarpersonaList.add(persona1);
        ordenarpersonaList.add(persona2);
        ordenarpersonaList.add(persona3);
        ordenarpersonaList.add(persona4);

        for (Persona persona : ordenarpersonaList) {

           // System.out.println(persona);

        }
        Collections.sort(ordenarpersonaList);

        for (Persona persona : ordenarpersonaList) {

            System.out.println(persona);

        }

    }




}
