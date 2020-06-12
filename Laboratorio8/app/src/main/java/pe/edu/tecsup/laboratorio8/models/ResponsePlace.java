package pe.edu.tecsup.laboratorio8.models;//package pe.edu.tecsup.laboratorio8.models;
//
//import java.util.List;
//
//public abstract class ResponsePlace {
//
//
//    private String status;
//    private List<ResultsEntity> results;
//    private String next_page_token;
//    private List<String> html_attributions;
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public List<ResultsEntity> getResults() {
//        return results;
//    }
//
//    public void setResults(List<ResultsEntity> results) {
//        this.results = results;
//    }
//
//    public String getNext_page_token() {
//        return next_page_token;
//    }
//
//    public void setNext_page_token(String next_page_token) {
//        this.next_page_token = next_page_token;
//    }
//
//    public List<String> getHtml_attributions() {
//        return html_attributions;
//    }
//
//    public void setHtml_attributions(List<String> html_attributions) {
//        this.html_attributions = html_attributions;
//    }
//
//    public static class ResultsEntity {
//        private String vicinity;
//        private int user_ratings_total;
//        private List<String> types;
//        private String scope;
//        private String reference;
//        private double rating;
//        private int price_level;
//        private Plus_codeEntity plus_code;
//        private String place_id;
//        private List<PhotosEntity> photos;
//        private boolean permanently_closed;
//        private String name;
//        private String id;
//        private String icon;
//        private GeometryEntity geometry;
//        private String business_status;
//
//        public String getVicinity() {
//            return vicinity;
//        }
//
//        public void setVicinity(String vicinity) {
//            this.vicinity = vicinity;
//        }
//
//        public int getUser_ratings_total() {
//            return user_ratings_total;
//        }
//
//        public void setUser_ratings_total(int user_ratings_total) {
//            this.user_ratings_total = user_ratings_total;
//        }
//
//        public List<String> getTypes() {
//            return types;
//        }
//
//        public void setTypes(List<String> types) {
//            this.types = types;
//        }
//
//        public String getScope() {
//            return scope;
//        }
//
//        public void setScope(String scope) {
//            this.scope = scope;
//        }
//
//        public String getReference() {
//            return reference;
//        }
//
//        public void setReference(String reference) {
//            this.reference = reference;
//        }
//
//        public double getRating() {
//            return rating;
//        }
//
//        public void setRating(double rating) {
//            this.rating = rating;
//        }
//
//        public int getPrice_level() {
//            return price_level;
//        }
//
//        public void setPrice_level(int price_level) {
//            this.price_level = price_level;
//        }
//
//        public Plus_codeEntity getPlus_code() {
//            return plus_code;
//        }
//
//        public void setPlus_code(Plus_codeEntity plus_code) {
//            this.plus_code = plus_code;
//        }
//
//        public String getPlace_id() {
//            return place_id;
//        }
//
//        public void setPlace_id(String place_id) {
//            this.place_id = place_id;
//        }
//
//        public List<PhotosEntity> getPhotos() {
//            return photos;
//        }
//
//        public void setPhotos(List<PhotosEntity> photos) {
//            this.photos = photos;
//        }
//
//        public boolean getPermanently_closed() {
//            return permanently_closed;
//        }
//
//        public void setPermanently_closed(boolean permanently_closed) {
//            this.permanently_closed = permanently_closed;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getId() {
//            return id;
//        }
//
//        public void setId(String id) {
//            this.id = id;
//        }
//
//        public String getIcon() {
//            return icon;
//        }
//
//        public void setIcon(String icon) {
//            this.icon = icon;
//        }
//
//        public GeometryEntity getGeometry() {
//            return geometry;
//        }
//
//        public void setGeometry(GeometryEntity geometry) {
//            this.geometry = geometry;
//        }
//
//        public String getBusiness_status() {
//            return business_status;
//        }
//
//        public void setBusiness_status(String business_status) {
//            this.business_status = business_status;
//        }
//    }
//
//    public static class Plus_codeEntity {
//        private String global_code;
//        private String compound_code;
//
//        public String getGlobal_code() {
//            return global_code;
//        }
//
//        public void setGlobal_code(String global_code) {
//            this.global_code = global_code;
//        }
//
//        public String getCompound_code() {
//            return compound_code;
//        }
//
//        public void setCompound_code(String compound_code) {
//            this.compound_code = compound_code;
//        }
//    }
//
//    public static class PhotosEntity {
//        private int width;
//        private String photo_reference;
//        private List<String> html_attributions;
//        private int height;
//
//        public int getWidth() {
//            return width;
//        }
//
//        public void setWidth(int width) {
//            this.width = width;
//        }
//
//        public String getPhoto_reference() {
//            return photo_reference;
//        }
//
//        public void setPhoto_reference(String photo_reference) {
//            this.photo_reference = photo_reference;
//        }
//
//        public List<String> getHtml_attributions() {
//            return html_attributions;
//        }
//
//        public void setHtml_attributions(List<String> html_attributions) {
//            this.html_attributions = html_attributions;
//        }
//
//        public int getHeight() {
//            return height;
//        }
//
//        public void setHeight(int height) {
//            this.height = height;
//        }
//    }
//
//    public static class GeometryEntity {
//        private ViewportEntity viewport;
//        private LocationEntity location;
//
//        public ViewportEntity getViewport() {
//            return viewport;
//        }
//
//        public void setViewport(ViewportEntity viewport) {
//            this.viewport = viewport;
//        }
//
//        public LocationEntity getLocation() {
//            return location;
//        }
//
//        public void setLocation(LocationEntity location) {
//            this.location = location;
//        }
//    }
//
//    public static class ViewportEntity {
//        private SouthwestEntity southwest;
//        private NortheastEntity northeast;
//
//        public SouthwestEntity getSouthwest() {
//            return southwest;
//        }
//
//        public void setSouthwest(SouthwestEntity southwest) {
//            this.southwest = southwest;
//        }
//
//        public NortheastEntity getNortheast() {
//            return northeast;
//        }
//
//        public void setNortheast(NortheastEntity northeast) {
//            this.northeast = northeast;
//        }
//    }
//
//    public static class SouthwestEntity {
//        private double lng;
//        private double lat;
//
//        public double getLng() {
//            return lng;
//        }
//
//        public void setLng(double lng) {
//            this.lng = lng;
//        }
//
//        public double getLat() {
//            return lat;
//        }
//
//        public void setLat(double lat) {
//            this.lat = lat;
//        }
//    }
//
//    public static class NortheastEntity {
//        private double lng;
//        private double lat;
//
//        public double getLng() {
//            return lng;
//        }
//
//        public void setLng(double lng) {
//            this.lng = lng;
//        }
//
//        public double getLat() {
//            return lat;
//        }
//
//        public void setLat(double lat) {
//            this.lat = lat;
//        }
//    }
//
//    public static class LocationEntity {
//        private double lng;
//        private double lat;
//
//        public double getLng() {
//            return lng;
//        }
//
//        public void setLng(double lng) {
//            this.lng = lng;
//        }
//
//        public double getLat() {
//            return lat;
//        }
//
//        public void setLat(double lat) {
//            this.lat = lat;
//        }
//    }
//
//    public class Direccion {
//
//        private List<Object> htmlAttributions = null;
//        private String nextPageToken;
//        private List<Result> results = null;
//        private String status;
//
//        public List<Object> getHtmlAttributions() {
//            return htmlAttributions;
//        }
//
//        public void setHtmlAttributions(List<Object> htmlAttributions) {
//            this.htmlAttributions = htmlAttributions;
//        }
//
//        public String getNextPageToken() {
//            return nextPageToken;
//        }
//
//        public void setNextPageToken(String nextPageToken) {
//            this.nextPageToken = nextPageToken;
//        }
//
//        public List<Result> getResults() {
//            return results;
//        }
//
//        public void setResults(List<Result> results) {
//            this.results = results;
//        }
//
//        public String getStatus() {
//            return status;
//        }
//
//        public void setStatus(String status) {
//            this.status = status;
//        }
//
////    @Override
////    public String toString() {
////        return new ToStringBuilder(this).append("htmlAttributions", htmlAttributions).append("nextPageToken", nextPageToken).append("results", results).append("status", status).toString();
////    }
//
//        @Override
//        public String toString() {
//            return "Direccion{" +
//                    "htmlAttributions=" + htmlAttributions +
//                    ",nextPageToken='" + nextPageToken + '\'' +
//                    ",results='" + results + '\'' +
//                    ",status='" + status + '\'' +
//                    '}';
//        }
//    }
//
//    public class Geometry {
//
//        private Location location;
//        private Viewport viewport;
//
//        public Location getLocation() {
//            return location;
//        }
//
//        public void setLocation(Location location) {
//            this.location = location;
//        }
//
//        public Viewport getViewport() {
//            return viewport;
//        }
//
//        public void setViewport(Viewport viewport) {
//            this.viewport = viewport;
//        }
//
//        //    @Override
////    public String toString() {
////        return new ToStringBuilder(this).append("location", location).append("viewport", viewport).toString();
////    }
//        @Override
//        public String toString() {
//            return "Geometry{" +
//                    "location=" + location +
//                    ",viewport='" + viewport + '\'' +
//                    '}';
//        }
//    }
//
//
//    public class Location {
//
//        private Double lat;
//        private Double lng;
//
//        public Double getLat() {
//            return lat;
//        }
//
//        public void setLat(Double lat) {
//            this.lat = lat;
//        }
//
//        public Double getLng() {
//            return lng;
//        }
//
//        public void setLng(Double lng) {
//            this.lng = lng;
//        }
//
////    @Override
////    public String toString() {
////        return new ToStringBuilder(this).append("lat", lat).append("lng", lng).toString();
////    }
//
//        @Override
//        public String toString() {
//            return "Location{" +
//                    "lat=" + lat +
//                    ",lng='" + lng + '\'' +
//                    '}';
//        }
//
//    }
//
//
//    public class Northeast {
//
//        private Double lat;
//        private Double lng;
//
//        public Double getLat() {
//            return lat;
//        }
//
//        public void setLat(Double lat) {
//            this.lat = lat;
//        }
//
//        public Double getLng() {
//            return lng;
//        }
//
//        public void setLng(Double lng) {
//            this.lng = lng;
//        }
//
////    @Override
////    public String toString() {
////        return new ToStringBuilder(this).append("lat", lat).append("lng", lng).toString();
////    }
//
//        @Override
//        public String toString() {
//            return "Northeast{" +
//                    "lat=" + lat +
//                    ",lng='" + lng + '\'' +
//                    '}';
//        }
//
//    }
//
//    public class OpeningHours {
//
//        private Boolean openNow;
//
//        public Boolean getOpenNow() {
//            return openNow;
//        }
//
//        public void setOpenNow(Boolean openNow) {
//            this.openNow = openNow;
//        }
//
////    @Override
////    public String toString() {
////        return new ToStringBuilder(this).append("openNow", openNow).toString();
////    }
//
//
//        @Override
//        public String toString() {
//            return "OpeningHours{" +
//                    "openNow=" + openNow +
//                    '}';
//        }
//    }
//
//    public class Photo {
//
//        private Integer height;
//        private List<String> htmlAttributions = null;
//        private String photoReference;
//        private Integer width;
//
//        public Integer getHeight() {
//            return height;
//        }
//
//        public void setHeight(Integer height) {
//            this.height = height;
//        }
//
//        public List<String> getHtmlAttributions() {
//            return htmlAttributions;
//        }
//
//        public void setHtmlAttributions(List<String> htmlAttributions) {
//            this.htmlAttributions = htmlAttributions;
//        }
//
//        public String getPhotoReference() {
//            return photoReference;
//        }
//
//        public void setPhotoReference(String photoReference) {
//            this.photoReference = photoReference;
//        }
//
//        public Integer getWidth() {
//            return width;
//        }
//
//        public void setWidth(Integer width) {
//            this.width = width;
//        }
//
////    @Override
////    public String toString() {
////        return new ToStringBuilder(this).append("height", height).append("htmlAttributions", htmlAttributions).append("photoReference", photoReference).append("width", width).toString();
////    }
//
//
//        @Override
//        public String toString() {
//            return "Photo{" +
//                    "height=" + height +
//                    ",htmlAttributions='" + htmlAttributions + '\'' +
//                    ",photoReference='" + photoReference + '\'' +
//                    ",width='" + width + '\'' +
//                    '}';
//        }
//
//    }
//
//
//    public class PlusCode {
//
//        private String compoundCode;
//        private String globalCode;
//
//        public String getCompoundCode() {
//            return compoundCode;
//        }
//
//        public void setCompoundCode(String compoundCode) {
//            this.compoundCode = compoundCode;
//        }
//
//        public String getGlobalCode() {
//            return globalCode;
//        }
//
//        public void setGlobalCode(String globalCode) {
//            this.globalCode = globalCode;
//        }
//
////    @Override
////    public String toString() {
////        return new ToStringBuilder(this).append("compoundCode", compoundCode).append("globalCode", globalCode).toString();
////    }
//
//
//        @Override
//        public String toString() {
//            return "PlusCode{" +
//                    "compoundCode=" + compoundCode +
//                    ",globalCode='" + globalCode + '\'' +
//                    '}';
//        }
//
//    }
//
//
//    public class Result {
//
//        private String businessStatus;
//        private Geometry geometry;
//        private String icon;
//        private String id;
//        private String name;
//        private Boolean permanentlyClosed;
//        private List<Photo> photos = null;
//        private String placeId;
//        private PlusCode plusCode;
//        private Integer priceLevel;
//        private Double rating;
//        private String reference;
//        private String scope;
//        private List<String> types = null;
//        private Integer userRatingsTotal;
//        private String vicinity;
//        private OpeningHours openingHours;
//
//        public String getBusinessStatus() {
//            return businessStatus;
//        }
//
//        public void setBusinessStatus(String businessStatus) {
//            this.businessStatus = businessStatus;
//        }
//
//        public Geometry getGeometry() {
//            return geometry;
//        }
//
//        public void setGeometry(Geometry geometry) {
//            this.geometry = geometry;
//        }
//
//        public String getIcon() {
//            return icon;
//        }
//
//        public void setIcon(String icon) {
//            this.icon = icon;
//        }
//
//        public String getId() {
//            return id;
//        }
//
//        public void setId(String id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public Boolean getPermanentlyClosed() {
//            return permanentlyClosed;
//        }
//
//        public void setPermanentlyClosed(Boolean permanentlyClosed) {
//            this.permanentlyClosed = permanentlyClosed;
//        }
//
//        public List<Photo> getPhotos() {
//            return photos;
//        }
//
//        public void setPhotos(List<Photo> photos) {
//            this.photos = photos;
//        }
//
//        public String getPlaceId() {
//            return placeId;
//        }
//
//        public void setPlaceId(String placeId) {
//            this.placeId = placeId;
//        }
//
//        public PlusCode getPlusCode() {
//            return plusCode;
//        }
//
//        public void setPlusCode(PlusCode plusCode) {
//            this.plusCode = plusCode;
//        }
//
//        public Integer getPriceLevel() {
//            return priceLevel;
//        }
//
//        public void setPriceLevel(Integer priceLevel) {
//            this.priceLevel = priceLevel;
//        }
//
//        public Double getRating() {
//            return rating;
//        }
//
//        public void setRating(Double rating) {
//            this.rating = rating;
//        }
//
//        public String getReference() {
//            return reference;
//        }
//
//        public void setReference(String reference) {
//            this.reference = reference;
//        }
//
//        public String getScope() {
//            return scope;
//        }
//
//        public void setScope(String scope) {
//            this.scope = scope;
//        }
//
//        public List<String> getTypes() {
//            return types;
//        }
//
//        public void setTypes(List<String> types) {
//            this.types = types;
//        }
//
//        public Integer getUserRatingsTotal() {
//            return userRatingsTotal;
//        }
//
//        public void setUserRatingsTotal(Integer userRatingsTotal) {
//            this.userRatingsTotal = userRatingsTotal;
//        }
//
//        public String getVicinity() {
//            return vicinity;
//        }
//
//        public void setVicinity(String vicinity) {
//            this.vicinity = vicinity;
//        }
//
//        public OpeningHours getOpeningHours() {
//            return openingHours;
//        }
//
//        public void setOpeningHours(OpeningHours openingHours) {
//            this.openingHours = openingHours;
//        }
//
////    @Override
////    public String toString() {
////        return new ToStringBuilder(this).append("businessStatus", businessStatus).append("geometry", geometry).append("icon", icon).append("id", id).append("name", name).append("permanentlyClosed", permanentlyClosed).append("photos", photos).append("placeId", placeId).append("plusCode", plusCode).append("priceLevel", priceLevel).append("rating", rating).append("reference", reference).append("scope", scope).append("types", types).append("userRatingsTotal", userRatingsTotal).append("vicinity", vicinity).append("openingHours", openingHours).toString();
////    }
//
//
//        @Override
//        public String toString() {
//            return "Result{" +
//                    "businessStatus=" + businessStatus +
//                    ",geometry='" + geometry + '\'' +
//                    ",icon='" + icon + '\'' +
//                    ",id='" + id + '\'' +
//                    ",name='" + name + '\'' +
//                    ",permanentlyClosed='" + permanentlyClosed + '\'' +
//                    ",photos='" + photos + '\'' +
//                    ",placeId='" + placeId + '\'' +
//                    ",plusCode='" + plusCode + '\'' +
//                    ",priceLevel='" + priceLevel + '\'' +
//                    ",rating='" + rating + '\'' +
//                    ",reference='" + reference + '\'' +
//                    ",scope='" + scope + '\'' +
//                    ",types='" + types + '\'' +
//                    ",userRatingsTotal='" + userRatingsTotal + '\'' +
//                    ",vicinity='" + vicinity + '\'' +
//                    ",openingHours='" + openingHours + '\'' +
//                    '}';
//        }
//
//
//    }
//
//
//    public class Southwest {
//
//        private Double lat;
//        private Double lng;
//
//        public Double getLat() {
//            return lat;
//        }
//
//        public void setLat(Double lat) {
//            this.lat = lat;
//        }
//
//        public Double getLng() {
//            return lng;
//        }
//
//        public void setLng(Double lng) {
//            this.lng = lng;
//        }
//
////    @Override
////    public String toString() {
////        return new ToStringBuilder(this).append("lat", lat).append("lng", lng).toString();
////    }
//
//
//        @Override
//        public String toString() {
//            return "Southwest{" +
//                    "lat=" + lat +
//                    ",lng='" + lng + '\'' +
//
//                    '}';
//        }
//    }
//
//
//    public class Viewport {
//
//        private Northeast northeast;
//        private Southwest southwest;
//
//        public Northeast getNortheast() {
//            return northeast;
//        }
//
//        public void setNortheast(Northeast northeast) {
//            this.northeast = northeast;
//        }
//
//        public Southwest getSouthwest() {
//            return southwest;
//        }
//
//        public void setSouthwest(Southwest southwest) {
//            this.southwest = southwest;
//        }
////
////    @Override
////    public String toString() {
////        return new ToStringBuilder(this).append("northeast", northeast).append("southwest", southwest).toString();
////    }
//
//
//        @Override
//        public String toString() {
//            return "Southwest{" +
//                    "northeast=" + northeast +
//                    ",southwest='" + southwest + '\'' +
//
//                    '}';
//        }
//
//    }
//
//
//
//}
//
