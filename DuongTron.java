import java.util.Scanner;

public class DuongTron extends Tamgiac {
Scanner scanner=new Scanner(System.in);
void Nhapht(){
    System.out.print("Nhap vao ban kinh: ");
    r=scanner.nextFloat();
}
void Inht(){
    System.out.println("Ban kinh la: "+r);
}
void Chuvi(){
    P=(2*r)*pi;
    System.out.println("Chu vi hinh tron la: "+P);
}
void Dientich(){
    S=r*r*pi;
    System.out.println("Dien tich hinh tron la: "+S);
}
}