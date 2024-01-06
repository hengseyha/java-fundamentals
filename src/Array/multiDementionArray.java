package src.Array;

public class multiDementionArray {
    public static void main(String[] args) {
        String[][] people = {
                {
                        "Seyha",
                        "Tola",
                        "Sovan"
                },
                {
                        "Dane",
                        "Chet"
                }
        };
        for (int i = 0; i < people.length; i++) {
            for (int a = 0; a < people[i].length; a++) {
                System.out.println(people[i][a] + "\t");
            }
            System.out.println();
        }

    }
}
