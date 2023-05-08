class Product {
    
    String name="";
    String description = "";
    Integer price=0;
    
    public String getName() {
        System.out.println("Product is " + name);
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        System.out.println("Description is " + description);
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getPrice() {
        System.out.println("Price is " + price);
        return price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    
}