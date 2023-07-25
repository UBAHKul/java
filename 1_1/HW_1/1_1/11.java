package HW_1.11;

public class Main {
    public static void main(String[] args) throws Exception{
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i)
            }
        }
    }
}
