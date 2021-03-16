package lambdaTrial;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Assignment7 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "A");
		map.put("2", "B");
		map.put("3", "C");
		map.put("4", "D");
		map.put("5", "E");
		String result = map.entrySet().stream().map(x -> x.getKey() + ": " + x.getValue()).collect(Collectors.joining("; "));
		System.out.println(result);
	}
}
