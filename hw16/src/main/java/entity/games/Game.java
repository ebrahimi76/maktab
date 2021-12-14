package entity.games;

import entity.core.BaseEntity;
import entity.soccerInfo.Team;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Game extends BaseEntity {
    @Column
    private Date matchDate;
    @ManyToOne
    private Team home;
    @ManyToOne
    private Team away;
    @Column
    private int homeGoals;
    @Column
    private int awayGoals;
    @Column
    private int homePoints;
    @Column
    private int awayPoints;

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public Integer getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(Integer homeGoals) {
        this.homeGoals = homeGoals;
    }

    public Integer getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(Integer awayGoals) {
        this.awayGoals = awayGoals;
    }

    public Integer getHomePoints() {
        return homePoints;
    }

    public void setHomePoints(Integer homePoints) {
        this.homePoints = homePoints;
    }

    public Integer getAwayPoints() {
        return awayPoints;
    }

    public void setAwayPoints(Integer awayPoints) {
        this.awayPoints = awayPoints;
    }

    public Game(Integer id, Date matchDate, Team home, Team away, Integer homeGoals, Integer awayGoals,
                Integer homePoints, Integer awayPoints) {
        super(id);
        this.matchDate = matchDate;
        this.home = home;
        this.away = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }

    public Game() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Game game = (Game) o;
        return Objects.equals(matchDate, game.matchDate) && Objects.equals(home, game.home) &&
                Objects.equals(away, game.away) && Objects.equals(homeGoals, game.homeGoals) &&
                Objects.equals(awayGoals, game.awayGoals) && Objects.equals(homePoints, game.homePoints) &&
                Objects.equals(awayPoints, game.awayPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matchDate, home, away, homeGoals, awayGoals, homePoints, awayPoints);
    }

    @Override
    public String toString() {
        return "Game{" +
                "matchDate=" + matchDate +
                ", home=" + home.getName() +
                ", away=" + away.getName() +
                ", homeGoals=" + homeGoals +
                ", awayGoals=" + awayGoals +
                ", homePoints=" + homePoints +
                ", awayPoints=" + awayPoints +
                "} " + super.toString();
    }

    public static GameBuilder gameBuilder() {
        return new GameBuilder();
    }

    public static class GameBuilder {
        private Integer id;
        private Date matchDate;
        private Team home;
        private Team away;
        private Integer homeGoals;
        private Integer awayGoals;
        private Integer homePoints;
        private Integer awayPoints;

        public GameBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public GameBuilder setMatchDate(Date matchDate) {
            this.matchDate = matchDate;
            return this;
        }

        public GameBuilder setHome(Team home) {
            this.home = home;
            return this;
        }

        public GameBuilder setAway(Team away) {
            this.away = away;
            return this;
        }

        public GameBuilder setHomeGoals(Integer homeGoals) {
            this.homeGoals = homeGoals;
            return this;
        }

        public GameBuilder setAwayGoals(Integer awayGoals) {
            this.awayGoals = awayGoals;
            return this;
        }

        public GameBuilder setHomePoints(Integer homePoints) {
            this.homePoints = homePoints;
            return this;
        }

        public GameBuilder setAwayPoints(Integer awayPoints) {
            this.awayPoints = awayPoints;
            return this;
        }

        public Game build() {
            return new Game(id, matchDate, home, away, homeGoals, awayGoals, homePoints, awayPoints);
        }
    }
}
