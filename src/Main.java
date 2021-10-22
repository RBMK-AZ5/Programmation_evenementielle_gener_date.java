package com.company;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
	System.out.println("hello world");

    Calendar instant=new GregorianCalendar();
    Date date=instant.getTime();
    System.out.println(String.format("%1$tm/%1$te/%1$tY",date));
        Calendar cal=new GregorianCalendar();
        System.out.println(cal);
        Date ajr=cal.getTime();
        //String date;
        System.out.println(ajr);
        //String format="%1$tm/%1$te/%1$tY";
        System.out.println(String.format("%1$te/%1$tm/%1$tY", ajr));
        String str1="Saisir quelle que chose";
        String str2;
        String tableau[];
        System.out.println("\n++++Debut du programme++++\n");
        str2=fonction(str1);
        int nbr1;
        //System.out.println(str2);
        if(str2.isEmpty())
        {
            System.out.println("Variable vide");
        }
        else
        {
            tableau=str2.split(" ");
            nbr1=tableau.length;
            System.out.println("Vous avait saisi : "+str2+" qui est composer de "+nbr1+" mot(s)");
        }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
            String s1;
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Saisir une lettre de l alaphabet");
            s1=scan2.nextLine();

        switch (s1){
            case "a":
                System.out.println("Vous avez choisit la lettre a");
                break;
            case "b":
                System.out.println("Vous avez chosit la lettre b");
                break;
            default:
                System.out.println("default");
        }

    }
    private static String fonction(String maDemande)
    {
        String saisit;
        System.out.println(maDemande);
        Scanner scan=new Scanner(System.in);
        saisit=scan.nextLine();
        return saisit;

    }
}
