public class Rasional{
    private int pembilang, penyebut;

    public Rasional(){
        pembilang=0;
        penyebut=0;
    }
    public Rasional(int pbl, int pyb){
        pembilang=pbl;
        penyebut=pyb;
    }

    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
        return (penyebut!= 0);
    }
    //menyederhanakan bilangan rasional
    public void Sederhana(){
            int temp, A, B;
        if (penyebut ==0){
        return;
        }
        A = (pembilang<penyebut) ? penyebut:pembilang;
        B = (pembilang<penyebut) ? pembilang:penyebut;
// nomor 3
        for (;B != 0;){
            temp= A % B;
            A = B;
            B = temp;
        }

        pembilang /=A;
        penyebut /=A;
    }
    public double Cast(){
    return (penyebut==0.0) ? 0.0 : (double)pembilang /
    (double)penyebut;}
    //oprator >
    public boolean moreThan (Rasional A){
    return (pembilang * A.penyebut > penyebut * A.pembilang
    );
    }  
    //nomor2
    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
    
    public boolean lessThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    
    public boolean moreThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }
    
    public boolean notEqual(Rasional A) {
        return (pembilang * A.penyebut != penyebut * A.pembilang);
    }
    //operator Unary- ---> A = -A
    public void negasi(){
    pembilang = - pembilang;
    }
    //operator unary += \
    public void unaryPlus(Rasional A){
    pembilang = pembilang * A.penyebut + penyebut *
    A.pembilang;
    penyebut *=A.penyebut;
    }
    public void cetak(){
    System.out.println(pembilang + "/" + penyebut);
    }    
  
    // NOMOR 4
        // Operasi pengurangan (-)
    public Rasional subtract(Rasional A) {
        int resultPembilang = (this.pembilang * A.penyebut) - (this.penyebut * A.pembilang);
        int resultPenyebut = this.penyebut * A.penyebut;
        return new Rasional(resultPembilang, resultPenyebut);
    }

    // Operasi perkalian (*)
    public Rasional multiply(Rasional A) {
        int resultPembilang = this.pembilang * A.pembilang;
        int resultPenyebut = this.penyebut * A.penyebut;
        return new Rasional(resultPembilang, resultPenyebut);
    }

    // Operasi pembagian (/)
    public Rasional divide(Rasional A) {
        int resultPembilang = this.pembilang * A.penyebut;
        int resultPenyebut = this.penyebut * A.pembilang;
        return new Rasional(resultPembilang, resultPenyebut);
    }
}
