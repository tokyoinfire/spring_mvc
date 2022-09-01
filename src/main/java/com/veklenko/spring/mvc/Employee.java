package com.veklenko.spring.mvc;

import com.veklenko.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name must be minimum 2 characters")
    private String name;
    @NotEmpty(message = "Name must not be null")
    private String surname;
    @Min(value = 500, message = "Must be more than 499")
    @Max(value = 1000, message = "Must be less than 1001")
    private int salary;
    private  String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> cars;
    private String[] languages;
    private Map<String, String> languagesList;
    @Pattern(regexp = "\\d(3)-\\d(2)-\\d(2)", message = "please use pattern xxx-xx-xx")
    private String phoneNumber;
    @CheckEmail
    private String email;



    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        cars = new HashMap<>();
        cars.put("BMW", "BMW");
        cars.put("Audi", "Audi");
        cars.put("MB", "Mercedes-Benz");

        languagesList = new HashMap<>();
        languagesList.put("EN", "English");
        languagesList.put("DE", "Deutsch");
        languagesList.put("FR", "French");
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
