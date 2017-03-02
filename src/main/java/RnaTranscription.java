import main.RnaTranscriptProcessor;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 10:01 AM
 */
public class RnaTranscription {

    static String ofDna(String input) {
        RnaTranscriptProcessor rnaTranscriptProcessor = new RnaTranscriptProcessor();
        return rnaTranscriptProcessor.getRnaTranscript(input);
    }
}
