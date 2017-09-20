package edu.gcccd.csis;

// All method creation performed by the great and wonderful IntelliJ IDEA

public class Company {
    // Time to describe some Company variables
    private String name;
    private int numberOfEmployees;

    // This is the default constructor since I needed one
    // I didn't actually use IntelliJ IDEA to create this one
    // I just typed it in
    public Company() {
    }

    // This is a good constructor, but it meant I need to create a default one
    public Company(String name, int numberOfEmployees) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
    }

    // Setting comments for all of these getters and setters would take a while
    // I'll just summarize that there are several listed below
    // Hint:  The method names start with get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    // I've created my own equals method
    // or rather, I had IntelliJ IDEA create it for me
    // It checks that the object's name and number of employees are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (numberOfEmployees != company.numberOfEmployees) return false;
        return name.equals(company.name);
    }

}
