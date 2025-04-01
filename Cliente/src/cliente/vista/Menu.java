package cliente.vista;

import cliente.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
import servidor.DTO.UsuarioDTO;
import servidor.controladores.ControladorGestorUsuariosInt;

public class Menu {
    
    private final ControladorGestorUsuariosInt objRemoto;
    
    public Menu(ControladorGestorUsuariosInt objRemoto)
    {
        this.objRemoto=objRemoto;
    }
    
    public void ejecutarMenuPrincipal()
    {
        int opcion = 0;
        do
        {
            System.out.println("==Menu==");
            System.out.println("1. Registrar Usuario");			
            System.out.println("2. Consultar Cantidad de Usuarios");
            System.out.println("3. Consultar usuario");
            System.out.println("4. Salir");

            opcion = UtilidadesConsola.leerEntero();

            switch(opcion)
            {
                case 1:
                        Opcion1();
                        break;
                case 2:
                        Opcion2();
                        break;	
                case 3:
                        Opcion3();
                        break;
                case 4:
                        System.out.println("Salir...");
                        break;
                default:
                        System.out.println("Opción incorrecta");
            }

        }while(opcion != 4);
    }

    private void Opcion1() 
    {
        try
        {
                System.out.println("==Registro del Cliente==");
                System.out.println("Ingrese la identificacion");
                int id = UtilidadesConsola.leerEntero();
                System.out.println("Ingrese el nombre completo ");
                String nombres = UtilidadesConsola.leerCadena();
                System.out.println("Ingrese los apellidos ");
                String apellidos = UtilidadesConsola.leerCadena();
                UsuarioDTO objUsuario= new UsuarioDTO(id, nombres, apellidos);

                boolean valor = objRemoto.registrarUsuario(objUsuario);
                if(valor)
                        System.out.println("Registro realizado satisfactoriamente...");
                else
                        System.out.println("no se pudo realizar el registro...");
        }
        catch(RemoteException e)
        {
                System.out.println("La operacion no se pudo completar, intente nuevamente...");
        }
    }



    private void Opcion2()
    {	
            try
            {
                    System.out.println("==Numero de usuarios==");
                    int tamanio  = objRemoto.consultarCantidadUsuarios();
                    System.out.println("El numero de usuarios registrados es de: "+ tamanio);
            }
            catch(RemoteException e)
            {
                    System.out.println("La operación no se pudo completar, intente nuevamente...");
                    System.out.println("Excepcion generada: " + e.getMessage());
            }	
    }

    private void Opcion3() 
    {
        try
        {
            System.out.println("==Consulta de un Cliente==");
            System.out.println("Ingrese la identificacion");
            int id = UtilidadesConsola.leerEntero();			

            UsuarioDTO objUsuario= objRemoto.consultarUsuario(id);
            if(objUsuario!=null)
            {
                    System.out.println("Nombres: " + objUsuario.getNombres());
                    System.out.println("Apellidos: " + objUsuario.getApellidos());
            }
            else
                    System.out.println("Usuario no encontrado");
        }
        catch(RemoteException e)
        {
                System.out.println("La operacion no se pudo completar, intente nuevamente...");
        }
    }
}
