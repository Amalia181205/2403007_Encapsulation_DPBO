public class AkunBank {
    
    private int saldo;

    public AkunBank(int saldo){
        this.saldo=saldo;
    }
    public void setSaldo(int saldo){
         this.saldo=saldo;
    }
    public int getSaldo(){
        return this.saldo;
    }

    public int menabung(int saldo){
    if(saldo > 0){
        this.saldo += saldo;   
        return this.saldo;     
    }else{
        return this.saldo;     
    }
    }

      public void tarikTunai(int saldo){
    if (saldo < 10) {
        System.out.println("Minimal tarik tunai adalah 10");
    } else if (this.saldo - saldo < 10) {
        System.out.println("Saldo tidak mencukupi");
        System.out.println("Saldo minimal harus tersisa 10");
    } else { 
        this.saldo -= saldo; 
        System.out.println("Tarik tunai berhasil");
    }
}
}