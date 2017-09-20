package edu.gcccd.csis;

// All method creation performed by the great and wonderful IntelliJ IDEA

// Use a real Calendar
import java.util.Calendar;

public class Employee {
    // Time to describe some Employee variables
    private String name;
    private String jobTitle;
    private Company company;
    private Calendar birthday;

    // This is the default constructor since I needed one
    public Employee() {
    }

    // This is a good constructor, but it meant I need to create a default one
    public Employee(String name, String jobTitle, Company company, Calendar birthday) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.company = company;
        this.birthday = birthday;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    // I've created my own equals method
    // or rather, I had IntelliJ IDEA create it for me
    // It checks that the object's name, company and birthday are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!name.equals(employee.name)) return false;
        if (!company.equals(employee.company)) return false;
        return birthday.equals(employee.birthday);
    }

}
