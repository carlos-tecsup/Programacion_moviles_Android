package pe.edu.tecsup.laboratorio8.models;

//import org.apache.commons.lang.builder.ToStringBuilder;

public class Northeast {

    private Double lat;
    private Double lng;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("lat", lat).append("lng", lng).toString();
//    }

    @Override
    public String toString() {
        return "Northeast{"+
                "lat="+lat+
                ",lng='"+lng+'\''+
                '}';
    }

}