/**
 * <h3></h3>
 *
 * @descripción
 * @autor carlos ramirez
 **/
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *@descripción por cada accion realizada en el programa se creara un objeto bitacora para agregarlo a la Clase bitacora la cual contiene todas las acciones realizadas
 * @autor carlos ramirez
 */
public class bitacora {
    /**
     *  numerotiket Recibe el numero de tiquet que se esta trabajando.

     */
    private int numerotiket;
    /**
     * Eventos Recibe el evento que se esta ejecutando por ejemplo agregando a la cola mesa, agregando a cola soporte etc.
     */
    private String Eventos;
    /**
     * NitSoporte Recibe el nit del operador que esta solucionando el problema.
     */
    private  int NitSoporte;
    /**
     * Fecha Recibe la fecha exacta en el que se inicia un evento
     */
    private LocalDate Fecha;
    /**
     * Hora Recibe la hora exacta en la que se inicia un evento
     */
    private LocalTime Hora;
    /**
     * Mensaje Recibe el mensaje del operador de como dio solucion al error ;
     */
    private  String Mensaje;

    /**
     *
     * @param numerotiket Recibe el numero de ticket dependiendo de la posicion en la que se va agregar a ColaServicio.
     * @param eventos Ingresa el evento generado.
     * @param nitSoporte Ingresa al objeto bitacora el nit del operador.
     * @param fecha Ingresa a objeto bitacora la fecha en la que se opera un objeto.
     * @param hora Ingresa a objeto bitacora la Hora  en la que se opera un objeto.
     * @param mensaje Ingresa a objeto bitacora el Mensaje de como soluciono el problema.
     */

    public bitacora(int numerotiket, String eventos, int nitSoporte, LocalDate fecha, LocalTime hora, String mensaje) {
        this.numerotiket = numerotiket;
        Eventos = eventos;
        NitSoporte = nitSoporte;
        Fecha = fecha;
        Hora = hora;
        Mensaje = mensaje;
    }

    /**
     *
     * @return retorna el numero de ticket
     */
    public int getNumerotiket() {
        return numerotiket;
    }

    /**
     *
     * @param numerotiket recibe el numero de ticket
     */

    public void setNumerotiket(int numerotiket) {
        this.numerotiket = numerotiket;
    }

    /**
     *
     * @return el evento generado
     */

    public String getEventos() {
        return Eventos;
    }

    /**
     *
     * @param eventos Recibe el evento del en bitacora
     */
    public void setEventos(String eventos) {
        Eventos = eventos;
    }

    /**
     *
     * @return Retorna el Nit del operador
     */

    public int getNitSoporte() {
        return NitSoporte;
    }

    /**
     *
     * @param nitSoporte Recibe el Nit del operador
     */

    public void setNitSoporte(int nitSoporte) {
        NitSoporte = nitSoporte;
    }

    /**
     *
     * @return Retorna la fecha de modificacion o operacion de ticket
     */
    public LocalDate getFecha() {
        return Fecha;
    }

    /**
     *
     * @param fecha Recibe la fecha de modificacion o operacion de ticket
     */

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    /**
     *
     * @return  Retorna la Hora  de modificacion o operacion de ticket
     */

    public LocalTime getHora() {
        return Hora;
    }

    /**
     *
     * @param hora Recibe  la Hora de modificacion o operacion de ticket
     */

    public void setHora(LocalTime hora) {
        Hora = hora;
    }

    /**
     *
     * @return Retorna el mensaje de solucion
     */

    public String getMensaje() {
        return Mensaje;
    }

    /**
     *
     * @param mensaje recibe el mensaje de solucion
     */

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    /**
     *
     * @return Muestra los datos ordenados
     */
    @Override
    public String toString() {
        return
                "  ID_Ticket=" + numerotiket +
                ", Eventos='" + Eventos + '\'' +
                ", NitSoporte=" + NitSoporte +
                ", Fecha=" + Fecha +
                ", Hora=" + Hora +
                ", Mensaje='" + Mensaje + '\'';
    }
}