public class Day18 {

public static void main(String[] args) {
// 1.byte ke short
byte databyte = 10;
short datashort = databyte;
//2.short ke int
int dataint = datashort;
// 3.int ke long
long datalong = dataint;
//4.long ke float
float datafloat = datalong;
//5.float ke double
double datadouble = datafloat;
//6.char ke int 
char huruf = 'A';
int kodehuruf = huruf;
//7.boolean 
boolean aktif = true;
System.out.println("=== KONVERSI OTOMATIS ===");
System.out.println("byte:" + databyte);
System.out.println("short:" + datashort);
System.out.println("int:" + dataint);
System.out.println("long:" + datalong);
System.out.println("float:" + datafloat);
System.out.println("double:" + datadouble);
System.out.println("char:" + huruf);
System.out.println("char ke int:" + kodehuruf);
System.out.println("boolean:" + aktif);
}
}

