public class utama{
    public static void main(String[] args){

    //membuat object
    manager na = new manager ("Dinar");
    manager naga = new manager ("Arya", 20000000);
    manager nagatu = new manager("Qodri", 20000000, 2000000);

    programmer x = new programmer ("neo");
    programmer y = new programmer ("laras", 8000000);
    programmer z = new programmer("elja", 7500000, 500000);

    na.cetakInfo();
    naga.cetakInfo();
    nagatu.cetakInfo();

    x.cetakInfo();
    y.cetakInfo();
    z.cetakInfo();



    }
}