package random_practice.playing_with_threads.first_go_at_it;

public class Experiment {
    public static void main(String[] args) {
        Thread one = new Thread(new ThreadOne());
        Thread two = new Thread(new ThreadTwo());
        one.start();
        two.start();
    }
}
class ThreadOne implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("1st Thread: " + i);
            try {Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
        }
    }
}
class ThreadTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i >= -10; i--) {
            System.out.println("2ng Thread: " + i);
            try {Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
        }
    }
}