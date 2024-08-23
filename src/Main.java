//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Retangulo Retangulo1 = new Retangulo(8.0, 9.7);
        Retangulo Retangulo2 = new Retangulo(7.5, 8.5);

        System.out.println("Exibição de Inforamção do Retangulo 1:");
        Retangulo1.MostrarInformacao();

        System.out.println();


        System.out.println("Exibiçãp de Informações do Retangulo 2:");
        Retangulo2.MostrarInformacao();


    }
}