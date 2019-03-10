public class Cloth extends Product{

    private String size;
    private String material;

    public Cloth(Long id, String productName, Float price, Float weight, String color, Integer productCount, String size, String material) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }

    public String getSize(){
        return size;
    }

    public String getMaterial(){
        return material;
    }

    private void setSize(String size){
        this.size = size;
    }

    private void setMaterial (String material){
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + "Cloth{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
