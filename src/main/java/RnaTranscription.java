import main.RnaTranscriptProcessor;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 10:01 AM
 */
public class RnaTranscription{
    public static String ofDna(String dna){
        dna=dna.replaceAll("G", "c").replaceAll("C", "g").replaceAll("T", "a").replaceAll("A", "u");
        return dna.toUpperCase();
    }
}
