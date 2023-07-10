// На вход принимаем 3 числа от пользователя, нужно найти максимальное,
//  минимальное и лишнее

int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int min1 = n < m ? n : m;
        int max1 = n > m ? n : m;
        int min2 = k < min1 ? k : min1;
        int max2 = k > max1 ? k : max1;
        System.out.println(min2);
        System.out.println(max2);
        