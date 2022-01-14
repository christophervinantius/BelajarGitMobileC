package kampus;

public abstract class AnggotaKampus {
	private String kodeAnggota;
	private String namaAnggota;
	private String lokasiAnggota;
	public abstract void perkenalan();
	public String getKodeAnggota() {
		return kodeAnggota;
	}
	public void setKodeAnggota(String kodeAnggota) {
		this.kodeAnggota = kodeAnggota;
	}
	public String getNamaAnggota() {
		return namaAnggota;
	}
	public void setNamaAnggota(String namaAnggota) {
		this.namaAnggota = namaAnggota;
	}
	public String getLokasiAnggota() {
		return lokasiAnggota;
	}
	public void setLokasiAnggota(String lokasiAnggota) {
		this.lokasiAnggota = lokasiAnggota;
	}
	
}
