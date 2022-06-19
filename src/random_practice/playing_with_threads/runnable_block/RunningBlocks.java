package random_practice.playing_with_threads.runnable_block;

public class RunningBlocks {
    public static void main(String[] args) {
        RunningBlocks obj = new RunningBlocks();
        obj.runBlocks(new Block_One(), new Block_Two());
    }
    public void runBlocks(Runnable block_one, Runnable block_two) {
        block_one.run();
        block_two.run();
    }
}

class Block_One implements Runnable {
    public void run() {
        System.out.println("Block 1 running!");
        for(int i = 0; i < 100; i++) {
            System.out.print("ONE " + i + ", ");
            if(i % 10 == 0) System.out.println();
        }
    }
}

class Block_Two implements Runnable{
    public void run() {
        System.out.println("Block 2 running!");
        for(int i = 0; i < 100; i++) {
            System.out.print("TWO " + i + ", ");
            if(i % 10 == 0) System.out.println();
        }
    }
}