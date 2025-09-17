package modelEntities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Seller implements Serializable {

    private static final long serialVersionUID = 1l;

    private Integer id;
    private String name;
    private String email;
    private LocalDate birthDate;
    private Double baseSalary;

    private Department department;

    public Seller(){
    }

    public Seller(Double baseSalary, LocalDate birthDate, Department department, String email, Integer id, String name) {
        this.baseSalary = baseSalary;
        this.birthDate = birthDate;
        this.department = department;
        this.email = email;
        this.id = id;
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id) && Objects.equals(name, seller.name) && Objects.equals(email, seller.email) && Objects.equals(birthDate, seller.birthDate) && Objects.equals(baseSalary, seller.baseSalary) && Objects.equals(department, seller.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, birthDate, baseSalary, department);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "baseSalary=" + baseSalary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", department=" + department +
                '}';
    }
}
