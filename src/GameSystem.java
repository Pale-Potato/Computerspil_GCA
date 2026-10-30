
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
                game.displayDetails();
            }
        }
    }

    public void displayAllPlayers() {
        for (int i = 0; i < playerCount; i++) {
            Player player = players[i];

            if (player != null) {
                player.displayDetails();
            }
        }
    }

    public void updatePlayerScore(int playerId, double newScore) {
        Player player = findPlayerById(playerId);
        if (player == null) {
            System.out.println("Spiller findes ikke.");
        } else {
            player.updateScore(newScore);
        }
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

    public Player[] setPlayersByScore() {
        Player[] sortedPlayers = new Player[playerCount];

        //kopierer elementer fra players til sortedPlayers
        for (int i = 0; i<playerCount;i++){
            sortedPlayers[i] = players[i];
        }

        //buble sort listen sortedPlayers
        for (int i = 0; i < playerCount - 1; i++) {

            for (int j = 0; j < playerCount - 1 - i; j++) {

                if (sortedPlayers[j].getScore() < sortedPlayers[j + 1].getScore()) {

                    Player temp = sortedPlayers[j];

                    sortedPlayers[j] = sortedPlayers[j + 1];

                    sortedPlayers[j + 1] = temp;
                }
            }
        }
        return sortedPlayers;
    }

    public void displayLeaderboard() {
        Player[] sortedPlayers = setPlayersByScore();
        System.out.println("==========================");
        System.out.println("       LEADERBOARD");
        System.out.println("==========================");
        for (int i = 0; i<playerCount; i++){
            System.out.println("   " + (i+1) + ". " + sortedPlayers[i].getName() + " | " + sortedPlayers[i].getScore());
        }
        System.out.println("==========================");
    }

    public Player findTopScoringPlayer(){
        Player topScoringsPlayer = null;

        for (int i = 0; i<playerCount; i++){
            if (topScoringsPlayer == null || players[i].getScore() > topScoringsPlayer.getScore()) {
                topScoringsPlayer = players[i];
            }
        }
        return topScoringsPlayer;
    }


}
