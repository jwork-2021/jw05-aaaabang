package configuration;
import asciiPanel.AsciiPanel;
import java.awt.Color;
public class Configure {
    public static long refreshTime = 50;//MILLISECONDS
    public static int GameSize = 30;


    // public static Color TILE_FLColor = AsciiPanel.black;
    // public static Color TILE_WLColor = AsciiPanel.brightBlack;
    // public static Color TILE_BNColor = AsciiPanel.magenta;
    // public static Color TILE_GLColor = AsciiPanel.brightRed;

    public static Color playeColor = AsciiPanel.brightWhite;

    public static int monstersCnt = 8;
    public static Color monsterColor = AsciiPanel.cyan;
    public static long monsterSpeed = 2;//Senconds
    public static int monsterHp = 10;

    public static int bombAttack = 10;
    public static long bombTime = 1*1000;//MILLISECONDS
}
