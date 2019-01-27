package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Menu {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    @Size(min = 3, max = 15)
    private String name;

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    @ManyToMany
    private List<Cheese> cheeses = new ArrayList<>();

    public Menu(){}

    public void addItem(Cheese item){
        cheeses.add(item);
    }
}
