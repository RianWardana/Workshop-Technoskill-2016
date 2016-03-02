
public class Dosen extends Orang {
	String gelar;
	String nidn;
	int jumlahIstri;
	
	public Dosen(String nama, String gelar, String nidn, int jumlahIstri) {
		this.nama = nama;
		this.gelar = gelar;
		this.nidn = nidn;
		this.jumlahIstri = jumlahIstri;
	}
	
	public void tambahIstri() {
		this.jumlahIstri++;
	}
}
