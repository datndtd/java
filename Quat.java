public class Quat {
    String thuongHieu, loai;
    float gia;
    int congSuat, capDo;

    boolean quayNgang;
    public Quat(String thuongHieu, String loai, float gia, int congSuat){
        this.thuongHieu = thuongHieu;
        this.loai = loai;
        this.gia = gia;
        this.congSuat = congSuat;
        this.capDo = 0;
        this.quayNgang = false;
    }

    void chuyenSo(int so){

        if(so >= 0){
            this.capDo = so;
        }
        else
            System.out.println("So khong hop le");
    }

    void chuyenTrangThaiQuay(){
        this.quayNgang = !this.quayNgang;
    }

    void bat(){
        if(this.capDo == 0)
            chuyenSo(1);
    }

    void tat(){
        chuyenSo(0);
    }

    void display(){
        System.out.println(this);
    }
    

    @Override
    public String toString() {
        return "Quat [capDo=" + capDo + ", congSuat=" + congSuat + ", gia=" + gia + ", loai=" + loai + ", quayNgang="
                + quayNgang + ", thuongHieu=" + thuongHieu + "]";
    }

    public static void main(String[] args){
        Quat dat = new Quat("Dat", "A", 100, 1100);
        Quat dung = new Quat("Dung", "B", 200, 1000);
        dat.display();
        dat.chuyenTrangThaiQuay();
        dat.bat();
        dat.chuyenSo(3);
        dat.display();
        dung.display();
    }
}