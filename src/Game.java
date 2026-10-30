public class Game {
    private int gameId;
    private String title;
    private String genre;
    private double price;


    public Game(int gameId, String title, String genre, double price) {
        this.gameId = gameId;
        setTitle(title);
        setGenre(genre);
        setPrice(price);
    }


    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null){
            System.out.println("Title må ikke være tom.");
        } else {
            this.title = title;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null){
            System.out.println("Genre må ikke være tom.");
        } else {
            this.genre = genre;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            System.out.println("Ugyldig pris.");
        } else {
            this.price = price;
        }
    }

    public void displayDetails() {
        System.out.println("Spil ID: " + gameId);
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Pris: " + price);
    }
}
