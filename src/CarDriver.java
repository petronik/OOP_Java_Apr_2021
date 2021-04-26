// class NewCar {
//     private String _color;
//     private double _price;

//     public double getPrice() {
//         return  _price;
//     }

//     public NewCar(double cost, String color){
//         _color = color;
//         _price = cost * 2;
//     }
//     public boolean equals(NewCar obj) {
//         return _color.equals(obj._color) && _price == obj._price;
//     }
//     public void display() {
//         System.out.printf("price = $%,.2f , color = %s\n", getPrice() , this._color);
//     }
    
// }
// class UsedCar {
//     private double _mileage;
//     private double _price;

//     public double getPrice() {
//         return  _price;
//     }
//     public UsedCar(double cost, int mileage){
//         _mileage = mileage;
//         _price = cost * 2;
        
//     }
//     public boolean equals(UsedCar obj) {
//         return _mileage == obj._mileage && _price == obj._price;
//     }
//     public void display() {
//         System.out.printf("price = $%,.2f , mileage = $%,.0f", getPrice() , this._mileage);
//     }
// }



// public class CarDriver {
//     public static void main(String[] args){
//         NewCar new1 = new NewCar(8000.33, "silver");
//         NewCar new2 = new NewCar(8000.33, "silver");
//         if (new1.equals(new2)){
//             new1.display();
//         }
//         UsedCar used1 = new UsedCar(2500, 100000);
//         UsedCar used2 = new UsedCar(2500, 100000);
//         if (used1.equals(used2)){
//             used1.display();
//         }
//     }
// }
 
