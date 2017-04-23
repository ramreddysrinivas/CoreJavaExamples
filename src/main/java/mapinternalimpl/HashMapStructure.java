package mapinternalimpl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapStructure {
	public static void main(String[] args) {
		Country india = new Country("India", 10000);
		Country japan = new Country("Japan", 10000);
		Country france = new Country("France", 2000);
		Country russia = new Country("Russia", 20000);
		Country india2 = new Country("India", 1000);
		HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();
		countryCapitalMap.put(india, "Delhi");
		countryCapitalMap.put(japan, "Tokyo");
		countryCapitalMap.put(france, "Paris");
		countryCapitalMap.put(russia, "Moscow");
		countryCapitalMap.put(india2, "Delhi");
		for(Country s:countryCapitalMap.keySet() ){
			System.out.println( s.getName() + "    " + s.getPopulation() + "     " + countryCapitalMap.get(s) );
		}
		/*Iterator<Country> countryCapitalIter = countryCapitalMap.keySet().iterator();// put debug point at this line
		while (countryCapitalIter.hasNext()) {
			Country countryObj = countryCapitalIter.next();
			String capital = countryCapitalMap.get(countryObj);
			
			System.out.println(countryObj.getName() + "----" + capital + "  ..... " + countryObj.getPopulation() );

		}*/
	}
}
