public class App {
    public static void main(String[] args) throws Exception {

        long nanoTime = System.nanoTime();

        long currentTimeMillis = System.currentTimeMillis();
        
        System.out.println("Nano Time: " + nanoTime);
        System.out.println("Current Time (ms): " + currentTimeMillis);
    }
}
