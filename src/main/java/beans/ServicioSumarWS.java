/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package beans;

import jakarta.ejb.Remote;


@Remote
public interface ServicioSumarWS {
    
   public int sumar(int a, int b);
}
