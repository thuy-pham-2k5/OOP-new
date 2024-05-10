
public class demo {
//    public static void main(String[] args) {
////       int[] i= {2,3,4,5};
////       System.out.println(i[4]);   //out of bound
//        System.out.println("So tien dien thang nay la: " + tinhtienDien(100));
//        System.out.println("So tien dien thang nay la: " + tinhtienDien(1000));
//    }
//    private static int tinhtienDien(int soDien) {
//        int tienDien = 0;
//        if (soDien > 400) {
//            tienDien += (soDien-400) * 2701;
//            soDien = 400;
//        } if (soDien>300) {
//            tienDien += (soDien-300) * 2615;
//            soDien = 300;
//        } if (soDien>200) {
//            tienDien += (soDien-200) *2340;
//            soDien = 200;
//        } if (soDien>100) {
//            tienDien += (soDien-100) * 1858;
//            soDien = 100;
//        } if (soDien>50) {
//            tienDien += (soDien - 50) * 1600;
//            soDien = 50;
//        } if (soDien>0) {
//            tienDien += soDien * 1549;
//        }
//        return tienDien;
//
////        int bac1 = soDien >50 ? 50 : soDien > 50? soDien - 50 : 0;
////        int bac2 = soDien >100 ? 50 : soDien > 50? soDien - 50 : 0;
////        int bac3 = soDien >200 ? 50 : soDien > 50? soDien - 50 : 0;
////        int bac4 = soDien >300 ? 50 : soDien > 50? soDien - 50 : 0;
////        int bac5 = soDien >400 ? 50 : soDien > 50? soDien - 50 : 0;
////        int bac6 = soDien > ? 50 : soDien > 50? soDien - 50 : 0;
//
//    }

    //tính giai thừa
//    public static void main(String[] args) {
//        System.out.print("Nhap giai thua ban muon tinh: ");
//        Scanner sc = new Scanner(System.in);
//        int giaiThua = sc.nextInt();
//        System.out.println("Giai thua " + giaiThua + " co gia tri la: " + giaiThua(giaiThua));
//    }
//    public static int giaiThua(int n) {
//        int result=1;
//        if (n==0)
//            return 1;
//        while (n!=0 && n>0) {
//            result *= n;
//            n--;
//        }
//        return result;
//    }

//đếm số ký tự
//    public static void main(String[] args) {
//        String text = "Cong hoa xa hoi Chu nghia Viet Nam";
//        int count = demSoKyTu(text, 'n');
//        System.out.println(count);
//    }
// /   static int demSoKyTu(String text, char kyTu) {
//        int count=0;
//        for (int i=0; i<text.length(); i++) {
//            if (Character.toLowerCase(kyTu) == Character.toLowerCase(text.charAt(i)))
//                count++;
//        }
//        return count;
//    }

    //kiểm tra năm nhuận
    public static void main(String[] args) {
        System.out.println("Liet ke cac nam nhuan trong khoang nam 2000 den 3000");
        System.out.println("So nam nhuan la: ");
        int year=2000;
        int endYear=3000;
        int isLeapYear;
        while (year<endYear) {
            if (kiemTraNamNhuan(year)) {
                isLeapYear = year;
                System.out.print(isLeapYear + "  ");
            }
            year++;
        }
    }
    static boolean kiemTraNamNhuan(int year) {
        if (year%4==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
            }
            return true;
        }
        return false;
    }
}
