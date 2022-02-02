package com.ibm.bike.locacao.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//@Entity
@Data
@Document()
public class Bicycle {

    @Id
    private String id;

    private String modelo;

    private String cor;

}

