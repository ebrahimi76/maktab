package entity.people;

import entity.soccerInfo.Team;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Player extends Person {
    @ManyToOne
    private Team team;
    @Column
    private Integer shirtNumber;
    @Column
    private Position position;

    public enum Position {
        GK(1), XB(2), XM(3), XW(4);
        private final int number;

        Position(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Integer getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(Integer shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Player(Integer id, String name, double salary, Date hireDate, Date hireExpiryDate, Team team,
                  Integer shirtNumber, Position position) {
        super(id, name, salary, hireDate, hireExpiryDate);
        this.team = team;
        this.shirtNumber = shirtNumber;
        this.position = position;
    }

    public Player() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Player player = (Player) o;
        return Objects.equals(team, player.team) && Objects.equals(shirtNumber, player.shirtNumber) &&
                position == player.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team, shirtNumber, position);
    }

    @Override
    public String toString() {
        return "Player{" +
                "team=" + team.getName() +
                ", shirtNumber=" + shirtNumber +
                ", position=" + position +
                "} " + super.toString();
    }

    public static PlayerBuilder playerBuilder() {
        return new PlayerBuilder();
    }

    public static class PlayerBuilder {
        private Integer id;
        private String name;
        private double salary;
        private Date hireDate;
        private Date hireExpiryDate;
        private Team team;
        private Integer shirtNumber;
        private Position position;

        public PlayerBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public PlayerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlayerBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public PlayerBuilder setHireDate(Date hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public PlayerBuilder setHireExpiryDate(Date hireExpiryDate) {
            this.hireExpiryDate = hireExpiryDate;
            return this;
        }

        public PlayerBuilder setTeam(Team team) {
            this.team = team;
            return this;
        }

        public PlayerBuilder setShirtNumber(Integer shirtNumber) {
            this.shirtNumber = shirtNumber;
            return this;
        }

        public PlayerBuilder setPosition(Position position) {
            this.position = position;
            return this;
        }

        public Player build() {
            return new Player(id, name, salary, hireDate, hireExpiryDate, team, shirtNumber, position);
        }
    }
}
