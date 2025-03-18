import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaResponse {
    private final String COPYRIGHT;
    private final String DATE;
    private final String EXPLANATION;
    private final String HD_URL;
    private final String MEDIA_TYPE;
    private final String SERVICE_VERSION;
    private final String TITLE;
    private final String URL;

    public NasaResponse(
            @JsonProperty("copyright") String copyright,
            @JsonProperty("date") String date,
            @JsonProperty("explanation") String explanation,
            @JsonProperty("hdurl") String hdurl,
            @JsonProperty("media_type") String media_type,
            @JsonProperty("service_version") String service_version,
            @JsonProperty("title") String title,
            @JsonProperty("url") String url
    ) {
        this.COPYRIGHT = copyright;
        this.DATE = date;
        this.EXPLANATION = explanation;
        this.HD_URL = hdurl;
        this.MEDIA_TYPE = media_type;
        this.SERVICE_VERSION = service_version;
        this.TITLE = title;
        this.URL = url;
    }

    public String getCOPYRIGHT() {
        return COPYRIGHT;
    }

    public String getDATE() {
        return DATE;
    }

    public String getEXPLANATION() {
        return EXPLANATION;
    }

    public String getHD_URL() {
        return HD_URL;
    }

    public String getMEDIA_TYPE() {
        return MEDIA_TYPE;
    }

    public String getSERVICE_VERSION() {
        return SERVICE_VERSION;
    }

    public String getTITLE() {
        return TITLE;
    }

    public String getURL() {
        return URL;
    }

    @Override
    public String toString() {
        return "NASAResponse" +
                "\n copyright=" + COPYRIGHT +
                "\n date=" + DATE +
                "\n explanation=" + EXPLANATION +
                "\n hdurl=" + HD_URL +
                "\n media_type=" + MEDIA_TYPE +
                "\n service_version=" + SERVICE_VERSION +
                "\n title=" + TITLE +
                "\n url=" + URL;
    }
}
