/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flight.managment.system;

import java.util.UUID;

/**
 *
 * @author monirozzaman.rony
 */
public class Configration {

    public static String getRendomId() {
        return UUID.randomUUID().toString();
    }

}
