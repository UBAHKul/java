// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

// for (int i = 0; i < array.length; i++) {
//             array[i] = new Random().nextInt(11);
//         }
// import org.json.simple.JSONObject;

public class 3_2 {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> aList = new ArrayList<>();
       for(int i = 0; i<10;i++){
            aList.add(new Random().nextInt(11));
       }
       System.out.println(aList.toString());
       aList.sort(null);
       System.out.println(aList.toString());
    }
    
}
