
package servidor.Repositorios;

import servidor.DTO.NodoTurnoDTO;

public interface GenerarTurnoRepositoryInt
{
    
    public boolean registrarUsuario(NodoTurnoDTO objUsuario);
    public int consultarCantidadUsuarios();
    public NodoTurnoDTO consultarUsuario(int identificacion);
}


