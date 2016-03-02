import java.util.ArrayList;

public class NyobaProgram {
	
	public static void main(String[] args) {
			
		// Variabel //
		int panjang = 13;
		int lebar = 5;
		double keliling = 2 * panjang + 2 * lebar;
				
		// String //
		String kegiatan = "Saya suka main";
		String sub = kegiatan.substring(0, 1);
		int panjangString = kegiatan.length();
		
		// Array //
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) array[i] = i;
		
		// ArrayList //
		ArrayList<Integer> arrayYangList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			arrayYangList.add(i);
		}		
		
		// Boolean //
		boolean a = true;
		boolean b = false;
		boolean c = a && b;
		boolean d = a || b;
		
		// Tampilkan di Console //
		System.out.println(d);
	}
	
}
