package BTVN_Buoi3.Bai5;

public class RunMain {
    public static void main(String[] args) {
        Guns G1=new Guns("Coffee Bean",20);
        Guns G2=new Guns("Cattail",15);
        for(int i=0;;i++){
            G1.Load(2);
            G2.Load(2);
            G1.Shoot(5);
            G2.Shoot(6);
            if(G1.getAmmoNumber()==0){
                System.out.println("G1 Hết Đạn----> LOSE");
                break;
            }
            if(G2.getAmmoNumber()==0){
                System.out.println("G2 Hết Đạn---->LOSE");
                break;
            }
        }
    }
}
