public class CoupGame{
    public static void main(String[] args){
        CoupGame coupRunner = new CoupGame();
        coupRunner.run();
    }

    public void run(){
        startUpGame();
        initializePlayers();
        boolean gameRunning = true;
        while(gameRunning){
            gameRunning = playFullGame();
        }
    }

    private boolean playFullGame() {
        return false;
    }

    private void initializePlayers() {
    }

    private void startUpGame() {
        System.out.println("Initializing...");
        for(int i = 0; i<8; i++){
            try {
                Thread.sleep(125);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        
        System.out.println("Setting up PreFabs...");
        for(int i = 0; i<8; i++){
            try {
                Thread.sleep(125);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        System.out.println("Finalizing...");
        for(int i = 0; i<8; i++){
            try {
                Thread.sleep(125);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        System.out.println("Starting...");
        for(int i = 0; i<8; i++){
            try {
                Thread.sleep(125);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
