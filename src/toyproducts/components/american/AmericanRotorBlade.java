/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package toyproducts.components.american;

import toyproducts.components.RotorBlade;

public class AmericanRotorBlade implements RotorBlade{
    Integer quantity;
    Integer id;

    public AmericanRotorBlade(Integer id) {
        this.quantity = 0;
        this.id = id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public int getRotorBlade() {
        return quantity;
    }
    
    public Integer getId() {
        return id;
    }
}
