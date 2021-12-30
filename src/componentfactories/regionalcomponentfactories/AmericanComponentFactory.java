/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory;
import factories.SerialNumberGenerator;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;
import toyproducts.components.american.AmericanEngine;
import toyproducts.components.american.AmericanRotorBlade;
import toyproducts.components.american.AmericanWheel;

public class AmericanComponentFactory extends ComponentFactory {
    SerialNumberGenerator serie = new SerialNumberGenerator();
    public Wheel createWheel() {
        Wheel wheel = new AmericanWheel(serie.next());
        System.out.println(serie.next());
        return wheel;
    }

    public Engine createEngine() {
        Engine engine = new AmericanEngine(serie.next());
        System.out.println(serie.next());
        return engine;
    }

    public RotorBlade createRotorBlade() {
        RotorBlade rotorblade = new AmericanRotorBlade(serie.next());
        return rotorblade;
    }

}
