package com.app.PetCarespringsecbknd.function;

import com.app.PetCarespringsecbknd.model.Manager;
import com.app.PetCarespringsecbknd.model.Pet;
import com.app.PetCarespringsecbknd.model.PetCareCenter;
import com.app.PetCarespringsecbknd.model.PetOwner;
import com.app.PetCarespringsecbknd.model.Document;
import com.app.PetCarespringsecbknd.model.PetService;
import com.app.PetCarespringsecbknd.enums.PetServiceType;
import com.app.PetCarespringsecbknd.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.PetCarespringsecbknd.repository.PetServiceRepository;
import com.app.PetCarespringsecbknd.repository.PetOwnerRepository;
import com.app.PetCarespringsecbknd.repository.PetCareCenterRepository;
import com.app.PetCarespringsecbknd.repository.ManagerRepository;
import com.app.PetCarespringsecbknd.repository.DocumentRepository;
import com.app.PetCarespringsecbknd.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
