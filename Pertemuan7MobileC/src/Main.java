import java.util.ArrayList;
import java.util.Scanner;

import kampus.*;

/*
 Buatlah program yang bisa menginput anggota kampus dan juga bisa membuat masing-masing
 anggota kampus memperkenalkan diri!
 1) Nama anggota harus lebih dari 3 huruf
 2) Kode anggota harus 5 karakter, berawalan dengan huruf D untuk dosen,
 	berawalan dengan huruf M untuk mahasiswa
 3) Lokasi anggota harus antara Kemanggisan, Alam Sutera, atau Bekasi
 */


public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<AnggotaKampus> daftarAnggota = new ArrayList<>();
	
	int option;
	String nama;
	String kode;
	String lokasi;
	
	public void input() {
		do {
			System.out.print("Nama: ");
			nama = scan.nextLine();
			if(nama.length() <= 3) {
				System.out.println("Nama harus lebih dari 3 huruf");
			}
		}while(nama.length() <= 3);
		do {
			System.out.print("Kode: ");
			kode = scan.nextLine();
			if(kode.length() != 5) {
				System.out.println("Kode harus 5 karakter");
			}else if(!kode.startsWith("M") && !kode.startsWith("D")) {
				System.out.println("Kode harus berawalan dengan M atau D");
			}
		}while(kode.length() != 5 || !kode.startsWith("M") && !kode.startsWith("D"));
		do {
			System.out.println("Lokasi: ");
			lokasi = scan.nextLine();
			if(!lokasi.equals("Kemanggisan") && !lokasi.equals("Alam Sutera") 
				&& !lokasi.equals("Bekasi")) {
				System.out.println("Lokasi harus antara Kemanggisan, Alam Sutera, atau Bekasi");
			}
		}while(!lokasi.equals("Kemanggisan") && !lokasi.equals("Alam Sutera") 
				&& !lokasi.equals("Bekasi"));
		
		if(kode.startsWith("D")) {
			Dosen dosenBaru = new Dosen();
			dosenBaru.setNamaAnggota(nama);
			dosenBaru.setKodeAnggota(kode);
			dosenBaru.setLokasiAnggota(lokasi);
			daftarAnggota.add(dosenBaru);
		}else if(kode.startsWith("M")) {
			Mahasiswa mahasiswaBaru = new Mahasiswa();
			mahasiswaBaru.setNamaAnggota(nama);
			mahasiswaBaru.setKodeAnggota(kode);
			mahasiswaBaru.setLokasiAnggota(lokasi);
			daftarAnggota.add(mahasiswaBaru);
		}
		mainmenu();
	}
	
	public void perkenalan() {
		String pencarian;
		System.out.println("Cari nama yang anda ingin minta perkenalkan");
		System.out.print("> ");
		pencarian = scan.nextLine();
		for(int i=0; i<daftarAnggota.size(); i++) {
			if(daftarAnggota.get(i).getNamaAnggota().equals(pencarian)) {
				daftarAnggota.get(i).perkenalan();
				mainmenu();
				return;
			}
		}
		System.out.println("Anggota tidak ditemukan");
		mainmenu();
	}
	
	public void mainmenu() {
		do{
			System.out.println("1. Input");
			System.out.println("2. Perkenalan");
			System.out.println("3. Exit");
			System.out.print("> ");
			option = scan.nextInt();
			scan.nextLine();
			if(option == 1) {
				input();
			}else if(option == 2) {
				perkenalan();
			}else if(option == 3) {
				return;
			}
		}while(option < 1 || option > 3);
	}
	
	public Main() {
		mainmenu();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
