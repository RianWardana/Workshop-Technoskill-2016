
public class Mahasiswa extends Orang {
	String npm;
	String jurusan;
	String fakultas;
	double ipk;
	boolean statusIKM;
	String asalSMA;
	
	public Mahasiswa(String nama, String npm, String jurusan, String fakultas, double ipk, boolean statusIKM, String asalSMA) {
		this.nama = nama;
		this.npm = npm;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
		this.ipk = ipk;
		this.statusIKM = statusIKM;
		this.asalSMA = asalSMA;
	}
}
