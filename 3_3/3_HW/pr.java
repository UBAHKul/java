// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;

public class pr {
    public static void main(String[] args) throws Exception{
        
ArrayList list = new ArrayList();
list.add(1);
list.add(5);
list.add(3);
int min = (int) list.get(0);
int max = (int) list.get(0);
for (Integer i: list) {
    if(i < min) min = i; if(i > max) 
        max = i;
}
System.out.println("минимальное число: " + min);
System.out.println("максимальное число: " + max);
    }
}
