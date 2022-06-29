package lab4;

public class Cosmetic {
    /** Field name */
    String name;
    /** Field brand */
    String brand;
    /** Field country */
    String country;
    /** Field prise */
    float prise;
    /** Field year */
    int year;

    /**
     * Cosmetic class constructor contains 5 fields:
     * name of the product, brand, country, prise and year of manufacture.
     * @param name Product name
     * @param brand The brand that released the product
     * @param country Country of manufacture
     * @param prise The price of the goods in dollars$$$
     * @param year Year of manufacture
     */
    public Cosmetic(String name, String brand, String country, float prise, int year) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.prise = prise;
        this.year = year;
    }

    /**
     * This class returns the name of product
     */
    public String getName() {
        return name;
    }

    /**
     * This class returns the brand that released the product
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This class returns the country of manufacture
     */
    public String getCountry() {
        return country;
    }

    /**
     * This class returns the price of the goods in dollars$
     */
    public float getPrise() {
        return prise;
    }

    /**
     * This class returns year of manufacture
     */
    public int getYear() {
        return year;
    }
}

