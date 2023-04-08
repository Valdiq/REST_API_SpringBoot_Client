package com.example.rest_api_project.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Data;

@Data
public class PlayerDTO {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String nationality;
    private int salary;
    private int club;


}
