 class bookplus extends book {
    boolean status;

     bookplus(String name,double price,boolean status){
        this.name=name;
        super.price=price;
        this.status=status;


     }
    void show(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(status);

    }

}
