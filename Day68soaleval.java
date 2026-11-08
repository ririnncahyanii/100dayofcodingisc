
import java.util.Scanner;

public class day100 {
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
    //rute bus kammpus
    // int N = input.nextInt();
    // int M = input.nextInt();
    // int K = input.nextInt();
    // if(N < 1 || M < 1 || K <1){
    //   System.out.println("input tidak valid");return ;
    // }
    // int jumlahberhenti = 0;
    // String halte = "";

    // for(int i = 1; i <= N; i++){
    //   if(i % M != 0){
    //     continue;
    //   }
    //   if(i == 7){
    //     continue;
    //   }
    //   halte += i + " ";
    //   jumlahberhenti++;

    //  if(jumlahberhenti == 0){
    //   System.out.println("Halte tidak ada");
    //  }else{
    //   System.out.println("Halte : " + halte.trim());
    //  }
    //  System.out.println("Total berhenti : " + jumlahberhenti);
    // }

    // spanduk pola simbol

    //  int pilihan = input.nextInt();

    //  if(pilihan < 1 || pilihan > 3){
    //   System.out.println("pilihan tidak valid");return ;
    //  }

    //  int N = input.nextInt();

    //  if(N < 1){
    //   System.out.println("ukuran tidak valid");return ;
    //  }

    //  String simbol = input.next();

    //  switch (pilihan) {
    //   case 1:
    //     // garis vertikal
    //     for(int i = 1; i <= N; i++){

        
    //     System.out.println(simbol);
    //     }
    //     break;

    //    case 2:
    //     // garis horizontal
    //     for(int i = 1; i <= N; i++){

        
    //     System.out.print(simbol + " ");
    //     }
    //     System.out.println();break;


    //     case 3:
    //       // pola persegi (nested loop)
    //       for(int i = 1; i <= N; i++){
    //        for(int j = 1; j <= N; j++){

    //       System.out.print(simbol + " ");
    //     }
    //       System.out.println();
    //   }
    //       break;
      
    //  }

    // segitiga siku siku bolong

    // System.out.print("Masukkan ukuran segitiga :");
    // int N = input.nextInt();

    // if(N < 1){
    //   System.out.println("ukuran tidak valid ");return ;
    // }
    // for(int i = 1; i <= N; i++){
    //   for(int j = 1; j <= N; j++){
    //     if(j == 1 || i == j || i ==  N ){
    //       System.out.print("* ");
    //     }else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }

    // // if-else,operator logika,dan final

    // final int MIN_KEHADIRAN = 11;
    // System.out.print("Masukkan nilai ujian :");
    // int nilai = input.nextInt();

    // System.out.print("Masukkan jumlah kehadiran :");
    // int kehadiran = input.nextInt();
     
    // if(nilai < 0 || kehadiran > 14){
    //   System.out.println("kehadiran tidak valild");return ;
    // }

    // String predikat;

    // if(nilai >= 85){
    //   predikat = "A";
      
    // }else if (nilai >=  70){
    //   predikat = "B";
      
    // }else if(nilai >= 55){
    //   predikat = "C";

    // }else if (nilai >= 40){
    //   predikat = "D";

    // }else{
    //   predikat = "E";
    // }

    // System.out.println("Predikat : " + predikat);

    // if(nilai >= 55 && kehadiran >=  MIN_KEHADIRAN){
    //   System.out.println("Status LULUS");
    // }else{
    //   System.out.println("Status TIDAK LULUS");
    //   if(nilai < 55 && kehadiran < MIN_KEHADIRAN){
    //     System.out.println("Alasan  :  Nilai dan kehadiran kurang");

    //   }else if(nilai < 55){
    //     System.out.println("Alasan  :  nilai kurang");
    //   }else{
    //     System.out.println("Alasan  : kehhadiran kurang");
    //   }
    // }

    // // daftar akun dann login

    // // bagian daftar akun
    // System.out.println("=== DAFTAR AKUM ===");

    // System.out.println("Buat username :");
    // String usernameAsli = input.nextLine();

    // System.out.println("Buat pasword :");
    // String paswoardAsli = input.nextLine();

    // System.out.println("Akun berhasil dibuat!");
    
    // // bagian login
    // System.out.println("\n=== LOGIN ===");

    // String username;
    // String pasword;

    // int percobaan = 0;

    // while (true){
    //   System.out.print("Username : ");
    //   username = input.nextLine();

    //   System.out.print("pasword : ");
    //   pasword = input.nextLine();

    //   percobaan++;

    //   if 
    //   (username.equals(usernameAsli) && pasword.equals(paswoardAsli)){
    //     System.out.println("Login berhasl! selamt datang, " + username);
    //     System.out.println("jumlah percobaan login : " + percobaan);break;

    //   }else{
    //     System.out.println("username atau pasword salah, coba lagi.");
    //   }
        
      
    // }


  // // menghitung nilai ujian berulang kali

  // int nilai;
  // int banyakdata = 0;
  // int total = 0;
  // int tertinggi = 0;
  // int terendah = 0;

  // while (true) {
  //   System.out.print("Masukkan nilai : ");
  //   nilai = input.nextInt();

  //   if(nilai < 0){
  //     break;
  //   }
  //   if(banyakdata == 0){
  //     tertinggi = nilai;
  //     terendah = nilai;
  //   }else{
  //     if(nilai > tertinggi){
  //       tertinggi = nilai;
  //     }
  //     if(nilai < terendah){
  //       terendah = nilai;
  //     }
  //   }

  //   total += nilai;
  //   banyakdata++;
  // }
  // if(banyakdata == 0){
  //   System.out.println("Belum ada data");
  // }else{
  //   double rataRata = (double)total / banyakdata;

  //   System.out.println("Banyak data : " + banyakdata);

  //   System.out.println("total   : " + total);

  //   System.out.println("Rata-Rata  : " + rataRata);

  //   System.out.println("Tertinngi : " + tertinggi);

  //   System.out.println("Terendah : " + terendah);
  // }

  // //program kasir tokoh

  // //KONSTANTA
  // final int BATAS_JUMLAH = 5;
  // final double DISKON = 0.10;
  // final int BATAS_BELANJA = 100000;
  // final int POTONGAN = 10000;
  // final double PPN = 0.10;

  // int N;
  // int totalBelanja =  0;

  // System.out.print("Masukkan jumlah jenis barang : ");
  // N = input.nextInt();

  // for(int i = 1; i <= N; i++){
  //   System.out.println("\nBarang ke-" + i);

  //   System.out.print("harga satuan : ");
  //   int harga = input.nextInt();

  //   System.out.print("jumlah beli : ");
  //   int jumlah = input.nextInt();

  //   int subtotal = harga * jumlah;
  //   int diskonBarang = 0;

  //   if(jumlah >= BATAS_JUMLAH){
  //     diskonBarang = (int)(subtotal * DISKON);
  //   }
  //   int hargaAkhir = subtotal - diskonBarang;

  //   totalBelanja += hargaAkhir;

  //   System.out.println("subtotal   : Rp"+subtotal);
  //   System.out.println("Harga akhir  : Rp"+hargaAkhir);
  //   }
  //   // potongan belanja
  //   int potongan = 0;

  //   if(totalBelanja >= BATAS_BELANJA){
  //     potongan = POTONGAN;
  //   }

  //   int setelahpotongan = totalBelanja - potongan;

  //   // menghitung ppn

  //   double ppndouble = setelahpotongan + PPN;
  //   int ppn = (int) ppndouble;

  //   int totalbayar = setelahpotongan + ppn;

  //   //  struk belanja

  //   System.out.println("\n=== STRUK BELANJA ===");
  //   System.out.println("total belanja : Rp" + totalBelanja);
  //   System.out.println("potongan  : RP" + potongan);
  //   System.out.println("PPN (10%)  : Rp" + ppn);
  //   System.out.println("total bayar  : Rp" + totalbayar);

  //   // pembayaran
  //   System.out.print("\nUang dibayar : Rp");
  //   int uang = input.nextInt();

  //   if(uang < totalbayar){
  //     int kurang = totalbayar - uang;

  //     System.out.println("Kekurangan  : Rp" + kurang);

  //   }else{
  //     int kembalian = uang - totalbayar;

  //     System.out.println("kembalian  : Rp" + kembalian);
  //   }
  //   input.close();

  // // pembagian bingkisan nomor antrian

  // System.out.print("Masukkan N : ");
  // int N = input.nextInt();

  // int snack = 0;
  // int minuman = 0;
  // int paketlengkap = 0;
  // int tidakdapat = 0;

  // for(int i = + 1; i <= N; i++){
  //   if(i % 3 == 0 &&  i % 5 == 0){
  //     System.out.println("Nomor " + i + ": paket lengkap");
  //     paketlengkap++;

  //   }else if (i % 3 == 0){
  //     System.out.println("nomor " + i + "snack");
  //     snack++;
  //   }else if  (i % 5 == 0){
  //     System.out.println("nomor " + i + " minuman");
  //     minuman++;
  //   }else{
  //     System.out.println("nomor " + i + "tidak dapat");
  //     tidakdapat++;
  //   }
  // }
  // System.out.println();

  // System.out.println("snack    :" + snack);
  // System.out.println("minuman  :" + minuman);
  // System.out.println("paket lengkap :" + paketlengkap);
  // System.out.println("tidak dapat :" + tidakdapat);
  // System.out.println("jumlah nomor paket lengkap : " + paketlengkap);
     }

        }
      
     
    
