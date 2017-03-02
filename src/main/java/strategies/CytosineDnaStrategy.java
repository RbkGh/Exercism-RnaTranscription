package strategies;

import extra.DnaStrand;
import extra.RnaStrand;
import main.DnaStrategy;

/**
 * when input is {@link DnaStrand#CYTOSINE} ,this strategy will be used
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 10:26 AM
 */
public class CytosineDnaStrategy implements DnaStrategy {
    @Override
    public String getRnaTranscription(String dnaStrandInput) {
        return RnaStrand.GUANINE;
    }
}
