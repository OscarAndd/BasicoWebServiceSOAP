package beans;

import jakarta.ejb.Stateless;
import jakarta.jws.WebService;


/**
 *
 * @author Oscar
 */
@Stateless
@WebService
public class ServicioSumarIMP implements ServicioSumarWS{

    @Override
    public int sumar(int a, int b) {
        return a+b;
    }
}
