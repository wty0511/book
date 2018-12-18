public class book {
    String name;
    double price;


    public book(){
        this.name="rr";
        this.price=1.1;

    }
    void set(book booka) {
        booka.price*=0.9;

    }
    void show(){
        System.out.println(name);
        System.out.println(price);

    }
}
