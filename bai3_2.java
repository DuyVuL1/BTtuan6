import java.util.Scanner;

public class bai3_2 {
public static void main(String[] args) {
	int luachon;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Moi ban nhap lua chon: ");
    luachon=scanner.nextInt();
    switch(luachon){
    case 1:
    Diem d=new Diem();
    d.Nhapdiem();
    d.Indiem();
    break;
    case 2:
    Tamgiac tg=new Tamgiac();
    tg.Nhaptg();
    tg.Intamgiac();
    tg.Kiemtra();
    tg.Chuvi();
    tg.Dientich();
    break;
    case 3:
    DuongTron ht=new DuongTron();
    ht.Nhapht();
    ht.Inht();
    ht.Chuvi();
    ht.Dientich();
    break;
    }
}
}