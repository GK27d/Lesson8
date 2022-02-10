package com.kostina;

public class HelloGit {
    public static void main(String[] args) {
        timePalindrome();
        happyTickets();

        int print = timePalindrome();
        System.out.println(print);
        print = happyTickets();
        System.out.println(print);
    }

    //1) Электронные часы показывают время в формате от 00:00 до 23:59.
    //Подсчитать сколько раз за сутки случается так,
    // что слева от двоеточия показывается симметричная комбинация для той,
    // что справа от двоеточия (например, 02:20, 11:11 или 15:51).
    public static int timePalindrome() {
        int count = 0;
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 23; j++) {
                if (i / 10 % 10 == j % 10 & i % 10 == j / 10 % 10) {
                    count++;
                }
            }
        }
        return count;
    }

    //2) Найти количество счастливых билетиков на трамвай от 000001 до 999999
    // - те у которых сумма первых 3 цифр равна сумме последних 3
    public static int happyTickets() {
        int count = 0;
        int[] ticket = new int[6];
        for (int i = 0; i <= 999999; i++) {
            for (int k = i, j = 0; j < 6; j++, k /= 10) {
                ticket[j] = k % 10;
            }
            if (ticket[0] + ticket[2] + ticket[4] == ticket[1] + ticket[3] + ticket[5]) {
                count++;
            }
        }
        return count;
    }
}