 class bookplus extends book {
    boolean status;
    String name;
    bookplus(){

        super.price=1;
        this.price=0.0;
    }


    void show(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(status);

    }

}
