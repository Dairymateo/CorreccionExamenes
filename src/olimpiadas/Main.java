package olimpiadas;

import olimpiadas.Delegacion;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Delegacion p1;
        Delegacion p2;
        Delegacion p3;
        Delegacion d;
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el pais: ");
        String pais= sc.next();
        System.out.println("Ingrese cant deportistas");
        int nroDeportistas = Integer.parseInt(sc.next());
        System.out.println("Ingrese medallas de oro");
        int medallasOro = Integer.parseInt(sc.next());
        System.out.println("Ingrese medallas plata");
        int medallasPlata = Integer.parseInt(sc.next());
        System.out.println("Ingrese medallas Bronce");
        int medallasBronce = Integer.parseInt(sc.next());

        p1 = new Delegacion(pais, nroDeportistas, medallasOro, medallasPlata, medallasBronce);

        System.out.println("Ingrese el pais: ");
        pais= sc.next();
        System.out.println("Ingrese cant deportistas");
        nroDeportistas = Integer.parseInt(sc.next());
        System.out.println("Ingrese medallas de oro");
        medallasOro = Integer.parseInt(sc.next());
        System.out.println("Ingrese medallas plata");
        medallasPlata = Integer.parseInt(sc.next());
        System.out.println("Ingrese medallas Bronce");
        medallasBronce = Integer.parseInt(sc.next());

        p2 = new Delegacion(pais, nroDeportistas, medallasOro, medallasPlata, medallasBronce);

        System.out.println("Ingrese el pais: ");
        pais= sc.next();
        System.out.println("Ingrese cant deportistas");
        nroDeportistas = Integer.parseInt(sc.next());
        System.out.println("Ingrese medallas de oro");
        medallasOro = Integer.parseInt(sc.next());
        System.out.println("Ingrese medallas plata");
        medallasPlata = Integer.parseInt(sc.next());
        System.out.println("Ingrese medallas Bronce");
        medallasBronce = Integer.parseInt(sc.next());

        p3 = new Delegacion(pais, nroDeportistas, medallasOro, medallasPlata, medallasBronce);

        //menu
        int menu=0;

        do{
            System.out.println("1 mostrar delegaciones");
            System.out.println("2 modificar delegaciones");
            System.out.println("3 mas medallas");
            System.out.println("4 menos medallas");
            System.out.println("salir");
            menu=sc.nextInt();
            sc.nextLine();


            switch (menu){
                case 1:
                    System.out.println("las delegacion 1: ");
                    p1.mostrarDelegacion();
                    System.out.println("delegacion 2: ");
                    p2.mostrarDelegacion();
                    System.out.println("delegacion 3:");
                    p3.mostrarDelegacion();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Ingrese el pais que desea modificar");
                    pais = sc.nextLine();

                    if(pais.equalsIgnoreCase(p1.getPais()))
                        d = p1;
                    else if (pais.equalsIgnoreCase(p2.getPais()))
                        d = p2;
                    else if (pais.equalsIgnoreCase(p3.getPais()))
                        d = p3;
                    else
                        d=null;
                    if(d!=null){
                        int op = 0;
                        System.out.println("Ingrese lo que desea modificar");
                        System.out.println("1 medallas oro");
                        System.out.println("2 medallas plata");
                        System.out.println("3 medallas bronce");
                        op = sc.nextInt();
                        sc.nextLine();

                        switch (op){
                            case 1:
                                System.out.println("ingrese medallas de oro");
                                medallasOro= sc.nextInt();
                                sc.nextLine();
                                d.setMedallasOro(medallasOro);
                                break;
                            case 2:
                                System.out.println("ingrese medallas de Plata");
                                medallasPlata= sc.nextInt();
                                sc.nextLine();
                                d.setMedallasOro(medallasPlata);
                                break;
                            case 3:
                                System.out.println("ingrese medallas de Bronce");
                                medallasBronce= sc.nextInt();
                                sc.nextLine();
                                d.setMedallasBronce(medallasBronce);
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    } else
                        System.out.println("No existe la delegacion");
                case 3:
                    Delegacion delegacionMasMedallas=p1;
                    if(p2.calcularCantidadDeMedallas()> delegacionMasMedallas.calcularCantidadDeMedallas())
                        delegacionMasMedallas=p2;
                    if(p3.calcularCantidadDeMedallas()>delegacionMasMedallas.calcularCantidadDeMedallas())
                        delegacionMasMedallas=p3;
                    System.out.println("la delegacion con mas medallas es: ");
                    delegacionMasMedallas.mostrarDelegacion();
                    break;
                case 4:
                    Delegacion delegacionMenosMedallas = p1;
                    if(p2.calcularCantidadDeMedallas()< delegacionMenosMedallas.calcularCantidadDeMedallas())
                        delegacionMenosMedallas=p2;
                    if(p3.calcularCantidadDeMedallas()<delegacionMenosMedallas.calcularCantidadDeMedallas())
                        delegacionMenosMedallas=p3;
                    System.out.println("la delegacion con mas medallas es: ");
                    delegacionMenosMedallas.mostrarDelegacion();
                    break;

            }
        }while(menu!=5);
    }


}
