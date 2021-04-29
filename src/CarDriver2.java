class NewCar{
    private String _color;
    private double _price;

    public double getPrice() {
        return _price;
    }


public NewCar(double cost, String color) {
    _color = color;
    _price = cost * 2;
}
public boolean equils(NewCar obj) {
    return _color.equals(obj._color) && _price == obj._price;
}
public void display(){
    System.out.println("price = $%,.2f, color = %s\n", getPrice(), this._color);
}


class UsedCar {
    private int _mileage;
    private double _price;

    public double getPrice() {
        return _price;
    }
}

public class CarDriver2 {
    public static void main(String[] args){
        NewCar new1 = new NewCar(8000.33, "silver");
        NewCar new2 = new NewCar(8000.33, "silver");
        if (new1.equals(new2)){
            new1.display();
        }
        UsedCar used1 = new UsedCar(2500, 100000);
        UsedCar used2 = new UsedCar(2500, 100000);
        if (used1.equals(used2)){
            used1.display();
        }
    }
}
