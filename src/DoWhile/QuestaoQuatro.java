package DoWhile;

public class QuestaoQuatro {
    public static void main(String[] args) {
        int countryA = 80000;
        int countryB = 200000;
        int count = 0;

        while (countryA < countryB){
             countryA += (countryA/100)*3;
             countryB += (countryB/100)*1.5;
             count++;
        }
        System.out.println(" CountryA: " + countryA);
        System.out.println(" CountryB: " + countryB);
        System.out.println("Quantidade de anos: " + count);
    }
}
