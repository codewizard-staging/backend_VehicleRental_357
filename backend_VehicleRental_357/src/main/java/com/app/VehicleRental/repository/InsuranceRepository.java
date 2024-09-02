package com.app.VehicleRental.repository;

import com.app.VehicleRental.model.Insurance;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class InsuranceRepository extends SimpleJpaRepository<Insurance, String> {
    private final EntityManager em;
    public InsuranceRepository(EntityManager em) {
        super(Insurance.class, em);
        this.em = em;
    }
    @Override
    public List<Insurance> findAll() {
        return em.createNativeQuery("Select * from \"vehiclerental\".\"Insurance\"", Insurance.class).getResultList();
    }
}