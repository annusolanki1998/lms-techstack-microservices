package com.bridgelabz.lmstechstackservice.model;

import com.bridgelabz.lmstechstackservice.dto.TechStackDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "techstack")
public class TechStackModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String imagePath;
    private String status;
    private String techName;
    private String email;
    private LocalDateTime creationTimeStamp;
    private LocalDateTime updatedTimeStamp;

    public TechStackModel(TechStackDTO techStackDTO) {
        this.imagePath = techStackDTO.getImagePath();
        this.status = techStackDTO.getStatus();
        this.techName = techStackDTO.getTechName();
        this.email=techStackDTO.getEmail();


    }

    public TechStackModel() {

    }
}
