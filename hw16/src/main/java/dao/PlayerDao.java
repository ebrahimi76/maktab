package dao;

import dao.core.BaseDao;
import entity.people.Player;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class PlayerDao extends BaseDao<Player> {
    public PlayerDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Player> getEntityClass() {
        return Player.class;
    }

    public List<Player> getExpensivePlayers() {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Player> c = cb.createQuery(Player.class);
        Root<Player> root = c.from(Player.class);
        c.select(root).where(cb.greaterThanOrEqualTo(root.get("salary"), 100_000));
        TypedQuery<Player> typed = getEntityManager().createQuery(c);
        return typed.getResultList();
    }
}
