import java.io.*;
/**
 * Klasse zum Einlesen von Tastatureingaben für primitive Datentypen als auch für das Datum.
 */
public class TastaturEingabe
{
    static BufferedReader eing = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Dient zum einlesen einer double-Zahl
     * @param prompt Anzuzeigender Text, unmittelbar bevor die Eingabe erfolgt.
     * @return eingelesene double-Zahl
     */
    public static double readDouble(String prompt)
    {
        while(true)
        {
            System.out.println(prompt);
            try
            {
                String zeile = eing.readLine();
                return Double.parseDouble(zeile);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Bitte eine Zahl eingeben (ggf. mit Dezimalpunkt).");
            }
            catch(IOException e)
            {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

    /**
     * Dient zum einlesen einer int-Zahl
     * @param prompt Anzuzeigender Text, unmittelbar bevor die Eingabe erfolgt.
     * @return eingelesene int-Zahl
     */
    public static int readInt(String prompt)
    {
        while(true)
        {
            System.out.println(prompt);
            try
            {
                String zeile = eing.readLine();
                return Integer.parseInt(zeile);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Bitte eine ganze Zahl eingeben.");
            }
            catch(IOException e)
            {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

    /**
     * Dient zum einlesen einer long-Zahl
     * @param prompt Anzuzeigender Text, unmittelbar bevor die Eingabe erfolgt.
     * @return eingelesene long-Zahl
     */
    public static long readLong(String prompt)
    {
        while(true)
        {
            System.out.println(prompt);
            try
            {
                String zeile = eing.readLine();
                return Long.parseLong(zeile);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Bitte eine ganze Zahl eingeben.");
            }
            catch(IOException e)
            {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

    /**
     * Dient zum einlesen eines Booleans.
     * Für Rückgabewert "true" muss "j" oder "J" eingegeben werden.
     * Für Rückgabewert "false" muss "n" oder "N" eingegeben werden.
     * @param prompt Anzuzeigender Text, unmittelbar bevor die Eingabe erfolgt.
     * @return eingelesener Boolean
     */
    public static boolean readBoolean(String prompt)
    {
        while(true)
        {
            System.out.println(prompt);
            try
            {
                String e = eing.readLine();
                if (e.equals("j") || e.equals("J"))
                {
                    return true;
                }
                if (e.equals("n") || e.equals("N"))
                {
                    return false;
                }
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException e)
            {
                System.out.println ("Bitte J oder N eingeben.");
            }
            catch(IOException e)
            {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

    /**
     * Dient zum einlesen eines Strings
     * @param prompt Anzuzeigender Text, unmittelbar bevor die Eingabe erfolgt.
     * @return eingelesener String
     */
    public static String readString(String prompt)
    {
        while(true)
        {
            System.out.println(prompt);
            try
            {
                return eing.readLine();
            }
            catch(IOException e)
            {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

    /**
     * Dient zum einlesen eines chars
     * @param prompt Anzuzeigender Text, unmittelbar bevor die Eingabe erfolgt.
     * @return eingelesene char
     */
    public static char readChar(String prompt)
    {
        while(true)
        {
            System.out.println(prompt);
            try
            {
                String s = eing.readLine();
                if (s.length() == 0)
                {
                    throw new IllegalArgumentException();
                }
                return s.charAt(0);
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Bitte ein Zeichen eingeben.");
            }
            catch(IOException e)
            {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
