public class Day19 {

public static void main(String[] args) {

 // 1. double ke float
double angkadouble = 10.75;
float angkafloat = (float) angkadouble;
// 2. float ke long
float angkafloat2 = 20.50f;
long angkalong = (long) angkafloat2;
// 3. long ke int
long angkalong2 = 100L;
int angkaint = (int) angkalong2;
// 4. int ke short
int angkaint2 = 50;
short angkashort = (short) angkaint2;
// 5.short ke byte 
short angkashort2 = 10;
byte angkabyte = (byte) angkashort2;
// 6.char ke byte 
char kodehuruf = 'A';
byte hasilchar = (byte) kodehuruf;
// 7. boolean
boolean benar = true;
// menampilkan hasil 
System.out.println("=== MENAMPILKAN HASIL ====");
System.out.println("double ke float:" + angkafloat);
System.out.println("float ke long:" + angkalong);
System.out.println("long ke int:" + angkaint);
System.out.println("int ke short:" + angkashort);
System.out.println("short ke byte:" + angkabyte);
System.out.println("char ke byte:" + hasil);
System.out.println("boolean:" + benar);


 }
}
