package com.app.PetCarespringsecbknd.repository;


import com.app.PetCarespringsecbknd.model.Document;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class DocumentRepository extends SimpleJpaRepository<Document, String> {
    private final EntityManager em;
    public DocumentRepository(EntityManager em) {
        super(Document.class, em);
        this.em = em;
    }
    @Override
    public List<Document> findAll() {
        return em.createNativeQuery("Select * from \"petcarespringsecbknd_820\".\"Document\"", Document.class).getResultList();
    }
}