public class Main {
    public static void main(String[] args) {
        long reffil;
        long account = 100;
        long bonus;
            if (reffil >= 1000) {
                bonus = reffil / 100;
            } else {
                bonus = 0;
            }
            long total = account + reffil + bonus;
            System.out.println(total);
        }
}
