package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {

    // tag,,getFlag[]
	private static Map<Nationality, List<Color>> FLAGS = new HashMap<Nationality, List<Color>>();
	
	static {
		    FLAGS.put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
	        FLAGS.put(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
	        FLAGS.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));         
	        FLAGS.put(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
	        FLAGS.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
	        FLAGS.put(Nationality.ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
	        FLAGS.put(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
	        FLAGS.put(Nationality.HUNGARIAN,  Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
	        FLAGS.put(Nationality.BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));  
	        FLAGS.put(Nationality.RUSSIA,  Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
	}
	
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result = FLAGS.get(nationality);
       
        return result !=null ? result : Arrays.asList(Color.GRAY);
    }
    // end,,getFlag[]

}