
package pe.edu.tecsup.laboratorio8.models;

//import org.apache.commons.lang.builder.ToStringBuilder;

public class Viewport {

    private Northeast northeast;
    private Southwest southwest;

    public Northeast getNortheast() {
        return northeast;
    }

    public void setNortheast(Northeast northeast) {
        this.northeast = northeast;
    }

    public Southwest getSouthwest() {
        return southwest;
    }

    public void setSouthwest(Southwest southwest) {
        this.southwest = southwest;
    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("northeast", northeast).append("southwest", southwest).toString();
//    }


    @Override
    public String toString() {
        return "Southwest{"+
                "northeast="+northeast+
                ",southwest='"+southwest+'\''+

                '}';
    }

}