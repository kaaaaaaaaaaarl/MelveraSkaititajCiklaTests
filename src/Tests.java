import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tests {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String[] jautajumi = {
                "kurš koda fragments ir cikls ar skaitītāju"
                , "ko dara pirmais for loop izteiciens?"
                , "Kāpēc cikli izmanto i lai reprezenteta cikla skaitu?"
                , "matemātiski algoritmā kā jātzīmē loop?"
                , "Bija velviens veids kā izveidot loop programmas, kā piemēram MS basic valodā ko mūsdienās neizmanto, kā šo loop atzīmēja?"
                , "kāds ir pielietojums Ciklam ar skaitītāju?"
                , "Ko skaitītāj cikli NEVAR darīt?"
                , "kā noteikt ka ir masīva beigas?"
                , "Vai ir iespējams pagarināt masīvu lielumu?"
                , "kāds ir maksimālais skaitlis cik ilgi For loops var iet?"
                , "Cik veida cikli existē?"
        };
        String[][] atbildes = {
                {"A) where", "B) do", "C) for", "D) while"},
                {"A) definē mainīgo", "B) definē cikla apstāšanās", "C) A vai B", "D) komanda ko atkarto katru ciklu"},
                {"A) jo tā ir tradīcija", "B) I ir īsaikais burts alfabētā", "C) I nozīmē \"Increment\"", "D) I nozīmē \"Int\""},
                {"A) do", "B) while", "c) for", "D) loop"},
                {"A) until stop", "C) GoTo", "C)repeat", "D) nav citu"},
                {"A) viegli paredzami algoritmi", "B) Masīvi", "C) cilvēku izvēles", "D) kodu saīsināšanai"},
                {"A) ar nosacījumu apstādināt programmu", "B) iet bezgalīgi", "C) būt saīsināta", "D) atkārtoties noteiktu daudzumu reizes"},
                {"A) zinot masīva garumu", "B) massīvs izdala bool kad ir tuvu beigām", "C) kad masīvs beidzas cikls automatiski apstājas", "D) Izmantojot IF pārbaudi"},
                {"A)Jā ", "B)nē", "C) tikai ja nedefinē garumu", "D) var tikai kopēt datus uz jaunu, lielāku masīvu"},
                {"A) 255 riezes", "B) 2,147,483,647(int limits) ", "C) 4,294,967,294(int limits x2)", "D) bezgalīgi"},
                {"A) 2", "B) 3", "C) 5", "D) atšķirās programēšanas valodā"}
        };

        boolean[][] atbildes1 = {
                {false, false, true, false},
                {true, false, false, false},
                {true, false, false, false},
                {true, true, true, false},
                {false, true, false, false},
                {true, false, true, false},
                {true ,false ,false ,true },
                {false,true ,true ,true },
                {false, false, true, true},
                {false, true, false, false}

        };
        int[]  jaut= {0, 1,2,3,4,5,6,7,8,9};

        boolean[] zaudejumi = new boolean[10];

        JauktArray(jaut);

        for(int i=0; i<10; i++){
            System.out.println(jautajumi[jaut[i]]);

            for(int k=0; k<4; k++){
                System.out.println(atbildes[jaut[i]][k]);}
            String atbilde = myObj.nextLine();
            atbilde = atbilde.toUpperCase();
            switch(atbilde.charAt(0)) {
                case 'A':
                    if(atbildes1[jaut[i]][0]){
                        System.out.println("A ir pareizā atbilde!");
                        zaudejumi[i]=true;
                    }else{
                        System.out.println("A ir nepareizā atbilde");
                        zaudejumi[i]=false;
                    }
                    break;
                case 'B':
                    if(atbildes1[jaut[i]][1]){
                        System.out.println("B ir pareizā atbilde!");
                        zaudejumi[i]=true;
                    }else{
                        System.out.println("B ir nepareizā atbilde");
                        zaudejumi[i]=false;
                    }
                    break;
                case 'C':
                    if(atbildes1[jaut[i]][2]){
                        System.out.println("C ir pareizā atbilde!");
                        zaudejumi[i]=true;
                    }else{
                        System.out.println("C ir nepareizā atbilde");
                        zaudejumi[i]=false;
                    }
                    break;
                case 'D':
                    if(atbildes1[jaut[i]][3]){
                        System.out.println("D ir pareizā atbilde!");
                        zaudejumi[i]=true;
                    }else{
                        System.out.println("D ir nepareizā atbilde");
                        zaudejumi[i]=false;
                    }
                    break;
                default:
                    System.out.println("tikai vaig ierakstīt burtu");
            }
        }
        //parada nepareizās atbildes
        int parAtb = 0;
        System.out.println("\nnepareizās atbildes:\n__________________________");
        for(int i=0; i<10; i++){
            if(!zaudejumi[jaut[i]]){
                System.out.println("\n"+jautajumi[jaut[i]]);
                System.out.println("\n###pareizā atbilde/s:###");
                for(int k=0; k<4; k++){
                    if(atbildes1[jaut[i]][k]){
                        System.out.println(atbildes[jaut[i]][k]);}}
            }}


        //parada pareizās atbildes
        System.out.println("\npareizās atbildes atbildes:\n__________________________");
        for(int i=0; i<10; i++){

            if(zaudejumi[jaut[i]]){
                System.out.println(jautajumi[jaut[i]]);
                parAtb++;
                System.out.println("\n###   pareizā atbilde/s:   ###");
                for(int k=0; k<4; k++){
                    if(atbildes1[jaut[i]][k]){
                        System.out.println("\n"+atbildes[jaut[i]][k]);}}
            }
        }
        System.out.println("\n kopā pareizās abildes ir: "+parAtb);
    }
    static void JauktArray(int[] ar)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
