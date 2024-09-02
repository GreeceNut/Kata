package SumOfDigits;

//Найти сумму обратного корня
public class SumOfDigits {
    public static int digital_root(int n) {
        //вводим значение суммы цифр
        int sum = 0;
        //вводим цикл, где каждое последующее число n будет больше нуля
        // ИЛИ сумма sum больше 9
        while (n > 0 || sum > 9) {
            //Если число будет иметь нуль в цикле, например, такие числа как (0123),
            //то и сумма будет равна нулю
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            //Каждая последующая сумма sum будет равна сумме остатков n % 10
            sum += n % 10;
            //Каждое последующее число будет отсеивать десяток, то есть последнюю цифру
            //Например 123/10=12
            n /= 10;
        }
        return sum;
    }

    // Пользуясь формулой цифрового корня,
    // можно решить по-другому задачу, а именно:
    // dr(n) = 1 + ((n - 1) mod9)
    public static int digital_root2(int n) {
        return (n - 1) % 9 + 1;

    }
}


