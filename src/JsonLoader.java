import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

public class JsonLoader {
    public JsonLoader() {
        System.out.println("\"JsonLoader.java\" loaded successfully.");
    }

    public String options(String variable) {
        String colourMode = "";
        String font = "";
        String language = "";
        String screenSize = "";

        try (JsonReader options = new JsonReader(new FileReader(System.getProperty("user.dir") + "/resrcs/options.json"))) {
            options.beginObject();
            while (options.hasNext()) {
                String var = options.nextName();
                switch (var) {
                    case "colourMode" -> colourMode = options.nextString();
                    case "font" -> font = options.nextString();
                    case "language" -> language = options.nextString();
                    case "screenSize" -> screenSize = options.nextString();
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
                        case "colourMode" -> colourMode = options.nextString();
                        case "font" -> font = options.nextString();
                        case "language" -> language = options.nextString();
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
            case "colourMode" -> colourMode;
            case "font" -> font;
            case "language" -> language;
            case "screenSize" -> screenSize;
            default -> "Error!";
        };

    }

    public String lang(String str, String textLang) {
        String helpCmdError = "";
        String helpInfo = "";
        String helpInvalidCmd = "";
        String helpInvalidOpt = "";
        String helpNoInfo = "";
        String helpNotice = "";
        String helpOptError = "";
        String menuCommandCredits = "";
        String menuCommandOptions = "";
        String menuCommandPlayers = "";
        String menuCommandQuit = "";
        String menuCommandTowns = "";
        String menuCommandTrials = "";
        String noticeCompatDismiss = "";
        String noticeCompatibility = "";
        String titleMenu = "";
        String titleNotice = "";

        if (textLang.equals("en_gb")) {
            try (JsonReader text = new JsonReader(new FileReader(System.getProperty("user.dir") + "/resrcs/lang/en_gb.json"))) {
                text.beginObject();
                while (text.hasNext()) {
                    String var = text.nextName();
                    switch (var) {
                        case "help.cmdError" -> helpCmdError = text.nextString();
                        case "help.info" -> helpInfo = text.nextString();
                        case "help.invalidCmd" -> helpInvalidCmd = text.nextString();
                        case "help.invalidOpt" -> helpInvalidOpt = text.nextString();
                        case "help.noInfo" -> helpNoInfo = text.nextString();
                        case "help.notice" -> helpNotice = text.nextString();
                        case "help.optError" -> helpOptError = text.nextString();
                        case "menu.command.credits" -> menuCommandCredits = text.nextString();
                        case "menu.command.options" -> menuCommandOptions = text.nextString();
                        case "menu.command.players" -> menuCommandPlayers = text.nextString();
                        case "menu.command.quit" -> menuCommandQuit = text.nextString();
                        case "menu.command.towns" -> menuCommandTowns = text.nextString();
                        case "menu.command.trials" -> menuCommandTrials = text.nextString();
                        case "notice.compatDismiss" -> noticeCompatDismiss = text.nextString();
                        case "notice.compatibility" -> noticeCompatibility = text.nextString();
                        case "title.menu" -> titleMenu = text.nextString();
                        case "title.notice" -> titleNotice = text.nextString();
                        default -> text.skipValue();
                    }
                }
                text.endObject();
            } catch (IOException e) {
                try (JsonReader text = new JsonReader(new FileReader(String.valueOf(JsonLoader.class.getResourceAsStream("/lang/en_gb.json"))))) {
                    text.beginObject();
                    while (text.hasNext()) {
                        String var = text.nextName();
                        switch (var) {
                            case "help.cmdError" -> helpCmdError = text.nextString();
                            case "help.info" -> helpInfo = text.nextString();
                            case "help.invalidCmd" -> helpInvalidCmd = text.nextString();
                            case "help.invalidOpt" -> helpInvalidOpt = text.nextString();
                            case "help.noInfo" -> helpNoInfo = text.nextString();
                            case "help.notice" -> helpNotice = text.nextString();
                            case "help.optError" -> helpOptError = text.nextString();
                            case "menu.command.credits" -> menuCommandCredits = text.nextString();
                            case "menu.command.options" -> menuCommandOptions = text.nextString();
                            case "menu.command.players" -> menuCommandPlayers = text.nextString();
                            case "menu.command.quit" -> menuCommandQuit = text.nextString();
                            case "menu.command.towns" -> menuCommandTowns = text.nextString();
                            case "menu.command.trials" -> menuCommandTrials = text.nextString();
                            case "notice.compatDismiss" -> noticeCompatDismiss = text.nextString();
                            case "notice.compatibility" -> noticeCompatibility = text.nextString();
                            case "title.menu" -> titleMenu = text.nextString();
                            case "title.notice" -> titleNotice = text.nextString();
                            default -> text.skipValue();
                        }
                    }
                    text.endObject();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }

        return switch (str) {
            case "helpCmdError" -> helpCmdError;
            case "helpInfo" -> helpInfo;
            case "helpInvalidCmd" -> helpInvalidCmd;
            case "helpInvalidOpt" -> helpInvalidOpt;
            case "helpNoInfo" -> helpNoInfo;
            case "helpNotice" -> helpNotice;
            case "helpOptError" -> helpOptError;
            case "menuCommandCredits" -> menuCommandCredits;
            case "menuCommandOptions" -> menuCommandOptions;
            case "menuCommandPlayers" -> menuCommandPlayers;
            case "menuCommandQuit" -> menuCommandQuit;
            case "menuCommandTowns" -> menuCommandTowns;
            case "menuCommandTrials" -> menuCommandTrials;
            case "noticeCompatDismiss" -> noticeCompatDismiss;
            case "noticeCompatibility" -> noticeCompatibility;
            case "titleMenu" -> titleMenu;
            case "titleNotice" -> titleNotice;
            default -> "Error!";
        };
    }
}
