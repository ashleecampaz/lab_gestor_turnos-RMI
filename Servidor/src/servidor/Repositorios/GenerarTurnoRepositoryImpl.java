package servidor.Repositorios;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import servidor.DTO.ModuloDTO;
import servidor.DTO.NodoTurnoDTO;

/*
Clase que implementa la interface remota GestorUsuariosInt
*/

public class GenerarTurnoRepositoryImpl implements GenerarTurnoRepositoryInt
{  
    private int numeroTurno;
    private int cantidadUsuariosFila =0; 
    private final ModuloDTO vectorModulos[];
    private final String usuariosFilaVirtual[]; 

    public GenerarTurnoRepositoryImpl() {
        System.out.println("Configurando los modulo ...");
        this.vectorModulos = new ModuloDTO[3]; 
        this.usuariosFilaVirtual = new String[10]; 
        this.numeroTurno = 1; 
        for(int i=0; i<3; i++){
            this.vectorModulos[i] = new ModuloDTO();
            this.vectorModulos[i].setNumeroModulo(i+1);
            this.vectorModulos[i].setOcupado(false); 
        }
    }
    
   public int consultarNumeroModuloDisponible(){
       int posicion = -1;
       
       for (int i=0; i<3; i++){
           if(this.vectorModulos[i].isOcupado()==false){
               posicion = i;
               break;
           }
       }
      return posicion;      
   }
    
    
    @Override
    public NodoTurnoDTO generarTurno(String identificacion) {
        int posicion = this.consultarNumeroModuloDisponible();
        
        if(posicion==-1){
            System.out.println("Los modulos se encuentran ocupados");
            this.usuariosFilaVirtual[this.cantidadUsuariosFila] = identificacion; 
            this.cantidadUsuariosFila ++; 
            System.out.println("El usuario se agrego a la fila virtual");
        }
        else{
            System.out.println("El modulo en la posicion " + posicion +
                    " esta libre y se asignara al usuario con identificacion" +
                    identificacion);
            this.vectorModulos[posicion].setOcupado(true);
            this.vectorModulos[posicion].setNumeroTurno(this.numeroTurno);
            this.vectorModulos[posicion].setIdentificacion(identificacion);
        }
        NodoTurnoDTO objNodoTurnoDTO = new NodoTurnoDTO(numeroTurno,cantidadUsuariosFila,identificacion);
        this.numeroTurno ++; 
        return objNodoTurnoDTO;
    }
           
}
