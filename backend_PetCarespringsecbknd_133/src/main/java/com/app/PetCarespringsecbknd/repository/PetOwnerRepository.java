package com.app.PetCarespringsecbknd.repository;


import com.app.PetCarespringsecbknd.model.PetOwner;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PetOwnerRepository extends SimpleJpaRepository<PetOwner, String> {
    private final EntityManager em;
    public PetOwnerRepository(EntityManager em) {
        super(PetOwner.class, em);
        this.em = em;
    }
    @Override
    public List<PetOwner> findAll() {
        return em.createNativeQuery("Select * from \"petcarespringsecbknd_820\".\"PetOwner\"", PetOwner.class).getResultList();
    }
}