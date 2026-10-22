
public class GameSystem {
    private Game[] games;
    private Player[] players;
    private int gameCount;
    private int playerCount;


    public GameSystem(int maxGames, int maxPlayer) {
        games = new Game[maxGames];
        players = new Player[maxPlayer];

        this.gameCount = 0;
        this.playerCount = 0;
    }

    public void addGame(Game game){
        if (gameCount < games.length) {
            games[gameCount] = game;
            gameCount++;
        } else {
            System.out.println("Der er ikke plads til flere spil.");
        }
    }

    public void addPlayer(Player player){
        if (playerCount < players.length) {
            players[playerCount] = player;
            playerCount++;
        } else {
            System.out.println("Der er ikke plads til flere spillere.");
        }
    }


    public void displayAllGames() {
        for (int i = 0; i < gameCount; i++) {
            Game game = games[i];

            if (game != null) {
                System.out.println("Spil " + (i+1) + ": " + game.getTitle());
            }
        }
    }

    public void displayAllPlayers() {
        for (int i = 0; i < playerCount; i++) {
            Player player = players[i];

            if (player != null) {
                System.out.println("Spiller: " + player.getName());
            }
        }
    }

    public void updatePlayerScore(int playerId, double newScore) {
        Player player = findPlayerById(playerId);
        player.updateScore(newScore);
    }


    public Game findGameById(int gameId) {
        for (int i = 0; i < gameCount; i++) {
            Game game = games[i];

            if (game.getGameId() == gameId) {
                return game;
            }
        }
        return null;
    }

    public Player findPlayerById(int playerId) {
        for (int i = 0; i < playerCount; i++) {
            Player player = players[i];

            if (player.getPlayerId() == playerId) {
                return player;
            }
        }
        return null;
    }

    public void setPlayersByScore() {
        for (int i = 0; i < playerCount - 1; i++) {

            for (int j = 0; j < playerCount - 1 - i; j++) {

                if (players[j].getScore() < players[j + 1].getScore()) {

                    Player temp = players[j];

                    players[j] = players[j + 1];

                    players[j + 1] = temp;
                }
            }
        }
    }

    public void displayLeaderboard() {
        setPlayersByScore();
        System.out.println("==========================");
        System.out.println("       LEADERBOARD");
        System.out.println("==========================");
        for (int i = 0; i<playerCount; i++){
            System.out.println("   " + (i+1) + ". " + players[i].getName() + " | " + players[i].getScore());
        }
        System.out.println("==========================");
    }


}
