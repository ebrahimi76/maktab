package com.bank.entity;

import com.bank.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public class Person extends BaseEntity<Integer> {

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String family;

    @Column(name = "age")
    private Integer age;

    @Column(name = "national_code")
    private Long nationalCode;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "email")
    private String email;

    public Person() {
        super();
    }

    public Person(String name, String family, Integer age, Long nationalCode,
                  String address, Long phoneNumber, String email) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.nationalCode = nationalCode;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(Long nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(family, person.family) &&
                Objects.equals(age, person.age) && Objects.equals(nationalCode, person.nationalCode) &&
                Objects.equals(address, person.address) && Objects.equals(phoneNumber, person.phoneNumber) &&
                Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, family, age, nationalCode, address, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", family=" + family +
                ", age=" + age +
                ", nationalCode=" + nationalCode +
                ", address=" + address +
                ", phoneNumber=" + phoneNumber +
                ", email=" + email;
    }

    public static class PersonBuilder {
        private String name;
        private String family;
        private Integer age;
        private Long nationalCode;
        private String address;
        private Long phoneNumber;
        private String email;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder family(String family) {
            this.family = family;
            return this;
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder nationalCode(Long nationalCode) {
            this.nationalCode = nationalCode;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder phoneNumber(Long phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(name, family, age, nationalCode, address, phoneNumber, email);
        }
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }
}
