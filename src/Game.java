public class Game {
    private int gameId;
    private String title;
    private String genre;
    private double price;


    public Game(int gameId, String title, String genre, double price) {
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        this.price = price;
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
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Spil ID: " + gameId);
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Pris: " + price);
    }
}
