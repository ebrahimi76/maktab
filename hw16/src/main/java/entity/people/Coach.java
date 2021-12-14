package entity.people;

import entity.soccerInfo.Team;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Coach extends Person {
    @OneToOne
    private Team team;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Coach(Integer id, String name, double salary, Date hireDate, Date hireExpiryDate, Team team) {
        super(id, name, salary, hireDate, hireExpiryDate);
        this.team = team;
    }

    public Coach() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coach coach = (Coach) o;
        return Objects.equals(team, coach.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team);
    }

    @Override
    public String toString() {
        return "Coach{" +
                "team=" + team.getName() +
                "} " + super.toString();
    }

    public static CoachBuilder coachBuilder() {
        return new CoachBuilder();
    }

    public static class CoachBuilder {
        private Integer id;
        private String name;
        private double salary;
        private Date hireDate;
        private Date hireExpiryDate;
        private Team team;

        public CoachBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public CoachBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CoachBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public CoachBuilder setHireDate(Date hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public CoachBuilder setHireExpiryDate(Date hireExpiryDate) {
            this.hireExpiryDate = hireExpiryDate;
            return this;
        }

        public CoachBuilder setTeam(Team team) {
            this.team = team;
            return this;
        }

        public Coach build() {
            return new Coach(id, name, salary, hireDate, hireExpiryDate, team);
        }
    }
}
