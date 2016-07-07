package com.company.geometricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal
{
    public static void main(String[] args)
    {

        //-------------------------- I N T R O D U C C I O N    D E    D A T O S ----------------------------------

        Scanner sc = new Scanner(System.in);

        List<Figura2D> figura2DList = new ArrayList<>();
        List<Figura3D> figura3DList = new ArrayList<>();
        System.out.println("Introduce el numero de  figuras geometricas para cada tipo:  ");
        int numero = sc.nextInt();

        obtenerCircumferencias(sc, figura2DList, figura3DList, numero);
        obtenerCuadrados(sc, figura2DList, figura3DList, numero);
        obtenerRectangulos(sc, figura2DList, numero);
        obtenerTriangulos(sc, figura2DList, figura3DList, numero);
        obtenetPentagonos(sc, figura2DList, figura3DList, numero);

        //---------------------------------------- V A R I A B L E S ------------------------------------------------

        Figura2D Amax2D= null;
        Figura2D Pmax2D= null;
        Figura2D Amin2D= null;
        Figura2D Pmin2D= null;

        //esto es un comentario de prueba

        //-------------------------------------- FIGURAS 2D System OUT ----------------------------------------------

        double totalArea2D = 0.0;
        double totalPerimetro2D = 0.0;
        System.out.println("-----------------------------GENERADOR 2D----------------------------");
        ProcesadorFiguras2D procesadorFiguras2D = new ProcesadorFiguras2D(figura2DList, Amax2D, Pmax2D, Amin2D, Pmin2D, totalArea2D, totalPerimetro2D).invoke();
        totalPerimetro2D = procesadorFiguras2D.getTotalPerimetro2D();
        totalArea2D = procesadorFiguras2D.getTotalArea2D();
        Pmax2D = procesadorFiguras2D.getPmax2D();
        Pmin2D = procesadorFiguras2D.getPmin2D();
        Amax2D = procesadorFiguras2D.getAmax2D();
        Amin2D = procesadorFiguras2D.getAmin2D();

        /*
        List<Figura3D> figura3DList = new ArrayList<>();

            figura3DList.add(new Cubo(1,new Cuadrado(0,5)));
                    //ESTE PARAMETRO LO UTILIZAMOS PARA INTRODUCIR DIRECTAMENTE FIGURAS 3D
        */

        //---------------------------------------- V A R I A B L E S ------------------------------------------------

        Figura3D Amax3D= null;
        Figura3D Pmax3D= null;
        Figura3D Vmax3D= null;
        Figura3D Amin3D= null;
        Figura3D Pmin3D= null;
        Figura3D Vmin3D= null;

        //-------------------------------------- FIGURAS 3D System OUT ----------------------------------------------

        double totalArea3D = 0.0;
        double totalVolumen = 0.0;
        double totalPerimetro3D = 0.0;
        int cont20 = 0;
        int cont = 0;
        int cont100 = 0;
        System.out.println("-----------------------------GENERADOR 3D----------------------------");
        ProcesadorFiguras3D procesadorFiguras3D = new ProcesadorFiguras3D(figura3DList, Amax3D, Pmax3D, Vmax3D, Amin3D, Pmin3D, Vmin3D, totalArea3D, totalVolumen, totalPerimetro3D, cont20, cont, cont100).invoke();
        totalPerimetro3D = procesadorFiguras3D.getTotalPerimetro3D();
        totalArea3D = procesadorFiguras3D.getTotalArea3D();
        Vmax3D = procesadorFiguras3D.getVmax3D();
        Vmin3D = procesadorFiguras3D.getVmin3D();
        Pmax3D = procesadorFiguras3D.getPmax3D();
        Pmin3D = procesadorFiguras3D.getPmin3D();
        Amax3D = procesadorFiguras3D.getAmax3D();
        Amin3D = procesadorFiguras3D.getAmin3D();
        cont20 = procesadorFiguras3D.getCont20();
        cont = procesadorFiguras3D.getCont();
        cont100 = procesadorFiguras3D.getCont100();

        //------------------------------------ M E D I A S --------------------------------------------------------

        int totalFiguras2D = numero*3;
        double Pmedia2D = totalPerimetro2D/totalFiguras2D;
        double Amedia2D = totalArea2D/totalFiguras2D;
        int totalFiguras3D = numero*3;
        double Vmedia3D = totalVolumen/totalFiguras3D;
        double Pmedia3D = totalPerimetro3D/totalFiguras3D;
        double Amedia3D = totalArea3D/totalFiguras3D;

        //------------------------------------ System OUT ---------------------------------------------------------

        System.out.println("----------2D----------2D----------2D----------2D----------2D----------");
        System.out.println("La figura geometrica 2D de perimetro maximo es: " +Pmax2D);
        System.out.println("La figura geometrica 2D de perimetro minimo es: " +Pmin2D);
        System.out.println("La figura geometrica 2D de area maxima es: " +Amax2D);
        System.out.println("La figura geometrica 2D de area minima es: " +Amin2D);
        System.out.println("La media del area de las figuras geometricas 2D es= "+Amedia2D);
        System.out.println("La media del perimetro de las figuras geometricas 2D es= "+Pmedia2D);
        System.out.println("La figura geometrica 2D de volumen maxima es: " +Vmax3D);
        System.out.println("La figura geometrica 2D de volumen minimo es: " +Vmin3D);
        System.out.println("----------3D----------3D----------3D----------3D----------3D----------");
        System.out.println("La figura geometrica 3D de perimetro maximo es: " +Pmax3D);
        System.out.println("La figura geometrica 3D de perimetro minimo es: " +Pmin3D);
        System.out.println("La figura geometrica 3D de area maxima es: " +Amax3D);
        System.out.println("La figura geometrica 3D de area minima es: " +Amin3D);
        System.out.println("La media del area de las figuras geometricas 3D es= "+Amedia3D);
        System.out.println("La media del perimetro de las figuras geometricas 3D es= "+Pmedia3D);
        System.out.println("La media del volumen de las figuras geometricas 3D es= "+Vmedia3D);
        System.out.println("El total de figuras geometricas 3D con volumen inferior a 20 es= "+cont20);
        System.out.println("El total de figuras geometricas 3D con volumen entre 20 y 100 es= "+cont);
        System.out.println("El total de figuras geometricas 3D con volumen superior a 100 es= "+cont100);


    }

    //---------------------------------------- M E T O D O S -------------------------------------------------------

    private static void obtenetPentagonos(Scanner sc, List<Figura2D> figura2DList, List<Figura3D> figura3DList, int numero) {
        for(int i=1; i<(numero+1); i++)
        {
            System.out.println("Introduce los datos del pentagono "+i);
            System.out.println("Introduce el lado:");
            double lado = sc.nextDouble();
            String colorSeleccionado = solicitarColor();
            System.out.println("El color selaccionado es: "+colorSeleccionado);

            Pentagono pentagono = new Pentagono(lado, i+numero*4,colorSeleccionado);
            figura2DList.add(pentagono);
            Dodecaedro dodecaedro = new Dodecaedro(i+numero*4,pentagono);
            figura3DList.add(dodecaedro);
        }
    }

    private static void obtenerTriangulos(Scanner sc, List<Figura2D> figura2DList, List<Figura3D> figura3DList, int numero) {
        for(int i=1; i<(numero+1); i++)
        {
            System.out.println("Introduce los datos del triangulo "+i);
            System.out.println("Introduce la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura:");
            double altura = sc.nextDouble();
            System.out.println("Introduce el lado1:");
            double lado1 = sc.nextDouble();
            System.out.println("Introduce el lado2:");
            double lado2 = sc.nextDouble();
            String colorSeleccionado = solicitarColor();
            System.out.println("El color selaccionado es: "+colorSeleccionado);

            Triangulo triangulo = new Triangulo(base,altura,lado1,lado2,i+numero*3,colorSeleccionado);
            figura2DList.add(triangulo);
            Tetraedro tetraedro = new Tetraedro(i+numero*3,triangulo);
            figura3DList.add(tetraedro);
            Octaedro octaedro = new Octaedro(i+numero*3,triangulo);
            figura3DList.add(octaedro);
            Icosaedro icosaedro = new Icosaedro(i+numero*3,triangulo);
            figura3DList.add(icosaedro);
        }
    }

    private static void obtenerRectangulos(Scanner sc, List<Figura2D> figura2DList, int numero) {
        for(int i=1; i<(numero+1); i++)
        {
            System.out.println("Introduce los datos del rectangulo "+i);
            System.out.println("Introduce la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura:");
            double altura = sc.nextDouble();
            String colorSeleccionado = solicitarColor();
            System.out.println("El color selaccionado es: "+colorSeleccionado);

            Rectangulo rectangulo = new Rectangulo(base,altura,i+numero*2,colorSeleccionado);
            figura2DList.add(rectangulo);
        }
    }

    private static void obtenerCuadrados(Scanner sc, List<Figura2D> figura2DList, List<Figura3D> figura3DList, int numero) {
        for(int i=1; i<(numero+1); i++)
        {
            System.out.println("Introduce los datos del cuadrado "+i);
            System.out.println("Introduce el lado:");
            double lado = sc.nextDouble();
            String colorSeleccionado = solicitarColor();
            System.out.println("El color selaccionado es: "+colorSeleccionado);

            Cuadrado cuadrado = new Cuadrado(lado,i+numero,colorSeleccionado);
            figura2DList.add(cuadrado);
            Cubo cubo = new Cubo(i+numero,cuadrado);
            figura3DList.add(cubo);
        }
    }

    private static void obtenerCircumferencias(Scanner sc, List<Figura2D> figura2DList, List<Figura3D> figura3DList, int numero) {
        for(int i=1; i<(numero+1); i++)
        {
            System.out.println("Introduce los datos de la circumferencia "+i);
            System.out.println("Introduce el radio:");
            double radio = sc.nextDouble();
            String colorSeleccionado = solicitarColor();
            System.out.println("El color selaccionado es: "+colorSeleccionado);

            Circumferencia circumferencia = new Circumferencia(radio,i,colorSeleccionado);
            figura2DList.add(circumferencia);
            Esfera esfera = new Esfera(i,circumferencia);
            figura3DList.add(esfera);
        }
    }

    //--------------------------------------- C O L O R E S -------------------------------------------------------
    private static String solicitarColor()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para RED-1, BLUE-2, GREEN-3, BLACK-4, WHITE-5");
        System.out.println("Color a solicitar: ");
        int color = sc.nextInt();
        String ele=null;
        int i = color-1;
        switch (i)
        {
            case 0:  ele= "RED";
                break;
            case 1:  ele= "BLUE";
                break;
            case 2:  ele= "GREEN";
                break;
            case 3:  ele= "BLACK";
                break;
            case 4:  ele= "WHITE";
                break;
        }
        return ele;
    }

    private static class ProcesadorFiguras2D {
        private List<Figura2D> figura2DList;
        private Figura2D amax2D;
        private Figura2D pmax2D;
        private Figura2D amin2D;
        private Figura2D pmin2D;
        private double totalArea2D;
        private double totalPerimetro2D;

        public ProcesadorFiguras2D(List<Figura2D> figura2DList, Figura2D amax2D, Figura2D pmax2D, Figura2D amin2D, Figura2D pmin2D, double totalArea2D, double totalPerimetro2D) {
            this.figura2DList = figura2DList;
            this.amax2D = amax2D;
            this.pmax2D = pmax2D;
            this.amin2D = amin2D;
            this.pmin2D = pmin2D;
            this.totalArea2D = totalArea2D;
            this.totalPerimetro2D = totalPerimetro2D;
        }

        public Figura2D getAmax2D() {
            return amax2D;
        }

        public Figura2D getPmax2D() {
            return pmax2D;
        }

        public Figura2D getAmin2D() {
            return amin2D;
        }

        public Figura2D getPmin2D() {
            return pmin2D;
        }

        public double getTotalArea2D() {
            return totalArea2D;
        }

        public double getTotalPerimetro2D() {
            return totalPerimetro2D;
        }

        public ProcesadorFiguras2D invoke() {
            for(Figura2D figura2D : figura2DList) // recorremos el array
            {
                double areaActual2D = figura2D.calculaArea();
                double perimetro2D = figura2D.calculaPerimetro();
                System.out.println("El area de la figura geometrica 2D " + figura2D.getId() + " es = " + areaActual2D);
                System.out.println("El perimetro de la figura geometrica 2D " + figura2D.getId() + " es =" +perimetro2D);

                totalArea2D = totalArea2D + areaActual2D;
                totalPerimetro2D = totalPerimetro2D + perimetro2D;

                //-------------------------------- Diametro Circumferencia ---------------------------------------------

                if(figura2D instanceof Circumferencia)
                {
                    Circumferencia circumferencia = (Circumferencia) figura2D;
                    double diametro = circumferencia.calculaDiametro();
                    System.out.println("El diametro de la circumferencia es= "+diametro);
                }

                //------------------------------------ M A X / M I N ---------------------------------------------------

                if (amax2D == null)
                {
                    amax2D = figura2D;
                }
                else
                {
                    if (totalArea2D > amax2D.calculaArea())
                    {
                        amax2D = figura2D;
                    }
                }

                if (pmax2D == null)
                {
                    pmax2D = figura2D;
                }
                else
                {
                    if (totalPerimetro2D < pmax2D.calculaPerimetro())
                    {
                        pmax2D = figura2D;
                    }
                }
                if (amin2D == null)
                {
                    amin2D = figura2D;
                }
                else
                {
                    if (totalArea2D < amin2D.calculaArea())
                    {
                        amin2D = figura2D;
                    }
                }

                if (pmin2D == null)
                {
                    pmin2D = figura2D;
                }
                else
                {
                    if (totalPerimetro2D < pmin2D.calculaPerimetro())
                    {
                        pmin2D = figura2D;
                    }
                }
            }
            return this;
        }
    }

    private static class ProcesadorFiguras3D {
        private List<Figura3D> figura3DList;
        private Figura3D amax3D;
        private Figura3D pmax3D;
        private Figura3D vmax3D;
        private Figura3D amin3D;
        private Figura3D pmin3D;
        private Figura3D vmin3D;
        private double totalArea3D;
        private double totalVolumen;
        private double totalPerimetro3D;
        private int cont20;
        private int cont;
        private int cont100;

        public ProcesadorFiguras3D(List<Figura3D> figura3DList, Figura3D amax3D, Figura3D pmax3D, Figura3D vmax3D, Figura3D amin3D, Figura3D pmin3D, Figura3D vmin3D, double totalArea3D, double totalVolumen, double totalPerimetro3D, int cont20, int cont, int cont100) {
            this.figura3DList = figura3DList;
            this.amax3D = amax3D;
            this.pmax3D = pmax3D;
            this.vmax3D = vmax3D;
            this.amin3D = amin3D;
            this.pmin3D = pmin3D;
            this.vmin3D = vmin3D;
            this.totalArea3D = totalArea3D;
            this.totalVolumen = totalVolumen;
            this.totalPerimetro3D = totalPerimetro3D;
            this.cont20 = cont20;
            this.cont = cont;
            this.cont100 = cont100;
        }

        public Figura3D getAmax3D() {
            return amax3D;
        }

        public Figura3D getPmax3D() {
            return pmax3D;
        }

        public Figura3D getVmax3D() {
            return vmax3D;
        }

        public Figura3D getAmin3D() {
            return amin3D;
        }

        public Figura3D getPmin3D() {
            return pmin3D;
        }

        public Figura3D getVmin3D() {
            return vmin3D;
        }

        public double getTotalArea3D() {
            return totalArea3D;
        }

        public double getTotalPerimetro3D() {
            return totalPerimetro3D;
        }

        public int getCont20() {
            return cont20;
        }

        public int getCont() {
            return cont;
        }

        public int getCont100() {
            return cont100;
        }

        public ProcesadorFiguras3D invoke() {
            for(Figura3D figura3D : figura3DList)
            {
                double areaActual3D = figura3D.calculaAreaTotal();
                double volumenActual3D = figura3D.calculaVolumen();
                double perimetro3D = figura3D.calculaPerimetro();
                System.out.println("El area de la figura geometrica 3D " + figura3D.getId() + " es = " + areaActual3D);
                System.out.println("El volumen de la figura geometrica 3D " + figura3D.getId() + " es =" +volumenActual3D);
                System.out.println("El perimetro de la figura geometrica 3D " + figura3D.getId() + " es =" +perimetro3D);

                totalArea3D = totalArea3D + areaActual3D;
                totalPerimetro3D = totalPerimetro3D + perimetro3D;

                //------------------------------------ DIAGONAL CUBO ---------------------------------------------------

                if(figura3D instanceof Cubo)
                {
                    Cubo cubo = (Cubo) figura3D;
                    double diagonal = cubo.calculaDiagonal();
                    System.out.println("La diagonal del cubo es= "+diagonal);
                }

                //------------------------------------ M A X / M I N ---------------------------------------------------

                if (figura3D.calculaVolumen() < 20)
                {
                    cont20++;
                }
                else if (figura3D.calculaVolumen() > 100)
                {
                    cont100++;
                }
                else
                {
                    cont++;
                }

                if (amax3D == null)
                {
                    amax3D = figura3D;
                }
                else
                {
                    if (totalArea3D > amax3D.calculaAreaTotal())
                    {
                        amax3D = figura3D;
                    }
                }

                if (pmax3D == null)
                {
                    pmax3D = figura3D;
                }
                else
                {
                    if (totalPerimetro3D > pmax3D.calculaPerimetro())
                    {
                        pmax3D = figura3D;
                    }
                }

                if (vmax3D == null)
                {
                    vmax3D = figura3D;
                }
                else
                {
                    if (totalVolumen > vmax3D.calculaVolumen())
                    {
                        vmax3D = figura3D;
                    }
                }

                if (amin3D == null)
                {
                    amin3D = figura3D;
                }
                else
                {
                    if (totalArea3D < amin3D.calculaAreaTotal())
                    {
                        amin3D = figura3D;
                    }
                }

                if (pmin3D == null)
                {
                    pmin3D = figura3D;
                }
                else
                {
                    if (totalPerimetro3D < pmin3D.calculaPerimetro())
                    {
                        pmin3D = figura3D;
                    }
                }

                if (vmin3D == null)
                {
                    vmin3D = figura3D;
                }
                else
                {
                    if (totalVolumen < vmin3D.calculaVolumen())
                    {
                        vmin3D = figura3D;
                    }
                }

            }
            return this;
        }
    }
}
