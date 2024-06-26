package org.example.algorithms.easy;

/*
1342. Количество шагов для сведения числа к нулю

Учитывая целое число num, верните количество шагов, чтобы уменьшить его до нуля .

За один шаг, если текущее число четное, вам нужно разделить его на 2, в противном случае вам придется вычесть 1из него.



Пример 1:

Ввод: число = 14
 Вывод: 6
 Пояснение:
Шаг 1) 14 четное; разделите на 2 и получите 7.
Шаг 2) 7 нечетно; вычтите 1 и получите 6.
Шаг 3) 6 четное; разделите на 2 и получите 3.
Шаг 4) 3 нечетно; вычтите 1 и получите 2.
Шаг 5) 2 четное; разделите на 2 и получите 1.
Шаг 6) 1 – нечетно; вычтите 1 и получите 0.
Пример 2:

Ввод: num = 8
 Вывод: 4
 Пояснение:
Шаг 1) 8 четное; разделите на 2 и получите 4.
Шаг 2) 4 четное; разделите на 2 и получите 2.
Шаг 3) 2 четное; разделите на 2 и получите 1.
Шаг 4) 1 – нечетно; вычтите 1 и получите 0.
Пример 3:

Ввод: число = 123
 Вывод: 12
 */

public class Problem_1342 {

    public static void main(String[] args) {
        int i = numberOfSteps(8);
        System.out.println(i);
    }

    private static int numberOfSteps(int num) {
        int i = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            i++;
        }

        return i;
    }

}
