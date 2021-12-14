package entity.core;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public class BaseInfo extends BaseEntity {
    @Column
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public BaseInfo() {
        super();
    }

    public BaseInfo(Integer id, String cityName) {
        super(id);
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BaseInfo baseInfo = (BaseInfo) o;
        return Objects.equals(cityName, baseInfo.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cityName);
    }

    @Override
    public String toString() {
        return "cityName='" + cityName + '\'' +
                "} " + super.toString();
    }

    public static BaseInfoBuilder BaseInfoBuilder() {
        return new BaseInfoBuilder();
    }

    public static class BaseInfoBuilder {
        private Integer id;
        private String cityName;

        public BaseInfoBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public BaseInfoBuilder setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public BaseInfo build() {
            return new BaseInfo(id, cityName);
        }
    }
}
