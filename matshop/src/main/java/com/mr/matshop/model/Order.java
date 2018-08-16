package com.mr.matshop.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    private List<Item> itemList;

    public Order() {
        itemList = new ArrayList<>();
    }
}
