package entity.soccerInfo;

import entity.core.BaseInfo;
import entity.games.Game;
import entity.people.Coach;
import entity.people.Player;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Team extends BaseInfo {
    @Column
    private String name;
    @Column
    private int score;
    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL)
    private Coach coach;
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;
    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL)
    private Stadium stadium;
    @OneToMany
    private List<Game> games;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public Team(Integer id, String cityName, String name, int score, Coach coach, List<Player> players,
                Stadium stadium, List<Game> games) {
        super(id, cityName);
        this.name = name;
        this.score = score;
        this.coach = coach;
        this.players = players;
        this.stadium = stadium;
        this.games = games;
    }

    public Team() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(score, team.score) &&
                Objects.equals(coach, team.coach) && Objects.equals(players, team.players) &&
                Objects.equals(stadium, team.stadium) && Objects.equals(games, team.games);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, score, coach, players, stadium, games);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", coach=" + coach.getName() +
                ", players=" + players +
                ", stadium=" + stadium.getName() +
                "} " + super.toString();
    }

    public static TeamBuilder teamBuilder() {
        return new TeamBuilder();
    }

    public static class TeamBuilder {
        private Integer id;
        private String cityName;
        private String name;
        private int score;
        private Coach coach;
        private List<Player> players;
        private Stadium stadium;
        private List<Game> games;

        public TeamBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public TeamBuilder setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public TeamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public TeamBuilder setScore(int score) {
            this.score = score;
            return this;
        }

        public TeamBuilder setCoach(Coach coach) {
            this.coach = coach;
            return this;
        }

        public TeamBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public TeamBuilder setStadium(Stadium stadium) {
            this.stadium = stadium;
            return this;
        }

        public TeamBuilder setGames(List<Game> games) {
            this.games = games;
            return this;
        }

        public Team build() {
            return new Team(id, cityName, name, score, coach, players, stadium, games);
        }
    }
}
