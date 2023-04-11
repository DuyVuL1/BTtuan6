import java.util.Scanner;
public class Tamgiac extends Diem {
	void Nhaptg(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap vao diem a: ");
        a=scanner.nextInt();
        System.out.print("Nhap vao diem b: ");
        b=scanner.nextInt();
        System.out.print("Nhap vao diem c: ");
        c=scanner.nextInt();
    }
    void Intamgiac(){
        System.out.println("Diem a:"+a);
        System.out.println("Diem b:"+b);
        System.out.println("Diem c:"+c);
    }
    void Kiemtra(){
        if((a+b<=c)||(a+c<=b)||(b+c<=a))
            System.out.println("Day khong phai la tam giac");
        else
            System.out.println("Day la tam giac");
        
    }
    void Chuvi(){
        P=(float)a+b+c;
        System.out.println("Chu vi la: "+P);
    }
    void Dientich(){
        p=P/2.0f;
        S=(float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Dien tich la: "+S);
    }
 }