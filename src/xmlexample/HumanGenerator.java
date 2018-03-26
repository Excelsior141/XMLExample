package xmlexample;

import java.time.LocalDate;
import java.util.Random;

public abstract class HumanGenerator 
{
    private static Random random = new Random();
    
    private static String[] humanFirstNamesMale = new String[] 
    {
        "Antanas",
        "Albinas",
        "Algirdas",
        "Anastasijus",
        "Arunas",
        "Aivaras",
        "Benas",
        "Bronius",
        "Benediktas",
        "Balys",
        "Dainius",
        "Domantas",
        "Denis",
        "Evaldas",
        "Edvinas",
        "Eimantas",
        "Ernestas",
        "Frederikas",
        "Filipas",
        "Gediminas",
        "Giedrius",
        "Irmantas",
        "Jonas",
        "Jokubas",
        "Janusas",
        "Juozas",
        "Jezus",
        "Juozapas",
        "Justinas",
        "Karolis",
        "Horacijus",
        "Kristupas",
        "Klaidas",
        "Laimonas",
        "Laisvydas",
        "Mantas",
        "Manfredas",
        "Minusas",
        "Petras",
        "Pranas",
    };
    
    private static String[] humanLastNamesMale = new String[] 
    {
        "Antanaitis",
        "Antis",
        "Bebras",
        "Brazauskas",
        "Arklys",
        "Cibulskis",
        "Uosis",
        "Sluota",
        "Bala",
        "Petraitis",
        "Azuolas",
        "Ziogas",
        "Medis",
        "Zole",
        "Augalas",
        "Zvake",
        "Tvartas",
        "Uola",
        "Tapusis",
        "Obuolys",
        "Frakcijus",
        "Gruodis",
        "Balandis",
        "Berzelis"
    };
    
    private static String[] humanFirstNamesFemale = new String[]
    {
        "Ana",
        "Almante",
        "Antanina",
        "Asta",
        "Brone",
        "Bejonce",
        "Dovile",
        "Dana",
        "Egle",
        "Egile",
        "Etna",
        "Franceska",
        "Frederika",
        "Frane",
        "Gile",
        "Grazvile",
        "Greta",
        "Ona",
        "Juzepa",
        "Jovita",
        "Zose",
        "Ursule",
        "Liepa",
        "Bite",
        "Monika",
        "Irena",
        "Silvija"
    };
    
    private static String[] humanLastNamesFemale = new String[]
    {
        "Antanaitiene",
        "Antanaityte",
        "Antanaite",
        "Antiene",
        "Antyte",
        "Ante",
        "Bebriene",
        "Bebryte",
        "Bebre",
        "Brazauskiene",
        "Brazauskaite",
        "Brazauske",
        "Arkliene",
        "Arklyte",
        "Arkle",
        "Cibulskiene",
        "Cibulskyte",
        "Cibulske",
        "Uosiene",
        "Uosyte",
        "Uose",
        "Sluotiene",
        "Sluotyte",
        "Sluote",
        "Baliene",
        "Balyte",
        "Bale",
        "Petraitiene",
        "Petraityte",
        "Petriene",
        "Petraite",
        "Petryte",
        "Petre",
        "Azuoliene",
        "Azuolyte",
        "Azuole",
        "Ziogiene",
        "Mediene",
        "Zoliene",
        "Augaliene",
        "Zvakiene",
        "Tvartiene",
        "Uoliene",
        "Tapusiene",
        "Obuoliene",
        "Frakcijiene",
        "Gruodiene",
        "Balandiene",
        "Berzeliene"
    };
    
    private static String[][] humanNamesMale = new String[][]
    {
        humanFirstNamesMale,
        humanLastNamesMale
    };
    
    private static String[][] humanNamesFemale = new String[][]
    {
        humanFirstNamesFemale,
        humanLastNamesFemale
    };
    
    private static String[][][] humanNames = new String[][][]
    {
        humanNamesMale,
        humanNamesFemale
    };
    
    public static Human Generate()
    {
        Human.Gender gender = Human.Gender.values()[random.nextInt(Human.Gender.values().length)];
        int ordinal = gender.ordinal();
        
        String firstName = humanNames[ordinal][0][random.nextInt(humanNames[ordinal][0].length)];
        String lastName = humanNames[ordinal][1][random.nextInt(humanNames[ordinal][1].length)];
        
        LocalDate birthDate = LocalDate.ofEpochDay(random.nextInt(365 * 30));
        double money = random.nextDouble() * 50000d;
        
        return new Human(firstName, lastName, birthDate.toString(), money, gender);
    }
}
