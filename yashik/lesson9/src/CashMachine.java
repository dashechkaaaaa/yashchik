public class CashMachine {

    int remainingMoney;

    int maxAllowMoney;

    int maxVolumeMoney;

    int countOperations;

    CashMachine(int remainingMoney, int maxAllowMoney, int maxVolumeMoney, int countOperations){
        this.remainingMoney = remainingMoney;
        this.maxAllowMoney = maxAllowMoney;
        this.maxVolumeMoney = maxVolumeMoney;
        this.countOperations = countOperations;
    }

    public int giveMoney(int money) throws Exception {
        if (money > maxAllowMoney || money > remainingMoney) {
            System.out.println("Максимальная сумма для снятия наличных - 5000");
            throw new Exception();
        }
        remainingMoney -= money;
        countOperations++;
        return money;
    }

    public int putMoney(int money) {
        int allowAmount = maxVolumeMoney - remainingMoney;
        if (money <= allowAmount){
            remainingMoney += money;
            countOperations++;
            System.out.println("Деньги положены на счет");
            return 0;
        }
        else {
            money -= allowAmount;
        }
        countOperations++;
        return money;
    }
}
