package patitas.com.pe;

import android.app.Application;

import java.util.ArrayList;

import patitas.com.pe.models.Order;
import patitas.com.pe.models.Pet;

public class VeteriApp extends Application {
    public ArrayList<Pet> petList = new ArrayList<>();
    public ArrayList<Order> orderList = new ArrayList<>();
    public ArrayList<Pet> getPetList() {
        return petList;
    }

    public void addPet(Pet pet) {
        petList.add(pet);
    }
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }


}
