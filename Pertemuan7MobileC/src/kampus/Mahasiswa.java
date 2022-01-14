package kampus;

public class Mahasiswa extends AnggotaKampus{
	public void perkenalan() {
		System.out.println("Halo, nama saya " + this.getNamaAnggota());
		System.out.println("Saya berlokasi di kampus " + this.getLokasiAnggota());
	}
}
