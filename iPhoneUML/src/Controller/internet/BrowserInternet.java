package Controller.internet;

import Model.Browser;
import Model.Music;

public class BrowserInternet {

    public static void main() {
        Browser q = new Browser();
        q.setSearch("Albun Luan Santana");
        search(q.getSearch());
        display();
    }

    private static void search(String search)
    {
        System.out.println("Conteudo pesquisado é " + search);
    }

    private static void display()
    {
        System.out.println("Exibindo a pagina do conteudo pesquisado");
    }
}
