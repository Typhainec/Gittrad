import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int choix = 1;

        Anglais vAnglais = new Anglais();
        vAnglais.addDico("Bonjour", "Hello");
        Breton vBreton = new Breton();
        vBreton.addDico("Bonjour", "Demat");
        Togolais vTogolais = new Togolais();
        vTogolais.addDico("Bonjour", "Ndi");

        System.out.println("Choisir votre langue pour dire bonjour ");
        System.out.println("1 : Anglais");
        System.out.println("2 : Breton");
        System.out.println("3 : Togolais");

        choix = scan.nextInt();


        if (choix == 1) {
            System.out.println(vAnglais.getTraduction("Bonjour"));
        }
        if (choix == 2){
            System.out.println(vBreton.getTraduction("Bonjour"));
        }
        if (choix ==3){
            System.out.println(vTogolais.getTraduction("Bonjour"));

        }else{
            System.out.println("Veuillez sélectionner une langue");
        }

        //Fenetre f = new Fenetre();
        //f.setVisible(true);
    }
}