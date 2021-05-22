public class Student {
    String id, name;
    int age;
    double diemToan, diemVan, diemAnh, avg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public Student(String id, String name, int age, double diemToan, double diemVan, double diemAnh) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
        this.avg = (diemToan + diemVan + diemAnh) / 3;
    }

    public Student(double diemToan, double diemVan, double diemAnh) {
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
        this.avg = (diemToan + diemVan + diemAnh) / 3;
    }

    public double TinhTrungBinh() {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    public void xeploai() {
        if (diemToan == 0 || diemAnh == 0 || diemVan == 0) {
            System.out.println("Yeu");
        } else if (TinhTrungBinh() >= 5 && TinhTrungBinh() < 7) {
            System.out.println("Trung binh");
        } else if (TinhTrungBinh() >= 7 && TinhTrungBinh() < 9) {
            System.out.println("Kha");
        } else if (TinhTrungBinh() >= 9) {
            System.out.println("Gioi");
        }
    }

    public void inThongTin(){
        System.out.println(id + "-" + name +"-"+age + "-" + diemVan + "-" + diemToan + "-" + diemAnh);
    }
}
