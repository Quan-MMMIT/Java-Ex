/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LE MINH QUAN
 */
public class NhapXuatMang2Chieu {
    public static void main(String[] args) {
    // khai báo số dòng và số cột cho mảng
    int soDong, soCot;
     
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào số dòng của mảng: ");
    soDong = scanner.nextInt();
    System.out.println("Nhập vào số cột của mảng: ");
    soCot = scanner.nextInt();
         
    // khai báo và cấp phát bộ nhớ cho mảng
    int[][] A = new int[soDong][soCot];
         
    // Để nhập giá trị các phần tử cho mảng
    // chúng ta sẽ sử dụng 2 vòng lặp for
    // vòng lặp for bên ngoài sẽ duyệt i từ 0 đến soDong - 1
    // và vòng lặp for bên trong sẽ duyệt j từ 0 đến soCot - 1
    // mỗi lần như vậy thì sẽ nhập vào phần tử tại vị trí i, j
    for (int i = 0; i < soDong; i++) {
        for (int j = 0; j < soCot; j++) {
            System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
            A[i][j] = scanner.nextInt();
        }
    }
         
    // hiển thị các phần tử trong mảng vừa nhập
    // chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
    System.out.println("Mảng vừa nhập: ");
    for (int i = 0; i < soDong; i++) {
        for (int j = 0; j < soCot; j++) {
            System.out.print(A[i][j] + "\t");
        }
        // sau khi viết xong 1 dòng thi xuống hàng
        System.out.println("\n");   
    }
}

public class Mang2Chieu {
    public static void main(String[] args) {
    int m;  // số dòng của ma trận
    int n;  // số cột của ma trận
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào số dòng của ma trận:");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận:");
        n = scanner.nextInt();
    } while (m < 1 || n < 1);
         
    // khai báo 2 ma trận A và B có m dòng và n cột
    int A[][] = new int[m][n];
    int B[][] = new int[m][n];
         
    // ma trận tổng C
    int C[][] = new int [m][n];
         
    System.out.println("Nhập các phần tử cho ma trận A:");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "," + j + "] = ");
            A[i][j] = scanner.nextInt();
        }
    }
         
    System.out.println("Nhập các phần tử cho ma trận B:");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("B[" + i + "," + j + "] = ");
            B[i][j] = scanner.nextInt();
        }
    }
         
    System.out.println("Ma trận A:");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(A[i][j] + "\t");
        }
        System.out.println("\n");
    }
         
    System.out.println("Ma trận B:");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(B[i][j] + "\t");
        }
        System.out.println("\n");
    }
         
    // Để tính tổng hai ma trận
    // ta sẽ sử dụng 2 vòng lặp for
    // để duyệt i từ 0 đến m và j từ 0 đến n
    // sau đó tính tổng hai phần tử
    // tại vị trí i, j tương ứng của 2 ma trận A, B
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
         
    // hiển thị ma trận tổng C
    System.out.println("Ma trận tổng C:");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(C[i][j] + "\t");
        }
        System.out.println("\n");
    }
}
