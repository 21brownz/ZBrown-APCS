public class OllyMeister {

    public String sendToLanis(String person) {
        return person + "Please report to Mr. Wilson's Office";
    }

    public String getOllyMeisterStatus() {
        String status;
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int random = (int) (Math.random() * range) + min;

        if (random == 1) {
            return "Olly has been consumed by Garfield as he was mistaken for lasagna";
        }
        if (random == 2) {
            return "olly has consumed too much protein shake and is too swole to walk";
        }
        if (random == 3) {
            return "olly was sent to Lanis's office and has been banished to the shadow realm";
        }
        if (random == 4) {
            return "olly tried to take on Thanos and was snapped";
        }
        if (random == 5) {
            return "soviet sleeper spies showed up and took olly without notice";
        }
        if (random == 6) {
            return "olly was bitten by a radioactive spider and got radiation sickness";
        }
        if (random == 7) {
            return "olly accidentally drank some coolant and froze";
        }
        if (random == 8) {
            return "EDP445 was summoned to DA and ate olly";
        }
        if (random == 9) {
            return "olly tried to jump off of a dollar tree";
        }
        if (random == 10) {
            return "olly had his college fund taken by Mr. Phu after challenging him";
        }
        return "olly just kinda dipped";
    }
}
