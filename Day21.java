public class belajarjava {
    public static void main(String[] args) {
       String sbyte = "10";
       String sshort = "20";
       String sint = "30";
       String slong = "40";
       String sfloat = "50.5";
       String sdouble = "60.75";
       String schar = "A";
       String sboolean = "true";

       byte databyte = Byte.parseByte(sbyte);
       short datashort = Short.parseShort(sshort);
       int dataint = Integer.parseInt(sint);
       long datalong = Long.parseLong(slong);
       float datafloat = Float.parseFloat(sfloat);
       double datadouble = Double.parseDouble(sdouble);
       char kodechar = schar.charAt(0);
       boolean databoolean = Boolean.parseBoolean(sboolean);

       System.out.println("byte:" +  databyte);
       System.out.println("short:" + datashort);
       System.out.println("int:" + dataint);
       System.out.println("loang:" + datalong);
       System.out.println("float:" + datafloat);
       System.out.println("double:" + datadouble);
       System.out.println("char:" + kodechar);
       System.out.println("boolean:" + databoolean);


    }
}
