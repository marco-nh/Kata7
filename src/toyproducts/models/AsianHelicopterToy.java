package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;
import toyproducts.components.asian.AsianEngine;
import toyproducts.components.asian.AsianRotorBlade;

public class AsianHelicopterToy implements Toy {
    Integer serialNumber;
    String type;
    Engine engine;
    RotorBlade rotorblade;
    ComponentFactory f;
    
    public AsianHelicopterToy(Integer serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
        f = new AsianComponentFactory();
    }

    public void label() {
        System.out.println("Juguete tipo:" + type);
    }

    public void pack() {
        System.out.println("Id juguete: " + serialNumber + " Id motor: " + engine.getId() + "Id helice: " + rotorblade.getId());
    }
    public void prepare() {
         engine = f.createEngine();
        engine.setQuantity(1);
        System.out.println("Motor construido, cantidad: " + engine.getEngine());
        rotorblade = f.createRotorBlade();
        rotorblade.setQuantity(4);
        System.out.println("Helices construidas, cantidad: " + rotorblade.getRotorBlade());
    }
}
