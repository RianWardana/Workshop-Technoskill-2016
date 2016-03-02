import java.util.ArrayList;

public class HariDua {
	
	public static void singHappyBirthday(String nama) {
		System.out.println("Happy birthday to " + nama);
	}
	
	public static int tambah(int a, int b) {
		return a + b;
	}
	
	public static void tambahPrint(int a, int b) {
		System.out.println(tambah(a, b));
	}
	
	public static void fungsiAneh(int a, int b) {
		int hasil = tambah(a,b) * tambah(a,b);
		System.out.println(hasil);
	}
	
	public static void printString(String nama) {
		System.out.println("Halo " + nama + ", apa kabar?");
	}
	
	public static void main(String[] args) {
		String[] nama = new String[3];
		nama[0] = "Andi";
		nama[1] = "Syahrul";
		nama[2] = "Tesa";
		
//		for(int i = 0; i < nama.length; i++) singHappyBirthday(nama[i]);
		
//		fungsiAneh(5,5);
		
//		printString("Rian");
		
//		ArrayList<Integer> list = new ArrayList<>();
		
		// Latihan class dan object //
		Mahasiswa mapres = new Mahasiswa("Aris", "140650413276", "Elektro", "Teknik", 4.0, false, "SMA Pondok Kelapa");
		Mahasiswa mahasiswaKura = new Mahasiswa("Abdul", "1405678943", "Sipil", "Teknik", 1.2, true, "SMA BM 400");
		String cetakMahasiswa = "IPK dari " + 
							mapres.nama + ", mahasiswa " + 
							mapres.fakultas + " " + 
							mapres.jurusan + ", adalah, " + 
							mapres.ipk;

		System.out.println(cetakMahasiswa);
		
		Dosen dosenKiller = new Dosen("Gultom", "Prof.", "0302196208071995", 1);
		String cetakDosen = "Ada dosen, namanya " + 
							dosenKiller.gelar + " " + 
							dosenKiller.nama + ", NIDN-nya " + 
							dosenKiller.nidn + ", istrinya ada " + 
							dosenKiller.jumlahIstri;
		
		System.out.println(cetakDosen);
		
		String stringIstriDosen;
		if (dosenKiller.jumlahIstri == 0) stringIstriDosen = dosenKiller.nama + " tidak punya istri";
		else if (dosenKiller.jumlahIstri == 1) stringIstriDosen = dosenKiller.nama + " punya 1 istri saja";
		else stringIstriDosen = dosenKiller.nama + " mempunyai " + dosenKiller.jumlahIstri + ", gila!";
		
		dosenKiller.tambahIstri();
		
		System.out.println(stringIstriDosen);
		
		mapres.sapa();
		mahasiswaKura.sapa();
		dosenKiller.sapa();
	}
	
}
