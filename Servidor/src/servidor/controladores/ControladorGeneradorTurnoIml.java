
package servidor.controladores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import servidor.DTO.NodoTurnoDTO;
import servidor.Repositorios.GenerarTurnoRepositoryInt;

public class ControladorGeneradorTurnoIml extends UnicastRemoteObject implements ControladorGeneradorTurnoInt{
    
    private final GenerarTurnoRepositoryInt objRepository;

    public ControladorGeneradorTurnoIml(GenerarTurnoRepositoryInt objRepository) throws RemoteException {
        super();
        this.objRepository = objRepository;
    }

    
    @Override
    public NodoTurnoDTO generarTurno(String identificacion) throws RemoteException {
        return this.objRepository.generarTurno(identificacion);
    }

    
}
