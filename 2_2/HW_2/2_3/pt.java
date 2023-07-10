import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonOject;


public class pt {
    public static void main(String[] ars) {
        String jsoString = readStringFromFile("data.json");
        JsonArray array = new Gson().fromjson(jsonStr, JsonArray.class);

        StringBuilder sb = new StringBuilder();

        for (JsonElement : array) {
            
        }
    }    
    
}
