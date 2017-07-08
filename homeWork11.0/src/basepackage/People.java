package basepackage;

public class People {
    private String Fname;
    private String Iname;
    private String Oname;

    public People() {
    }

    public People(String fname, String iname, String oname) {
        this.Fname = fname;
        this.Iname = iname;
        this.Oname = oname;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        this.Fname = fname;
    }

    public String getIname() {
        return Iname;
    }

    public void setIname(String iname) {
        this.Iname = iname;
    }

    public String getOname() {
        return Oname;
    }

    public void setOname(String oname) {
        this.Oname = oname;
    }
}