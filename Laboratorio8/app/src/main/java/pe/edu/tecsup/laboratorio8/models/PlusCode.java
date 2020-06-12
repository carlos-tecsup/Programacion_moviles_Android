package pe.edu.tecsup.laboratorio8.models;

//import org.apache.commons.lang.builder.ToStringBuilder;

public class PlusCode {

    private String compoundCode;
    private String globalCode;

    public String getCompoundCode() {
        return compoundCode;
    }

    public void setCompoundCode(String compoundCode) {
        this.compoundCode = compoundCode;
    }

    public String getGlobalCode() {
        return globalCode;
    }

    public void setGlobalCode(String globalCode) {
        this.globalCode = globalCode;
    }

//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("compoundCode", compoundCode).append("globalCode", globalCode).toString();
//    }


    @Override
    public String toString() {
        return "PlusCode{"+
                "compoundCode="+compoundCode+
                ",globalCode='"+globalCode+'\''+
                '}';
    }

}