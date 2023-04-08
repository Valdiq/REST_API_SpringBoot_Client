package com.example.rest_api_project.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "players")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private int id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Column(name = "surname")
    @Getter
    @Setter
    private String surname;

    @Column(name = "age")
    @Getter
    @Setter
    private int age;

    @Column(name = "nationality")
    @Getter
    @Setter
    private String nationality;

    @Column(name = "salary")
    @Getter
    @Setter
    private int salary;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "club_id")
    @JsonIgnore
    @Getter
    @Setter
    private Club club;

    @JsonProperty("clubId")
    public Integer getClubId() {
        return club != null ? club.getId() : null;
    }


}
