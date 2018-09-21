package temp1;
import java.util.List;

public class Boss {
    private String name;
    private Car car;
    private Office office;
    private List favorites = new ArrayList();
    public Boss(String name,Car car,Office office){
        this.name = name;
        this.car = car;
        this.office = office;
    }

    public void setFavorites(List favorites){
        this.favorites = favorites;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}

class Car{

}

class Office{

}
