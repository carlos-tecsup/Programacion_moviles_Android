package pe.edu.tecsup.laboratorio8.models;

import java.util.List;
//import org.apache.commons.lang.builder.ToStringBuilder;

public class Photo {

    private Integer height;
    private List<String> htmlAttributions = null;
    private String photoReference;
    private Integer width;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public List<String> getHtmlAttributions() {
        return htmlAttributions;
    }

    public void setHtmlAttributions(List<String> htmlAttributions) {
        this.htmlAttributions = htmlAttributions;
    }

    public String getPhotoReference() {
        return photoReference;
    }

    public void setPhotoReference(String photoReference) {
        this.photoReference = photoReference;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("height", height).append("htmlAttributions", htmlAttributions).append("photoReference", photoReference).append("width", width).toString();
//    }


    @Override
    public String toString() {
        return "Photo{"+
                "height="+height+
                ",htmlAttributions='"+htmlAttributions+'\''+
                ",photoReference='"+photoReference+'\''+
                ",width='"+width+'\''+
                '}';
    }

}