import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

public class JsonLoader {
    public String Options(String variable) {
        String colourMode = "Dark";
        String font = "Mono Orange";
        String screenSize = "4:3";

        try (JsonReader options = new JsonReader(new FileReader(System.getProperty("user.dir") + "/resrcs/options.json"))) {
            options.beginObject();
            while (options.hasNext()) {
                String var = options.nextName();
                switch (var) {
                    case "font" -> font = options.nextString();
                    case "screenSize" -> screenSize = options.nextString();
                    case "colourMode" -> colourMode = options.nextString();
                    default -> options.skipValue();
                }
            }
            options.endObject();
        } catch (IOException e) {
            try (JsonReader options = new JsonReader(new FileReader(String.valueOf(JsonLoader.class.getResourceAsStream("options.json"))))) {
                options.beginObject();
                while (options.hasNext()) {
                    String var = options.nextName();
                    switch (var) {
                        case "font" -> font = options.nextString();
                        case "screenSize" -> screenSize = options.nextString();
                        default -> options.skipValue();
                    }
                }
                options.endObject();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        return switch (variable) {
            case "font" -> font;
            case "screenSize" -> screenSize;
            case "colourMode" -> colourMode;
            default -> "Error!";
        };

    }
}
