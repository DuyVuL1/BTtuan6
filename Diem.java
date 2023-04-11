import java.util.Scanner;
public class Diem {
	int x,y,a,b,c;
    float r;
    double P,S,p,pi=3.14;
    void Nhapdiem(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao diem x:");
        x=scanner.nextInt();
        System.out.print("Nhap vao diem y: ");
        y=scanner.nextInt();
    }
    Diem(){
    }
    void Indiem(){
        System.out.println("Diem x: "+x);
        System.out.println("Diem y: "+y);
    } 
}