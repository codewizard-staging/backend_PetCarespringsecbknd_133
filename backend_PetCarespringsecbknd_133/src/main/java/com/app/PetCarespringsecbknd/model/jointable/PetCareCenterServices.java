package com.app.PetCarespringsecbknd.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.PetCarespringsecbknd.model.Manager;
import com.app.PetCarespringsecbknd.model.Pet;
import com.app.PetCarespringsecbknd.model.PetCareCenter;
import com.app.PetCarespringsecbknd.model.PetOwner;
import com.app.PetCarespringsecbknd.model.Document;
import com.app.PetCarespringsecbknd.model.PetService;
import com.app.PetCarespringsecbknd.enums.PetServiceType;
import com.app.PetCarespringsecbknd.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterServices")
@Table(schema = "\"petcarespringsecbknd_820\"", name = "\"PetCareCenterServices\"")
@Data
public class PetCareCenterServices{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"ServiceId\"")
    private Integer serviceId;
 
}