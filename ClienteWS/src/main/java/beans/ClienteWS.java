/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package beans;

import clientews.servicio.ServicioSumarIMP;
import clientews.servicio.ServicioSumarIMPService;

/**
 *
 * @author Oscar
 */
public class ClienteWS {

    public static void main(String[] args) {
        ServicioSumarIMP servicio= new ServicioSumarIMPService().getServicioSumarIMPPort();
        
        
        System.out.println("Resultado: "+ servicio.sumar(1, 3));
    }
}
