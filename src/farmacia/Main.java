package farmacia;

import olimpiadas.Delegacion;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Empleado e1;
        Empleado e2;
        Empleado e3;
        Empleado d;
        Scanner sc = new Scanner(System.in);
        int menu =0;

        System.out.println("Ingrese el nombre del empleado");
        String nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese la cedula del empleado");
        int cedula=Integer.parseInt(sc.next());
        System.out.println("Ingrese las hora trabajadas del empleado");
        int horasTrabajadas=Integer.parseInt(sc.next());
        System.out.println("Ingrese el valor por hora de trabajo");
        double valoPorHora=Double.parseDouble(sc.next());
        sc.nextLine();

        e1=new Empleado(nombreEmpleado, cedula, horasTrabajadas, valoPorHora);


        System.out.println("Ingrese el nombre del empleado");
        nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese la cedula del empleado");
        cedula=Integer.parseInt(sc.next());
        System.out.println("Ingrese las hora trabajadas del empleado");
        horasTrabajadas=Integer.parseInt(sc.next());
        System.out.println("Ingrese el valor por hora de trabajo");
        valoPorHora=Double.parseDouble(sc.next());
        sc.nextLine();

        e2=new Empleado(nombreEmpleado, cedula, horasTrabajadas, valoPorHora);


        System.out.println("Ingrese el nombre del empleado");
        nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese la cedula del empleado");
        cedula=Integer.parseInt(sc.next());
        System.out.println("Ingrese las hora trabajadas del empleado");
        horasTrabajadas=Integer.parseInt(sc.next());
        System.out.println("Ingrese el valor por hora de trabajo");
        valoPorHora=Double.parseDouble(sc.next());
        sc.nextLine();

        e3=new Empleado(nombreEmpleado, cedula, horasTrabajadas, valoPorHora);

        do{
            System.out.println("-------Menu-------");
            System.out.println("1. Ingresar monto de venta empleado");
            System.out.println("2. calcular nomina");
            System.out.println("3. salir");
            menu=sc.nextInt();
            sc.nextLine();

            switch (menu){
                case 1:
                    System.out.println("Ingrese el empleado que desea agregar su monto de venta");
                    nombreEmpleado = sc.nextLine();

                    if(nombreEmpleado.equalsIgnoreCase(e1.getNombreEmpleado()))
                        d = e1;
                    if(nombreEmpleado.equalsIgnoreCase(e2.getNombreEmpleado()))
                        d = e2;
                    if(nombreEmpleado.equalsIgnoreCase(e3.getNombreEmpleado()))
                        d = e3;
                    else
                        d = null;
                    if(d!=null){
                        System.out.println("Ingrese el monto de venta");
                        int montoDeVenta=sc.nextInt();
                        sc.nextLine();
                        e1.setMontoDeVenta(montoDeVenta);

                    }
            }

        }while (menu!=3);


    }
    }

