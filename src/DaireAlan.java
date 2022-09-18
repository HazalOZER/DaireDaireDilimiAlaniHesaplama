import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
       
        double pi=3.14;
      
        Scanner scan=new Scanner(System.in);
       
        System.out.println("Lütfen Dairenin Yarıçapını yazınız");
        double r= scan.nextDouble();
       
        double alan=pi*r*r;
       
        System.out.println("Lütfen Hesaplanması İstenilen Daire Diliminin Merkez Açısını Giriniz");
        double dilimAcisi= scan.nextDouble();
        
        double dilimAlanı= (pi*r*r*dilimAcisi)/360;
       
        System.out.println("Dairenin Alanı: "+alan+"\nDaire Diliminin Alanı: "+ dilimAlanı+ "\nNot: Pi 3,14 alınmıştır");
    }
}
