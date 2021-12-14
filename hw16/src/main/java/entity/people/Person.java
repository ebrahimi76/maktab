package entity.people;

import entity.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Date;
import java.util.Objects;

@MappedSuperclass
public class Person extends BaseEntity {
    @Column
    private String name;
    @Column
    private double salary;
    @Column
    private Date hireDate;
    @Column
    private Date hireExpiryDate;

    public Person(Integer id, String name, double salary, Date hireDate, Date hireExpiryDate) {
        super(id);
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.hireExpiryDate = hireExpiryDate;
    }

    public Person() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return Double.compare(person.salary, salary) == 0 && Objects.equals(name, person.name) &&
                Objects.equals(hireDate, person.hireDate) && Objects.equals(hireExpiryDate, person.hireExpiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, salary, hireDate, hireExpiryDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getHireExpiryDate() {
        return hireExpiryDate;
    }

    public void setHireExpiryDate(Date hireExpiryDate) {
        this.hireExpiryDate = hireExpiryDate;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", hireExpiryDate=" + hireExpiryDate +
                "} " + super.toString();
    }

    public static PersonBuilder personBuilder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private Integer id;
        private String name;
        private double salary;
        private Date hireDate;
        private Date hireExpiryDate;

        public PersonBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public PersonBuilder setHireDate(Date hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public PersonBuilder setHireExpiryDate(Date hireExpiryDate) {
            this.hireExpiryDate = hireExpiryDate;
            return this;
        }

        public Person build() {
            return new Person(id, name, salary, hireDate, hireExpiryDate);
        }
    }
}
