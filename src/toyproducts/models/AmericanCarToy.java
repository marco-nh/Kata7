
package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.Wheel;
import toyproducts.components.american.AmericanEngine;
import toyproducts.components.american.AmericanWheel;

public class AmericanCarToy implements Toy {
    Integer serialNumber;
    String type;
    Engine engine;
    Wheel wheel;
    ComponentFactory f;
    
    public AmericanCarToy(Integer serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
        f = new AmericanComponentFactory();
    }
    
    public void pack(){
        System.out.println("Id juguete: " + serialNumber + " Id motor: " + engine.getId() + "Id ruedas: " + wheel.getId());
    }
    
    public void label(){
        System.out.println("Juguete tipo:" + type);
    }

    public void prepare() {
        engine = f.createEngine();
        engine.setQuantity(1);
        System.out.println("Motor construido, cantidad: " + engine.getEngine());
        wheel = f.createWheel();
        wheel.setQuantity(4);
        System.out.println("Ruedas construidas, cantidad: " + wheel.getWheel());
    }
    
}
