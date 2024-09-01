package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "projects")
@Where(clause = "is_deleted=false")
public class Project extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String projectCode;

    @Column(nullable = false)
    private String projectName;

    @Column(nullable = false)
    private String assignedManager;
    //by using some unique fields from the other entities
    //basically by using some unique fields from the other entities instead of saving the whole entity here.

    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate startDate;

    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate endDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status projectStatus;

    private String projectDetail;

}
