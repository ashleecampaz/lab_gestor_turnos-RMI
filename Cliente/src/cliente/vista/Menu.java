package cliente.vista;

import cliente.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
import servidor.DTO.NodoTurnoDTO;
import servidor.controladores.ControladorGeneradorTurnoInt;

public class Menu {
    
    private final ControladorGeneradorTurnoInt objRemoto;
    
    public Menu(ControladorGeneradorTurnoInt objRemoto)
    {
        this.objRemoto=objRemoto;
    }
    
    public void ejecutarMenuPrincipal()
    {
        int opcion = 0;
        do
        {
            System.out.println("=====Menu=====");
            System.out.println("   Generar turno ");
            System.out.println("   Salir");
            System.out.println("=====      ===");
            System.out.println("Digite opción:");
            

            opcion = UtilidadesConsola.leerEntero();

            switch(opcion)
            {
                case 1:
                        Opcion1();
                        break;
              
                case 2:
                        System.out.println("Salir...");
                        break;
                default:
                        System.out.println("Opción incorrecta");
            }

        }while(opcion != 3);
    }

    private void Opcion1() 
    {
        try
        {
                System.out.println("==Registro==");
                System.out.println("Digite la identificacion");
                String identificacion = UtilidadesConsola.leerCadena();
                System.out.println("Datos generados por el sistema");
               

                NodoTurnoDTO valor = objRemoto.generarTurno(identificacion);
                if(valor!= null)
                        System.out.println("Registro realizado satisfactoriamente...");
                else 
                        System.out.println("no se pudo realizar el registro...");
        }
        catch(RemoteException e)
        {
                System.out.println("La operacion no se pudo completar, intente nuevamente...");
        }
    }



   
}
