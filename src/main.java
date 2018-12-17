public class main {
    public static void main(String[] args) {
        bookplus tom=new bookplus();
        tom.name="tom";
        tom.price=100.0;
        tom.set(tom);
        System.out.println(tom.name+tom.price);
        System.out.println(tom.status);
    }
}
