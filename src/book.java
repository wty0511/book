public class book {
    String name;
    double price;

    book(){

    }
    public book(String name,double price){
        this.name=name;
        this.price=price;

    }
    void set(book booka) {
        booka.price*=0.9;

    }
    void show(){
        System.out.println(name);
        System.out.println(price);

    }
}
