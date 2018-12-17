public class main {
    public static void main(String[] args) {
        book tom=new book();
        tom.name="tom";
        tom.price=100.0;
        tom.set(tom);
        System.out.println(tom.name+tom.price);
    }
}
