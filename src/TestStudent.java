import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> showStudent = new ArrayList<>();
        Student sinhVien1 = new Student("1", "Sinh Vien 1", 20, 9, 8, 7);
        Student sinhVien2 = new Student("2", "Sinh Vien 2", 20, 4, 8, 7);
        Student sinhVien3 = new Student("3", "Sinh Vien 3", 20, 9, 5, 7);
        Student sinhVien4 = new Student("4", "Sinh Vien 4", 20, 5, 8, 7);
        Student sinhVien5 = new Student("5", "Sinh Vien 5", 20, 0, 8, 7);

        showStudent.add(sinhVien1);
        showStudent.add(sinhVien2);
        showStudent.add(sinhVien3);
        showStudent.add(sinhVien4);

        showStudent.add(sinhVien5);

        for (Student sv : showStudent) {
            sv.inThongTin();
            System.out.println(sv.TinhTrungBinh());
            sv.xeploai();

        }
    }
}