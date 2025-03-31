package com.example.week11.data.repository;

import com.example.week11.data.model.SoccerEntity;
import java.util.*;

public class Repository<T extends SoccerEntity> {
    protected List<T> items = new ArrayList<>();

    public void add(T item) {
        if (item == null) throw new IllegalArgumentException("Cannot add null item");
        items.add(item);
    }

    public List<T> getAll() {
        return new ArrayList<>(items);
    }

    public List<T> filterByName(String query) {
        return items.stream()
                .filter(i -> i.getName().toLowerCase().contains(query.toLowerCase()))
                .toList();
    }

    public List<T> sortByName() {
        return items.stream()
                .sorted(Comparator.comparing(SoccerEntity::getName))
                .toList();
    }
}