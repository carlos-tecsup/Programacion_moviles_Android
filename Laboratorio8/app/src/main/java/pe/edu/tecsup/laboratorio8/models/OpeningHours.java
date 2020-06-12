
package pe.edu.tecsup.laboratorio8.models;

//import org.apache.commons.lang.builder.ToStringBuilder;

public class OpeningHours {

    private Boolean openNow;

    public Boolean getOpenNow() {
        return openNow;
    }

    public void setOpenNow(Boolean openNow) {
        this.openNow = openNow;
    }

//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("openNow", openNow).toString();
//    }


    @Override
    public String toString() {
        return "OpeningHours{"+
                "openNow="+openNow+
                '}';
    }
}