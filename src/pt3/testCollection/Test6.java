package pt3.testCollection;

import java.util.HashMap;

public class Test6 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("호랑이", "tiger");
		map.put("표범", "leopard");
		map.put("사자", "lion");
		map.replaceAll((k, v) -> {return v.toUpperCase();});
		System.out.println(map);
	}

}
