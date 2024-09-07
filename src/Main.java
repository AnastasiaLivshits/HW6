public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Тask1");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            {
                System.out.println();
            }
            {
                System.out.println("Тask2");
                for (int i = 10; i >= 1; i--) {
                    System.out.println(i);
                }
                {
                    System.out.println();
                }
                {
                    System.out.println("Тask3");
                    for (int i = 0; i <= 17; i += 2) {
                        System.out.println(i);
                    }
                    {
                        System.out.println();
                    }
                    {
                        System.out.println("Тask4");
                        for (int i = 10; i <= 10 && i >= -10; i--) {
                            System.out.println(i);
                        }
                        {
                            System.out.println();
                        }
                        {
                            System.out.println("Тask5");
                            for (int i = 1904; i <= 2096 && i >= 1904; i += 4) {
                                System.out.println(i + "год является високосным");
                            }
                            {
                                System.out.println();
                            }
                            {
                                System.out.println("Тask6");
                                for (int i = 7; i <= 98 && i >= 7; i += 7) {
                                    System.out.println(i);
                                }
                                {
                                    System.out.println();
                                }
                                {
                                    System.out.println("Тask7");
                                    for (int i = 1; i <= 512 && i >= 1; i *= 2) {
                                        System.out.println(i);
                                    }
                                }
                                {
                                    System.out.println();
                                }
                                {
                                    System.out.println("Тask8 ");
                                    int monthlyDeposit = 29000;
                                    int totalSavings = 0;
                                    for (int month = 1; month <= 12; month++) {
                                        totalSavings += monthlyDeposit;
                                        System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
                                    }
                                    ;
                                    {
                                        System.out.println();
                                    }
                                    {
                                        System.out.println("Тask9 ");
                                        int deposit = 29000;
                                        int totalDeposit = 0;
                                        for (int i = 1; i <= 12; i++) {
                                            totalDeposit += deposit;
                                            totalDeposit += totalDeposit/100;

                                            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalDeposit + " рублей");
                                        }
                                        ;
                                        {
                                            System.out.println();
                                        }
                                        {
                                            System.out.println("Тask10");
                                            {
                                                int n = 2;
                                                for (int k = 2; k <= 10; k++) {
                                                    System.out.println(n + " * " + k + " = " + (n * k));
                                                }
                                            }
                                        }
                                    }
                                    ;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
};
