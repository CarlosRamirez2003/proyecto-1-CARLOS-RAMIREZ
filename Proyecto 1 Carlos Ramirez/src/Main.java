import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @descripción
 * @autor carlos ramirez
 **/
public class Main {

    public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);


        int exit = 0;
            int opcion = 0;
            ColaServicio ColaServicio =new ColaServicio("ColaServicio");
        while (exit != 1) {

                menue();
                try {
                    opcion = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Opcion no valida.");
                    scanner = new Scanner(System.in);
                }
                switch (opcion) {


                    case 1:

                        System.out.println("Generando Ticket De Reporte... ");
                        System.out.println("Ingrese su nit");
                        scanner.nextLine();
                        String nit = scanner.nextLine();
                        System.out.println("Ingrese el problema ");
                        String problema = scanner.nextLine();
                        String cola = "mesa";
                        ticket tikets1 = new ticket(ticket.getContador(), nit, problema,cola);
                        ColaServicio.AgregarColaServicio(tikets1);
                        break;
                    case 2:
                        ColaServicio.Json();
                        System.out.println("Cargado ");
                        break;
                    case 3:
                     ColaServicio.Colamesa();


                        break;
                    case 4:
                        ColaServicio.ColaSoporte();
                        break;
                    case 5:
                        ColaServicio.ColaDesarrollo();

                        break;
                    case 6:
                        ColaServicio.Mostrar_Todos();
                        break;
                    case 7:
                        ColaServicio.MostrarColaMesa();
                        break;
                    case 8:
                        ColaServicio.MostrarColaSoporte();
                        break;
                    case 9:
                        ColaServicio.MostrarColaDesarrollador();
                        break;
                    case 10:
                        ColaServicio.BitacoraGeneral();
                        break;
                    case 11:
                        exit = 1;

                        break;
                    case 12:
                        ColaServicio.Json();
                        break;

                }//fin switch1


            }//fin while
        }




        private static void menue() {
            System.out.println(" MENU:");
            System.out.println(" 1. Generar tiket ");
            System.out.println(" 2. Cargar Datos masivos");
            System.out.println(" 3. Atencion Mesa de ayuda ");
            System.out.println(" 4. Atencion soporte ");
            System.out.println(" 5. Atencion Desarrollador ");
            System.out.println(" 6. Mostrar Todos los tikets");
            System.out.println(" 7. Mostrar Todos los tikets en Mesa de Ayuda");
            System.out.println(" 8. Mostrar Todos los tikets en Cola Soporte");
            System.out.println(" 9. Mostrar Todos los tikets en Cola Desarrollador");
            System.out.println("10. Mostrar Bitacora");
            System.out.println("11. cerrar ");




            System.out.println("Ingrese opcion:");
        }





}