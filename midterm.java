class midterm {
    public static void main(String[] args) {
        product product = new product("chair", 500.0);
        Electronics eletronics = new Electronics("Television", 20000.0, "Sansug", "Neo QLED");
        Smarthphone Smarthphone = new Smarthphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        Book Book = new Book("OOP Programming", 250.0, "John Doe", 300);

        product.getName();
        product.getPrice();
        System.out.println("****************************************************************");
        eletronics.getName();
        eletronics.getPrice();
        eletronics.getBrand();
        eletronics.getModel();
        System.out.println("****************************************************************");
        Smarthphone.getName();
        Smarthphone.getPrice();
        Smarthphone.getBrand();
        Smarthphone.getModel();
        Smarthphone.getoperatingsystem();
        System.out.println("****************************************************************");
        Book.getName();
        Book.getPrice();
        Book.getAuthor();
        Book.getPages();
        System.out.println("****************************************************************");

    }
}

class product {
    String name;
    Double price;

    product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String setName() {
        return name;
    }

    public void getName() {
        System.out.println("Product Name :" + this.name);

    }

    public Double setPrice() {
        return price;
    }

    public void getPrice() {
        System.out.println("Product Price :" + this.price);
    }
}

class Electronics extends product {
    String brand;
    String model;

    Electronics(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public void getBrand() {
        System.out.println("Brand :" + this.brand);
    }

    public String setBrand() {
        return brand;
    }

    public void getModel() {
        System.out.println("Model :" + this.model);
    }

    public String setModel() {
        return model;
    }

}

class Smarthphone extends Electronics {
    String operatingsystem;

    Smarthphone(String name, double price, String brand, String model, String operatingsystem) {
        super(name, price, brand, model);
        this.operatingsystem = operatingsystem;
    }

    public void getoperatingsystem() {
        System.out.println("operatingsystem :" + this.operatingsystem);
    }

    public String setoperatingsystem() {
        return operatingsystem;
    }
}

class Book extends product {
    String author;
    int pages;

    Book(String name, Double price, String author, int pages) {
        super(name, price);
        this.author = author;
        this.pages = pages;
    }

    public void getAuthor() {
        System.out.println("Author :" + this.author);
    }

    public String setAuthor() {
        return author;
    }

    public int setPages() {
        return pages;
    }

    public void getPages() {
        System.out.println("Number of Pages :" + this.pages);
    }

}
