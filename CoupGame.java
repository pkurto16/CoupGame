import java.util.Queue;
import java.util.Scanner;

public class CoupGame{
	private final static int MAX_PLAYERS = 6;
	private final static int MAX_NAME_LENGTH = 50;
	private Scanner scan = new Scanner(System.in);
	private Player[] players = new Player[MAX_PLAYERS];
	
    public static void main(String[] args){
        CoupGame coupRunner = new CoupGame();
        coupRunner.run();
    }

    public void run(){
        startUpGame();
        int playerCount = initializePlayers();
        boolean gameRunning = true;
        while(gameRunning){
            gameRunning = playFullGame(playerCount);
        }
    }

    private boolean playFullGame(int playerCount) {
    	
        return true;
    }

    private int initializePlayers() {
    	boolean doneSelecting = false;
    	int playerCount = 0;
    	while(!doneSelecting&&playerCount<MAX_PLAYERS) {
    		doneSelecting = askForNewPlayer(playerCount);
    		playerCount++;
    	}
    	return playerCount;
    }
    
    private boolean askForNewPlayer(int playerCount) {
    	System.out.println("Enter Player Name:");
    	String playerName = "123456789012345678901234567890123456789012345678901";
    	while(playerName.length()>MAX_NAME_LENGTH) {
    		playerName = scan.nextLine();
    		if(playerName.length()>MAX_NAME_LENGTH) {
    			System.out.println("You're a fucking idiot.");
    		}
    	}
    	players[playerCount] = new Player(playerName);
    	scroll(500,1000,100);
    	System.out.println("Successful! Add another? (Y/N)");
    	//playerName is now the Y/N
    	while(playerName.charAt(0)!='Y'&&playerName.charAt(0)!='y'
    			&&playerName.charAt(0)!='N'&&playerName.charAt(0)!='n') {
    		playerName = scan.nextLine();
    		if(playerName.charAt(0)!='Y'&&playerName.charAt(0)!='y'
        			&&playerName.charAt(0)!='N'&&playerName.charAt(0)!='n') {
    			System.out.println("Add another? (Y/N)");
    		}
    	}
    	return playerName.charAt(0)=='Y'||playerName.charAt(0)=='y';
    }

    private void startUpGame() {
        System.out.println("Initializing...");
        scroll(500,1000,100);
        System.out.println("Setting up PreFabs...");
        scroll(500,1000,100);
        System.out.println("Finalizing...");
        scroll(500,1000,100);
        System.out.println("Starting...");
        scroll(500,500,100);
        scroll(0,500,100);
    }

	private void scroll(int waitMillis, int scrollMillis, int lines) {
		try {
            Thread.sleep(waitMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		for(int i = 0; i<lines; i++){
            try {
                Thread.sleep(scrollMillis/lines);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
	}
}
