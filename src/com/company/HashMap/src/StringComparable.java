public class StringComparable {

    public static void main(String[] args) {

        String Oscar="Oscar";
        String Judith="Judith";
        String marcos="Marcos";

        int resultado = Judith.compareTo(Oscar);
        int resultado2 =Judith.compareTo(marcos);
        //System.out.println(resultado2);

        Integer x=1;
        Integer y=-2;

        //System.out.println(y.compareTo(x));


        Persona ivan=new Persona(1L,"47666936B","Ivan",22);
        Persona marcos1=new Persona(2L,"47634763467C","Marcos",23);

        System.out.println(ivan.compareTo(marcos1));


    }


}
