/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author DELL
 */
public class meal {
    private String meal_name;
    private int meal_id,meal_quantity;
    private float meal_price;
    public meal(int meal_id,String meal_name, float meal_price, int meal_quantity) {
        this.meal_name = meal_name;
        this.meal_id = meal_id;
        this.meal_price = meal_price;
        this.meal_quantity = meal_quantity;
    }

    public String getMeal_name() {
        return meal_name;
    }

    public void setMeal_name(String meal_name) {
        this.meal_name = meal_name;
    }

    public int getMeal_id() {
        return meal_id;
    }

    public void setMeal_id(int meal_id) {
        this.meal_id = meal_id;
    }

    public float getMeal_price() {
        return meal_price;
    }

    public void setMeal_price(int meal_price) {
        this.meal_price = meal_price;
    }

    public int getMeal_quantity() {
        return meal_quantity;
    }

    public void setMeal_quantity(int meal_quantity) {
        this.meal_quantity = meal_quantity;
    }
    
    
    
    
    
}
