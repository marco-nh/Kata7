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
import toyproducts.components.asian.AsianEngine;
import toyproducts.components.asian.AsianRotorBlade;
import toyproducts.components.asian.AsianWheel;

public class AsianComponentFactory extends ComponentFactory {
    SerialNumberGenerator serie = new SerialNumberGenerator();
   public Wheel createWheel() {
        Wheel wheel = new AsianWheel(serie.next());
        return wheel;
    }

    public Engine createEngine() {
        Engine engine = new AsianEngine(serie.next());
        return engine;
    }

    public RotorBlade createRotorBlade() {
        RotorBlade rotorblade = new AsianRotorBlade(serie.next());
        return rotorblade;
    }

}
