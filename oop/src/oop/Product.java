
package oop;

public class Product {
     private String name;
    private int unitprice;
    private int discount;
    private int unitsInStock;
    private String imageUrl;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the unitprice
     */
    public int getUnitprice() {
        return unitprice;
    }

    /**
     * @param unitprice the unitprice to set
     */
    public void setUnitprice(int unitprice) {
        this.unitprice = unitprice;
    }

    /**
     * @return the discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * @return the unitsInStock
     */
    public int getUnitsInStock() {
        return unitsInStock;
    }

    /**
     * @param unitsInStock the unitsInStock to set
     */
    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    /**
     * @return the imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl the imageUrl to set
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    
}
