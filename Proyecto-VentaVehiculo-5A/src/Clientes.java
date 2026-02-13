
public class Clientes {

    private String rs;
    private String rfc;
    private String email;

    public Clientes(String rs, String rfc, String email) {
        this.rs = rs;
        this.rfc = rfc;
        this.email = email;
    }

    //Rs
    public void setrs(String rs) {
        this.rs = rs;
    }

    public String getrs() {
        return this.rs;
    }

    //RFC
    public void setrfc(String rfc) {
        this.rfc = rfc;
    }

    public String getrfc() {
        return this.rfc;
    }

    //email
    public void setemail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Rs: " + this.rs + "\n"
                + "Rfc: " + this.rfc + "\n"
                + "email: " + this.email + "\n";
    }
}
