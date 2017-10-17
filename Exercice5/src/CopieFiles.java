import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.lang.*;
import java.util.Scanner;

public class CopieFiles {
/* 
copie le contenu d'un fichier dans un autre 
*/
    
        public static void main(String[] args) throws IOException
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Entrer le nom du fichier source et son extension (fichier texte)");
            String nameSrcFile = keyboard.nextLine();
            System.out.println("Entrer le nom du fichier de destination et son extension( fichier texte)");
            String nameDestFile = keyboard.nextLine();
            copy(nameSrcFile,nameDestFile);
        }

        public static void copy (String SourceFile, String NewDestFile) throws IOException//ouvre le fichier et copie le contenu du fichier dans un nouveau fichier	
/*
SourceFile est initialisé et correspond au nom d'un fichier externe qui existe et est fermé,
NewDestFile est initialisé et correspond au nom d'un fichier externe qui n'existe pas
(s'il existe déjà le contenu du précédent fichier sera écrasé)
 SourceFile est inchangée & NewDestFile est le contenu de SourceFile & est fermé
*/
        {
            File nomFichier = new File(SourceFile);// je met SourceFile dans nomFichier
            Scanner inputFile = new Scanner(nomFichier);//je met nomFichier dans inputfile 

/*inputfile est initialisé,il est lié au fichier externe SourceFile et est ouvert en lecture*/


            PrintWriter outputFile = new PrintWriter(NewDestFile);//ouvre le fichier NewDestFile 

//écrit dans le fichier nexDestFile le contenu du fichier source 

            while (inputFile.hasNext())//regarde si la ligne suivante existe 
            {
                outputFile.println(inputFile.nextLine());//inputfile.nextline() voir scanner et file au debut de la méthode 
            }

            outputFile.close();
            inputFile.close();
        }

    }

