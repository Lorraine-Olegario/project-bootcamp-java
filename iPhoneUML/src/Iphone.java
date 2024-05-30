import Controller.internet.BrowserInternet;
import Controller.music.MusicPlayer;
import Controller.phone.Phone;

import java.util.Scanner;

public class Iphone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual aplicativo você quer abrir? (appMusic, appPhone, appBrowser)");
        String appToOpen = scanner.nextLine();

        switch (appToOpen) {
            case "appMusic":
                appMusic();
                break;
            case "appPhone":
                appPhone();
                break;
            case "appBrowser":
                appBrowser();
                break;
            default:
                System.out.println("Aplicativo não reconhecido. Use: appMusic, appPhone, appBrowser.");
                break;
        }

        scanner.close();
    }

    public static void appMusic() {
        System.out.println("Abrindo o app de Musica");
        MusicPlayer.main();
    }

    public static void appPhone() {
        System.out.println("Abrindo o Telefone");
        Phone.main();
    }

    public static void appBrowser() {
        System.out.println("Abrindo o Nagegador");
        BrowserInternet.main();
    }
}
