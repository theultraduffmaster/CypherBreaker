package ie.gmit.sw;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FileParser {
	public Map<String, Double> parse(String file) throws FileNotFoundException {
		Map<String, Double> temporary = new ConcurrentHashMap<String, Double>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		return temporary;
	}
}
