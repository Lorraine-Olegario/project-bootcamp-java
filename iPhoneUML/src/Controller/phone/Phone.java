package Controller.phone;

public class Phone {

    public static void main() {
        Model.Phone number = new Model.Phone();
        number.setNumber("(99) 99999-9999");
        turnOn(number.getNumber());
        turnOff();

        meet();
        turnOn(number.getNumber());
        voiceMail();
    }

    private static void turnOff()
    {
        System.out.println("Desligando a ligação");
    }

    private static void turnOn(String number)
    {
        System.out.println("Ligando para " + number);
    }

    private static void meet()
    {
        System.out.println("Atendendo o telefone");
    }

    private static void voiceMail()
    {
        System.out.println("Grave uma mensagem");
    }
}