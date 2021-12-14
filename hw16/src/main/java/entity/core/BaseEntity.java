package entity.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static BaseEntityBuilder baseBuilder() {
        return new BaseEntityBuilder();
    }

    public BaseEntity() {
    }

    public BaseEntity(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "id=" + id +
                '}';
    }

    public static class BaseEntityBuilder {
        private Integer id;

        public BaseEntityBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public BaseEntity build() {
            return new BaseEntity(id);
        }
    }
}
