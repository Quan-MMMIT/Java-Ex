/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE MINH QUAN
 */
public class Mang1Chieu {
    public static void main(String[] args) {
    // Khai báo và khởi tạo giá trị ban đầu cho mảng
    char[] kyTu = new char[] {'a', 'b', 'c', 'd', 'e'};
         
    // hiển thị ký tự tại vị trí thứ 2 trong mảng
    System.out.println("Ký tự tại vị trí thứ 2 trong mảng là " + kyTu[2]);
}
}

public class NhapXuatMang {
    public static void main(String[] args) {
    int size;   // kích thước của mảng
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào độ dài của mảng: ");
    size= scanner.nextInt();
         
    // khai báo và cấp phát bộ nhớ cho mảng
    // mảng này có tên là array và kích thước = size
    int[] array = new int[size];
         
    // array.length: trả về kích thước của mảng
    // vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
    for (int i = 0; i < size; i++) {
        System.out.println("Nhập vào phần tử thứ " + i + ": ");
        array[i] = scanner.nextInt();   // nhập giá trị cho phần tử
    }
         
    // hiển thị giá trị các phần tử trong mảng
    for (int i = 0; i < size; i++) {
        System.out.println("Phần tử thứ " + i + ": " + array[i]);
    }
}
}