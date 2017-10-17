
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ScannerSaisie {

    public static void main(String[] args) {
        char reponse = 'O';
        while(reponse == 'O' || reponse == 'o'){
            FileOutputStream fos = null;
            List<Byte> bits = null;
            boolean continuer = true;
            Scanner scan = new Scanner(System.in);
            System.out.println("Entrer le nom du futur fichier (avec l'extension) :");
            String nom = scan.nextLine();
            try{
                System.out.println("Écriver le texte à inscrire dans le fichier "+nom+"\nQuand vous avez terminé, saisissez [Terminer].\n\t!!!Attention, vous ne pourrez plus effacer la ligne précédente!!!");
                bits = new ArrayList<Byte>();
                while(continuer == true){
                    String tae = scan.nextLine();
                    if(tae.equals("[Terminer]")){
                        continuer = false;}
                    else{
                        for(int i = 0; i < tae.length(); i++){
                            bits.add((byte)tae.charAt(i));
                        }
                        bits.add((byte)13);
                        bits.add((byte)10);
                    }
                    fos = new FileOutputStream(new File(nom));
                    for(byte a : bits){
                        fos.write(a);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try{
                    if (fos !=null)
                        fos.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }

            System.out.println("Terminé !\n\n Voulez-vous recommencer ?");
            reponse = scan.nextLine().charAt(0);
        }
        System.out.println("Arrêté.");
    }
}