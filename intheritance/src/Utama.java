import java.io.*;
class Utama
{
    public static void main (String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        TanggalLahir ulangtahunA = new TanggalLahir();
        UlangTahun ulangtahunB = new UlangTahun("","","","","");
        
        while(true)
        {
            System.out.println("===============");
            System.out.println("MENU ULANG TAHUN");
            System.out.println("===============");
            System.out.println("1. Input Ulang Tahun A");
            System.out.println("2. Input Ulang Tahun B");
            System.out.println("3. Lihat Data Ulang Tahun");
            System.out.println("4. Keluar");
            System.out.println("===============");
            
            System.out.println("Masukan Pilihan = ");
            int pilih = Integer.parseInt(br.readLine());
            
            System.out.println();
            
            switch(pilih)
            {
                case 1:
                    System.out.println("===============");
                    System.out.println("Input Ulang Tahun A");
                    System.out.println("===============");
                    System.out.print("Masukan tanggal = ");
                    String tanggal = br.readLine();
                    System.out.print("Masukan bulan = ");
                    String bulan = br.readLine();
                    System.out.print("Masukan tahun = ");
                    String tahun = br.readLine();
                    
                    ulangtahunA = new TanggalLahir(tanggal, bulan, tahun);
                    
                    System.out.println();
                    
                    System.out.println("### Data Ulang Tahun A telah disimpan ###");
                    break;
                case 2:
                    System.out.println("===============");
                    System.out.println("Input Ulang Tahun A");
                    System.out.println("===============");
                    System.out.print("Masukan tanggal = ");
                    tanggal = br.readLine();
                    System.out.print("Masukan bulan = ");
                    bulan = br.readLine();
                    System.out.print("Masukan tahun = ");
                    tahun = br.readLine();
                    System.out.print("Masukan acara = ");
                    String acara = br.readLine();
                    System.out.print("Masukan tempat = ");
                    String tempat = br.readLine();
                    
                    ulangtahunB = new UlangTahun(tanggal, bulan, tahun, acara, tempat);
                    
                    System.out.println();
                    
                    System.out.println("### Data Ulang Tahun B telah disimpan ###");
                    break;
                case 3:
                    System.out.println("===============");
                    System.out.println("DATA ULANG TAHUN");
                    System.out.println("===============");
                    
                    System.out.println("Ulang Tahun A");
                    System.out.println("Tanggal Ulang Tahun A = "+ulangtahunA.getTanggal());
                    System.out.println("Bulan Ulang Tahun A = "+ulangtahunA.getBulan());
                    System.out.println("Tahun Ulang Tahun A = "+ulangtahunA.getTahun());
                    
                    System.out.println("Ulang Tahun B");
                    System.out.println("Tanggal Ulang Tahun B = "+ulangtahunB.getTanggal());
                    System.out.println("Bulan Ulang Tahun B = "+ulangtahunB.getBulan());
                    System.out.println("Tahun Ulang Tahun B = "+ulangtahunB.getTahun());
                    System.out.println("Acara Ulang Tahun B = "+ulangtahunB.getAcara());
                    System.out.println("Tempat Ulang Tahun B = "+ulangtahunB.getTempat());
                    
                    System.out.println("===============");
                    break;
                default :
                    System.exit(0);
            }
        }
    }
}