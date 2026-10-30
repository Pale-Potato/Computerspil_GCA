public class Player {
    private int playerId;
    private String name;
    private int age;
    private double score;


    public Player(int playerId, String name, int age, double score) {
        this.playerId = playerId;
        setName(name);
        setAge(age);
        setScore(score);
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Navn må ikke være tomt.");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
            return age;
    }

    public void setAge(int age) {
        if (age<0) {
            System.out.println("Ugyldig alder.");
        } else {
            this.age=age;
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0) {
            System.out.println("Ugyldig score.");
        } else {
            this.score = score;
        }
    }


    public void displayDetails(){
        System.out.println("Spiller ID: " + playerId);
        System.out.println("Navn: " + name);
        System.out.println("Alder:  " + age);
        System.out.println("Score: " + score);
    }

    public void updateScore(double newScore){
        score = newScore;
    }

}
