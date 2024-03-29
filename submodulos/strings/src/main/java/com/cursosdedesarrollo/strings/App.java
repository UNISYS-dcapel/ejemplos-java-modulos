package com.cursosdedesarrollo.strings;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Ejemplos de Strings!" );

        // quitar espacios en blanco
        String s = "  test string  ";
        System.out.printf("'%s'%n", s);
        String striped = s.strip();
        System.out.printf("strip():%n '%s'%n", striped);
        String trimmed = s.trim();
        System.out.printf("trim():%n '%s'%n", trimmed);
        // quitar desde le principio
        striped = s.stripLeading();
        System.out.printf("stripLeading():%n '%s'%n", striped);
        // quitar desde el final
        striped = s.stripTrailing();
        System.out.printf("stripTrailing():%n '%s'%n", striped);

        // ¿Está en blanco?
        System.out.println("isBlank");
        s = "";
        boolean blank = s.isBlank();
        System.out.println(blank);
        s = " ";
        blank = s.isBlank();
        System.out.println(blank);

        // líneas de la cadena
        System.out.println("lines");
        s = "jujube\nsatsuma\nguava";
        s.lines()
                .forEach(System.out::println);
        // repetir?
        s = "--";
        String newString = s.repeat(10);
        System.out.println(newString);
        // Uso de emojis en Strings
        s = "\uD83E\uDD29 Star-Struck";
        System.out.println(s); //GRINNING FACE EMOJI
        s = "\uD83D\uDE00 Smiling face";
        System.out.println(s); //Smiling FACE EMOJI
        s = "🧛 Vampire";
        System.out.println(s); //Vampire EMOJI
        s= "\uD83D\uDC83 Woman Dancing";
        System.out.println(s); //Woman Dancing EMOJI

        // De momento no funciona XD (Feb  2022)
        //String Vampire🧛 = "\uD83E\uDDDB";
    }
}
