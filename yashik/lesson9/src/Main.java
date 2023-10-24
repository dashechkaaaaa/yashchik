public class Main {
    public static void main(String[] args) throws Exception{
        CashMachine cashMachine = new CashMachine(0, 5000, 10000,0);
        System.out.println(cashMachine.putMoney(3000));
        System.out.println(cashMachine.putMoney(7000));
        System.out.println(cashMachine.putMoney(2000));
        System.out.println(cashMachine.giveMoney(5000));
        System.out.println(cashMachine.countOperations);
    }
}
