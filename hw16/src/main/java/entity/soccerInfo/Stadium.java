package entity.soccerInfo;

import entity.core.BaseInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Objects;

@Entity
public class Stadium extends BaseInfo {
    @Column
    private String name;
    @OneToOne
    private Team team;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Stadium(Integer id, String cityName, String name, Team team) {
        super(id, cityName);
        this.name = name;
        this.team = team;
    }

    public Stadium() {
        super();
    }

    public static StadiumBuilder stadiumBuilder() {
        return new StadiumBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Stadium stadium = (Stadium) o;
        return Objects.equals(name, stadium.name) && Objects.equals(team, stadium.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, team);
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "name='" + name + '\'' +
                ", team=" + team.getName() +
                "} " + super.toString();
    }

    public static class StadiumBuilder {
        private Integer id;
        private String cityName;
        private String name;
        private Team team;

        public StadiumBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public StadiumBuilder setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public StadiumBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StadiumBuilder setTeam(Team team) {
            this.team = team;
            return this;
        }

        public Stadium build() {
            return new Stadium(id, cityName, name, team);
        }
    }
}
