package student;

public class City {

  private String name;
  private int population;

  public City(String name, int population) {
    this.name = name;
    this.population = population;

  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof City)) {
      return false;
    }

    City city = (City) obj;

    if (population != city.population) {
      return false;
    }
    return getName() != null ? getName().equals(city.getName()) : city.getName() == null;
  }

  @Override
  public int hashCode() {
    int result = getName() != null ? getName().hashCode() : 0;
    result = 31 * result + population;
    return result;
  }

  @Override
  public String toString() {
    return "City{"
        +
        "name='"
        +
        name
        +
        '\''
        +
        '}';
  }

  public String getName() {
    return name;
  }
}
