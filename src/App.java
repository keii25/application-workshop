public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-----------");

        System.out.println("Cuenta Bancaria");
        CuentaBancaria account_1 = new CuentaBancaria();
        account_1.setActivated(true);
        System.out.println("Status Account: "+account_1.isActivated());
        System.out.println("Account number: "+account_1.getAccountNumber());

        System.out.println("-----------");

        System.out.println("Gladiator");
        Gladiador gladiator_1 = new Gladiador();
        gladiator_1.setName("Maximo Decimo Meridio");
        System.out.println(gladiator_1.getName());
        gladiator_1.attacking();
        gladiator_1.detailsGladiator();

        System.out.println("-----------");

        System.out.println("Message");
        Mensaje message_1 = new Mensaje();
        message_1.setTitle("apply to vacancy");
        message_1.setDescription("I share my resume");
        message_1.read();
        System.out.println("Title: "+message_1.getTitle());
        System.out.println("Description: "+message_1.getDescription());

        System.out.println("-----------");

        System.out.println("Album");
        Album album_1 = new Album();
        album_1.setName("Adele 21");
        album_1.listen();
        album_1.detailsAlbum();

        System.out.println("-----------");

        System.out.println("Fruta");
        Fruta fruits = new Fruta();
        fruits.colors.add("Rojas");
        fruits.colors.add("Verdes");
        System.out.println(fruits.getColors());
        fruits.setColor("Yellow");
        System.out.println(fruits.getColors());
        



    }
}
