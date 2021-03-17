package dev.group3.entities;

import javax.persistence.*;

@Entity
@Table(name = "prize")
public class Prize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prize_id")
    private int prizeId;

    @Column(name = "prize_name")
    private String name;

    @Column(name = "prize_cost")
    private double cost;

    @Column(name = "description")
    private String description;


    public Prize(){}

    public Prize(int prizeId, String name, double cost, String description) {
        this.prizeId = prizeId;
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    public int getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(int prizeId) {
        this.prizeId = prizeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Prize{" +
                "prizeId=" + prizeId +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                '}';
    }
}
