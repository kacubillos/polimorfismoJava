/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriopolimorfismo;

/**
 *
 * @author Daniel
 */
public class Persona implements PuedeCantar{

    @Override
    public void cantar() {
        System.out.println("Do Re Mi Fa Sol La Si Do");
    }
    
}
