import java.util.Scanner;

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
                {"A) zinot masīva garumu", "B) massīvs izdala bool kad ir tuvu beigām", "C) kad masīvs beidzas cikls automatiski apstājas", "Izmantojot IF pārbaudi"},
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
    }
}
