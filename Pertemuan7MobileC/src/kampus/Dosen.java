package kampus;

public class Dosen extends AnggotaKampus{
	public void perkenalan() {
		System.out.println("Nama saya " + this.getNamaAnggota());
		System.out.println("Saya mengajar di kampus " + this.getLokasiAnggota());
		System.out.println("Kode saya adalah " + this.getKodeAnggota());
	}
}
