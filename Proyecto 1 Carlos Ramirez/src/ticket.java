import javax.print.DocFlavor;

/**
 * @descripción ticket  representa el objeto el cual sera creado por cada reporte
 * @autor carlos ramirez
 **/
 public class ticket {
    /**
     * @param Contador como su nombre lo indica llevara el conteo de los ticket generados.
     */

        private static int contador = 1;//CONTEO DE TIKETS
    /**
     * @param ticket a esata variable se le asignara el valor de la variable contador.
     */
        private int ticket;
    /**
     * @param nitUsuario Recibe el nit del usuario que genero el ticker.
     */
    private String nitUsuario;
    /**
     *  @param problema Recibe el problema que ingrese el ususario.
     */
        private String problema;
    /**
     *  @param cola En esta variable le indicara a que cola pertenece el tiket.
     */
    public  String cola ;
    /**
     * @param estado Como su nombre lo dice indica el estado del ticket ya sea atendido o finalizado.
     */


    /**
     *
     * @param ticket Recibe el numero de ticket a crear
     * @param nitUsuario Recibe el nombre del usuario
     * @param problema Recibe el problema que el usuario ingresó
     */
        public ticket(int ticket , String nitUsuario, String problema, String cola) {


            this.ticket = contador;
            this.nitUsuario = nitUsuario;
            this.problema = problema;
            this.cola = cola;
            contador++; // contador = contador + 1


        }


    /**
     *
     * @return Contador
     */
        public static int getContador() {
            return contador;
        }

    /**
     *
     * @return Numero de ticket
     */

        public int getTicket() {
            return ticket;
        }

    /**
     *
     * @param ticket Recibe el numero de ticket
     */

    public void setTicket(int ticket) {
            this.ticket = ticket;
        }

    /**
     *
     * @return nit del usuario
     */


    public String getNitUsuario() {
            return nitUsuario;
        }

    /**
     *
     * @param nitUsuario Recibe el nit del usuario para agregar al objeto tiket
     */
        public void setNitUsuario(String nitUsuario) {
            this.nitUsuario = nitUsuario;
        }

    /**
     *
     * @return descripcion del problema
     */

    public String getProblema() {
            return problema;
        }

    /**
     *
     * @param problema recibe el problema ingresado por el usuario
     */
        public void setProblema(String problema) {
            this.problema = problema;
        }

    /**
     *
     * @return La cola Asignada
     */

    public String getCola() {

        return cola;
        }

    /**
     *
     * @param cola Recibe la cola asignada automaticamente para el ticket
     */
        public void setCola(String cola) {

            this.cola = cola;
        }

    /**
     *
     * @return el estado del ticket
     */


    /**
     *
     * @return todos los Datos en orden
     */


    @Override
        public String toString() {

            return  "NUMERO TIKET : " + ticket
                    + ", NIT USUARIO : " + nitUsuario
                    + ", DESCRIPCION PROBLEMA: " + problema
                    +",  COLA:"+ cola;
        }


    }

