

public class Car {

    private String brand;
    private int year;
    public Car() {
      brand = "";
      year = 0;
    }

    public Car(String newBrand) {

      if(newBrand.equals("Honda")) {
        brand = newBrand;
      }

      if(newBrand.equals("Jeep")) {
        brand = newBrand;
      }

    }

    String getbrand() {
      return brand;
    }

    int getYear() {
      if(brand.equals("Jeep")) {
        year = 2009;
      }
      return year;
    }

}
