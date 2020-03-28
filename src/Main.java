public class Main {
    public static void main(String[] args) {
        boolean accruals;
        accruals = true;
        int calculation;
        if (accruals > 1000) calculation = 1;
        if (accruals < 1000) calculation = 0;
        long amount = 100;
        long bonus = amount + calculation;
        System.out.println(bonus);
    }
}
