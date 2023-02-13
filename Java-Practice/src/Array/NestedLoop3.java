package Array;

public class NestedLoop3 {

	public static void main(String[] args) {

		String[][] citiesCA = { { "Toronto", "Oakvile", "Niagara" }, { "Ottawa", "Montreal", "Saskatoon" } };
		String[][] citiesUS = { { "California", "Washington", "Sanf" }, { "Seatel", "Virginia" } };

		for (int i = 0; i < citiesCA.length; i++) {
			for (int j = 0; j < citiesCA[i].length; j++) {
			String citiesCanada=citiesCA[i][j];
//				System.out.println(citiesCanada);
				if (citiesCanada.contentEquals("Toronto"))
				{
					System.out.println(citiesCanada);
				}
			}
		}
		System.out.println("---------------------------");

		for (int k = 0; k < citiesUS.length; k++) {
			for (int l = 0; l < citiesUS[k].length; l++) {
				System.out.println(citiesUS[k][l]);
			}
		}
	}
}
