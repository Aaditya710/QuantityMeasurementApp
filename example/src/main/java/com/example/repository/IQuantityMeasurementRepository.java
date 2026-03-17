package com.example.repository;

import java.util.*;

import com.example.entity.QuantityMeasurementEntity;

// Repository interface for QuantityMeasurementEntity
public interface IQuantityMeasurementRepository {

    void save(QuantityMeasurementEntity entity);

    List<QuantityMeasurementEntity> getAllMeasurements();

    public static void main(String[] args) {
        System.out.println("Testing IQuantityMeasurementRepository interface");
    }
}