
public class Clientes {
    private String rs;
    private String rfc;
    private String email;
    
    public Clientes(String rs,String rfc,String email){
    this.rs=rs;
    this.rfc=rfc;
    this.email=email;
    }
    @Override 
    public String toString(){
    return "Rs: "+this.rs+"\n"+
            "Rfc: "+this.rfc+"\n"+
            "email: "+this.email+"\n";
    }
}
