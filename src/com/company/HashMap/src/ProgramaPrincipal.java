import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class ProgramaPrincipal {
    static List<Persona> personaList = new ArrayList<>();
    private  static Map<Long,Persona> mapId = new HashMap<>();
    private  static Map<String,Persona> mapNombre = new TreeMap<>();
    private  static Map<String,Persona> mapDni = new HashMap<>();
    private static Map<Integer,Persona>mapedad=new TreeMap<>();
    public static void main(String[] args) {
        CrearPersona();


        ConsultarPersona();


    }

    private static void ConsultarPersona() {
        Scanner sc = new Scanner(in);//Para sacnner de nombres
        bucle:
        while(true){

          // System.out.println(""+personaList.get(i));

            System.out.println("Por cual campo quieres filtrar: ");
            System.out.println("1. Id");
            System.out.println("2. Nombre");
            System.out.println("3. DNI");
            System.out.println("4. Mostrar todas las entradas");
            System.out.println("5. Ordenar por edad");
            System.out.println("6. Salir");

            int filtro=sc.nextInt();


            switch (filtro) {

                case 1:
                    System.out.println("Por que id quieres buscar?");
                    Long num=sc.nextLong();
                    Persona personaid =mapId.get(num);
                    if(personaid!=null) {

                        System.out.println(personaid);
                    }
                    else {
                        System.out.println("id no existe");
                    }



                  break;

                case 2:


                    System.out.println("Que nombre quieres buscar?");
                    String nombre = sc.next();


                   Persona persona= mapNombre.get(nombre);
                    if(persona!=null) {
                        System.out.println(persona);

                    }
                    else {
                        System.out.println("No existe este nombre");
                    }
                        break;

                case 3:

                    System.out.println("Que dni quieres buscar?");
                    String nombre1 = sc.next();
                    Persona personadni= mapDni.get(nombre1);
                    if(personadni!=null) {
                        System.out.println(personadni);
                    }
                    else {
                        System.out.println("Dni no existe");

                    }
                    break;
                case 4:
                    //ordenar por id
                    for(Long idPersona: mapId.keySet()) {

                       //System.out.println("Los id son : "+idPersona);
                       // System.out.println(mapId.get(idPersona));
                       // Persona personaActual = mapId.get(idPersona);

                        //System.out.println(personaActual);
                    }
                    //ordenar por nombre añadir el trremap arriba donde antes estaba el hashmap
                    for(String nombrePersona:mapNombre.keySet()) {

                        System.out.println(mapNombre.get(nombrePersona));

                    }
                    break;

                case 5:
                    for(Integer edad:mapedad.keySet() ) {

                        System.out.println(mapedad.get(edad));
                    }


                    break;

                case 6:
                    break bucle;
            }

        }
    }

    private static void CrearPersona() {
        Persona persona1 = new Persona(3L,"47666936B","Ivan",22);
        personaList.add(persona1);
        mapId.put(persona1.getId(),persona1);
        mapNombre.put(persona1.getNombre(),persona1);
        mapDni.put(persona1.getDni(),persona1);

        Persona persona2 = new Persona(4L,"58658328P","Juan",32);
        personaList.add(persona2);

        mapId.put(persona2.getId(),persona2);
        mapNombre.put(persona2.getNombre(),persona2);
        mapDni.put(persona2.getDni(),persona2);

        Persona persona3 = new Persona(1L,"66658328K","Maria",35);
        personaList.add(persona3);

        mapId.put(persona3.getId(),persona3);
        mapNombre.put(persona3.getNombre(),persona3);
        mapDni.put(persona3.getDni(),persona3);

        Persona persona4 = new Persona(2L,"22658328T","Pepe",50);
        personaList.add(persona4);

        mapId.put(persona4.getId(),persona4);
        mapNombre.put(persona4.getNombre(),persona4);
        mapDni.put(persona4.getDni(),persona4);

        Persona persona5 = new Persona(5L,"56676328Y","Manolo",55);
        personaList.add(persona5);

        mapId.put(persona5.getId(),persona5);
        mapNombre.put(persona5.getNombre(),persona5);
        mapDni.put(persona5.getDni(),persona5);
    }
}

