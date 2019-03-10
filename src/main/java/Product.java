public class Product {

    private long id;
    private String productName;
    private float price;
    private float weight;
    private String color;
    private Integer productCount;

    public Product(Long id, String productName, Float price, Float weight, String color, Integer productCount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount=productCount;
    }


    public long getId(){
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor(){
        return color;
    }

    public Integer getProductCount() {
        return productCount;
    }

    private void setId(long id)
    {
        this.id = id;
    }
    private void setProductName(String productName)
    {
        this.productName = productName;
    }
    public void setPrice(float price)
    {
        this.price = price;
    }
    private void setWeight(float weight)
    {
        this.weight = weight;
    }
    private void setColor(String color)
    {
        this.color = color;
    }
    public void setProductCount(Integer productCount)
    {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", productCount=" + productCount +
                '}';
    }

}
