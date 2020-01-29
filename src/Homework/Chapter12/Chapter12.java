package Homework.Chapter12;

public class Chapter12 {
    /*
     * 1a. true
     * 1b. true
     * 1c. true
     * 1d. false
     * 1e. true
     *
     * 2a. false
     * 2b. true
     * 2c. true
     * 2d. true
     *
     * 3a. will not compile
     * 3b. will not compile
     * 3c. will compile
     * 3d. will compile
     */
    public static void main(String[] args) {
        Diploma diploma1 = new Diploma("Adam Smith", "Gardening");
        System.out.println(diploma1);
        System.out.println();

        Diploma diploma2 = new DiplomaWithHonors("Betsy Smith", "Robotics");
        System.out.println(diploma2);
        System.out.println();

        Poem Limerick = new Limerick();
        Poem Haiku = new Haiku();
        Limerick.printRhythm();
        Haiku.printRhythm();
    }
}
