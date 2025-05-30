package servidor.controladores;

import java.rmi.Remote;
import java.rmi.RemoteException;
import servidor.DTO.NodoTurnoDTO;


//Hereda de la clase Remote, lo cual la convierte en interfaz remota
public interface ControladorGeneradorTurnoInt extends Remote
{
    
    //Definicion del primer método remoto
    public NodoTurnoDTO generarTurno(String identificacion)throws RemoteException;
     //cada definición del método debe especificar que puede lanzar la excepción java.rmi.RemoteException
    
}
