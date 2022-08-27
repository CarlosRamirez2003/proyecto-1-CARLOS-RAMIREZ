import com.sun.corba.se.impl.protocol.INSServerRequestDispatcher;
import com.sun.org.apache.bcel.internal.generic.I2F;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeJSON;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @descripción en esta clase contiene todos los metodos de las Colas
 * @autor carlos ramirez
 **/



public class ColaServicio {
    /**
     * @param  NombreCola Recibe el nombre de la cola a la cual fue asignada el ticket
     * @param ColaServicioA Este arreglo contiene todos los tickets creados
     * @param Bitacorageneral Este arreglo contiene todos los movimientos realizados en un ticket
     * @param ContadorBitacora Esta variable contiene cuantos eventos hay en la Bitacora
     * @param indice Este indice representa las posiciones de los tickets en el arreglo ColaServicioA
     */
    Scanner scanner = new Scanner(System.in);
    private String NombreCola;
    private ticket ColaServicioA[];
    private bitacora Bitacorageneral[];
    private int ContadorBitacora ;
    private int indice;
    private  int contadorJson;
    /**
     *
     * @param NombreCola Sera el nombre de la Cola general
     */
    public ColaServicio(String NombreCola) {

        this.NombreCola = NombreCola;
        ColaServicioA = new ticket[100];
        Bitacorageneral = new  bitacora[200];
        indice = 0;
        ContadorBitacora =0;
        contadorJson =0;

    }

    /**
     *
     * @param Tiketagregar Esta variable de tipo ticket recibe un objeto tiket para agregarlo al arreglo ColaServicio
     */
    public void AgregarColaServicio(ticket Tiketagregar) {
        /**
         *
         */
        ColaServicioA[indice] = Tiketagregar;
        System.out.println("");
        indice++;
        bitacora bitacora = new bitacora(Tiketagregar.getTicket()," Creado",0000,LocalDate.now(), LocalTime.now(),"Aun no resuelto");
        Bitacorageneral[ContadorBitacora] = bitacora;
        ContadorBitacora++;
        System.out.println("Ticket de Reporte Creado");




    }

    /**
     * Metodo que recibe un objeto tiket , si el operador resuelve el ticket cambia su estado, si no pasa a la siguiente cola la cual es cola Soporte
     */
    //INICIO METODOS COLA MESA
    public void Colamesa() {
        int valor = 0;//varible que ayuda a sacar el valor de i del for
        int nitSoporte=0;
        String Solucion;
        System.out.println("ingrese su nitSoporte");
        nitSoporte= scanner.nextInt();

        for (int i = 0; i < ColaServicioA.length; i++) {
            if (ColaServicioA[i]==null){
                i++;
            }
            else if (ColaServicioA[i].getCola() == "mesa") {
                System.out.println("Ticket trabajar ");
                System.out.println("No. Ticket: "+ColaServicioA[i].getTicket()+" Problema: "+ColaServicioA[i].getProblema());
                valor = i;
                i = ColaServicioA.length;
            }
        }
        System.out.println("logro resolver?");
        int respuesta = 0;
        System.out.println("1== si");
        System.out.println("0== no");
        respuesta = scanner.nextInt();
        if (respuesta == 1) {
            ColaServicioA[valor].setCola("sesa-Atendio");
            bitacora bitacora = new bitacora(ColaServicioA[valor].getTicket(),"Asignado",nitSoporte,LocalDate.now(), LocalTime.now(),"Aun no resuelto");
            Bitacorageneral[ContadorBitacora] = bitacora;
            ContadorBitacora++;
            scanner.nextLine();
            System.out.println("ingrese la solucion");
            Solucion = scanner.nextLine();
            bitacora = new bitacora(ColaServicioA[valor].getTicket(), "resuelto", nitSoporte, LocalDate.now(), LocalTime.now(),Solucion);
            Bitacorageneral[ContadorBitacora] = bitacora;
            ContadorBitacora++;




        } else {
            ColaServicioA[valor].setCola("soporte");
            bitacora bitacora = new bitacora(ColaServicioA[valor].getTicket(),"Asignado",nitSoporte,LocalDate.now(), LocalTime.now(),"Aun no resuelto");
            Bitacorageneral[ContadorBitacora] = bitacora;
            ContadorBitacora++;
             bitacora = new bitacora(ColaServicioA[valor].getTicket(),"Cola soporte ",nitSoporte,LocalDate.now(), LocalTime.now(),"Aun no resuelto");
            Bitacorageneral[ContadorBitacora] = bitacora;
            ContadorBitacora++;
        }

    }
//INICIO METODOS COLA SOPORTE

    /**
     * Metodo que recibe un objeto tiket Del Metodo Colamesa , si el operador resuelve el ticket cambia su estado, si no pasa a la siguiente cola la cual es cola Desarrollador
     */
    public void ColaSoporte() {

        int valor = 0;
        int nitSoporte=0;
        String Solucion;
        System.out.println("ingrese su nitSoporte");
        nitSoporte= scanner.nextInt();
        for (int i = ColaServicioA.length; i >0; i--) {
            if(ColaServicioA[i-1]== null){
                i--;
            } else if (ColaServicioA[i].getCola() == "soporte") {
                System.out.println("Ticket Trabajar ");
                System.out.println("No. Ticket: "+ColaServicioA[i].getTicket()+" Problema: "+ColaServicioA[i].getProblema());
                valor =i;
                i = 0;

            }
        }
        System.out.println("logro resolver?");
        int respuesta = 0;
        System.out.println("1== si");
        System.out.println("0== no");
        respuesta = scanner.nextInt();
        if (respuesta == 1) {
            ColaServicioA[valor].setCola("soporte-Atendio");
            bitacora bitacora = new bitacora(ColaServicioA[valor].getTicket(),"Asignado",nitSoporte,LocalDate.now(), LocalTime.now(),"Aun no resuelto");
            Bitacorageneral[ContadorBitacora] = bitacora;
            ContadorBitacora++;
            scanner.nextLine();
            System.out.println("ingrese la solucion");
            Solucion = scanner.nextLine();
            bitacora = new bitacora(ColaServicioA[valor].getTicket(), "resuelto", nitSoporte, LocalDate.now(), LocalTime.now(),Solucion);
            Bitacorageneral[ContadorBitacora] = bitacora;
            ContadorBitacora++;


        } else {
            ColaServicioA[valor].setCola("desarrollo");
            bitacora bitacora = new bitacora(ColaServicioA[valor].getTicket(),"Asignado",nitSoporte,LocalDate.now(), LocalTime.now(),"Aun no resuelto");
            Bitacorageneral[ContadorBitacora] = bitacora;
            ContadorBitacora++;
            bitacora = new bitacora(ColaServicioA[valor].getTicket(),"Cola desarrollo ",nitSoporte,LocalDate.now(), LocalTime.now(),"Aun no resuelto");
            Bitacorageneral[ContadorBitacora] = bitacora;
            ContadorBitacora++;
        }

    }


    //INICIO METODOS COLA DESARROLLO

    /**
     * Metodo que recibe un objeto tiket Del Metodo ColaSoporte , y permite dar solución
     */
    public void ColaDesarrollo() {
        int valor = 0;
        int nitSoporte=0;
        String Solucion;
        System.out.println("ingrese su nitSoporte");
        nitSoporte= scanner.nextInt();
        for (int i =0; i<  ColaServicioA.length ; i++) {
            int max =100;
            int min =0;
            Random random = new Random();
            int x = random.nextInt(max+min)+min;

            if(ColaServicioA[x]== null){

            } else if (ColaServicioA[x].getCola() == "desarrollo") {
                System.out.println("Tiket trabajar ");
                System.out.println("No. Ticket: "+ColaServicioA[x].getTicket()+" Problema: "+ColaServicioA[x].getProblema());
                valor = x;
                i = ColaServicioA.length;

            }
        }
        System.out.println(" pulsar 1 cuando termine el problema ");
        int respuesta = 0;
        System.out.println("1== terminado");
        respuesta = scanner.nextInt();
        if (respuesta == 1) {
            ColaServicioA[valor].setCola("desarrollo-Atendido");
            bitacora bitacora = new bitacora(ColaServicioA[valor].getTicket(),"Asignado",nitSoporte,LocalDate.now(), LocalTime.now(),"Aun no resuelto");
            Bitacorageneral[ContadorBitacora] = bitacora;
            ContadorBitacora++;
            scanner.nextLine();
            System.out.println("ingrese la solucion");
            Solucion = scanner.nextLine();
            bitacora = new bitacora(ColaServicioA[valor].getTicket(), "resuelto", nitSoporte, LocalDate.now(), LocalTime.now(),Solucion);
            Bitacorageneral[ContadorBitacora] = bitacora;
            ContadorBitacora++;


        }

    }
    //INICIO METODO JSON
    /**
     * metodo para generar datos masivos
     * @throws IOException si no se encuentra el archivo
     */
    public void Json() throws IOException {
        String arr = new String(Files.readAllBytes(Paths.get("C:\\Users\\Andres\\Downloads\\informacion.json")));
        JSONArray arreglototal = new  JSONArray(arr);
        for (int i = 0; i< arreglototal.length();i++){
            JSONObject elementos = arreglototal.getJSONObject(i);
            Object nitusuario = elementos.get("nitUsuario");
            String problema =elementos.getString("problema");
            String Colas =elementos.getString("cola");
            String nitreause ="";
            if (nitusuario instanceof Integer){
                nitreause = nitusuario.toString();
            }else {
                nitreause = nitusuario.toString();
            }
            int valor =i;
            String COLA = null;

            if (Colas.length()==10) { //CALCULANDO LOS ESPACIOS SI ES IGUAL A 10 ENTONCES LA PALABRA ES DESARROLLO
                COLA = "desarrollo";
            } else if (Colas.length()==4) {
                COLA="mesa";

            } else if (Colas.length()==7) {
                COLA="soporte";

            }

            //crear ticket
            ticket tiket = new ticket(ticket.getContador(),nitreause,problema,COLA);
            ColaServicioA[indice] = tiket;
            indice++;
            bitacora bitacora = new bitacora(ColaServicioA[valor].getTicket(),"Asignado",0,LocalDate.now(), LocalTime.now(),"Aun no resuelto");
            Bitacorageneral[ContadorBitacora] = bitacora;
            ContadorBitacora++;

        }



    }
    //INICIO METODOS MOSTRAR

    /**
     * Metodo que muestra todos los tikets esten o no resueltos
     */
    public void Mostrar_Todos() {


        for (int i = 0; i < indice; i++) {

            System.out.println(ColaServicioA[i]);
        }
    }

    /**
     * Metodo que muestra la Bitacora General
     */
    public void BitacoraGeneral() {


        for (int i = 0; i < ContadorBitacora; i++) {

            System.out.println(Bitacorageneral[i]);
        }
    }

    /**
     * Metodo que Muestra los tickts de Cola mesa De ayuda esten o no resueltos
     */
    public void MostrarColaMesa() {

        for (int i = 0; i < indice; i++) {
            if (ColaServicioA[i].getCola()=="mesa"||ColaServicioA[i].getCola()=="mesa-Atendido") {
                System.out.println(ColaServicioA[i]);
            }
        }
    }

    /**
     * Metodo que Muestra los tickts de Cola Soporte De esten o no resueltos
     */
    public void MostrarColaSoporte() {

        for (int i = 0; i < indice; i++) {
            if (ColaServicioA[i].getCola()=="soporte"||ColaServicioA[i].getCola()=="soporte-Atendio") {
                System.out.println(ColaServicioA[i]);
            }
        }
    }

    /**
     * Muestra Todo lo que contiene la Cola Desarrollador sin importar si el ticket esta resuelto o no
     */
    public void MostrarColaDesarrollador() {

        for (int i = 0; i < indice; i++) {
            if (ColaServicioA[i].getCola()=="desarrollo"||ColaServicioA[i].getCola()=="desarrollo-Atendido") {
                System.out.println(ColaServicioA[i]);
            }
        }
    }







}






