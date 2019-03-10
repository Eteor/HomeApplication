public class Boots extends Product {

    private Integer size;
    private boolean isNaturalSkin;

    public Boots(Long id, String productName, Float price, Float weight, String color, Integer productCount, Integer size, boolean isNaturalSkin) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }


    public int getSize() {
        return size;
    }
    public boolean getIsNaturalSkin(){
        return isNaturalSkin;
    }

    private void setSize(int size){
        this.size = size;
    }

    private void setIsNaturalSkin(boolean isNaturalSkin){
        this.isNaturalSkin = isNaturalSkin;
    }

    @Override
    public String toString() {
        return super.toString() + "Boots{" +
                "size='" + size + '\'' +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }
}
