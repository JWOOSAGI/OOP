package builder;

import model.ProductDTO;

public class ProductBuilder {
    private int pno;
    private String name;
    private String company;
    private int price;

    public ProductBuilder pno(int pno){
        this.pno = pno;
        return this;
    }
    public ProductBuilder name(String name){
        this.name = name;
        return this;
    }
    public ProductBuilder company(String company){
        this.company = company;
        return this;
    }
    public ProductBuilder price(int price){
        this.price = price;
        return this;
    }
    public ProductDTO build(){
        return new ProductDTO(pno,name,company,price);
    }
}
