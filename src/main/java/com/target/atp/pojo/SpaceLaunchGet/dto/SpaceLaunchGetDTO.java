
package SpaceLaunchGet.dto;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * The root schema comprises the entire JSON document.
 * 
 */
public class SpaceLaunchGetDTO {

    /**
     * The fairings schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("fairings")
    @Expose
    private FairingsDTO fairings;
    /**
     * The links schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("links")
    @Expose
    private LinksDTO links;
    /**
     * The static_fire_date_utc schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("static_fire_date_utc")
    @Expose
    private Object staticFireDateUtc = null;
    /**
     * The static_fire_date_unix schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("static_fire_date_unix")
    @Expose
    private Object staticFireDateUnix = null;
    /**
     * The tbd schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("tbd")
    @Expose
    private Boolean tbd = false;
    /**
     * The net schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("net")
    @Expose
    private Boolean net = false;
    /**
     * The window schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("window")
    @Expose
    private Object window = null;
    /**
     * The rocket schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("rocket")
    @Expose
    private String rocket = "";
    /**
     * The success schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("success")
    @Expose
    private Boolean success = false;
    /**
     * The details schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("details")
    @Expose
    private String details = "";
    /**
     * The crew schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("crew")
    @Expose
    private List<Object> crew = new ArrayList<Object>();
    /**
     * The ships schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("ships")
    @Expose
    private List<Object> ships = new ArrayList<Object>();
    /**
     * The capsules schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("capsules")
    @Expose
    private List<Object> capsules = new ArrayList<Object>();
    /**
     * The payloads schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("payloads")
    @Expose
    private List<Object> payloads = new ArrayList<Object>();
    /**
     * The launchpad schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("launchpad")
    @Expose
    private String launchpad = "";
    /**
     * The auto_update schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("auto_update")
    @Expose
    private Boolean autoUpdate = false;
    /**
     * The launch_library_id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("launch_library_id")
    @Expose
    private String launchLibraryId = "";
    /**
     * The failures schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("failures")
    @Expose
    private List<Object> failures = new ArrayList<Object>();
    /**
     * The flight_number schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("flight_number")
    @Expose
    private Integer flightNumber = 0;
    /**
     * The name schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("name")
    @Expose
    private String name = "";
    /**
     * The date_utc schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("date_utc")
    @Expose
    private String dateUtc = "";
    /**
     * The date_unix schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("date_unix")
    @Expose
    private Integer dateUnix = 0;
    /**
     * The date_local schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("date_local")
    @Expose
    private String dateLocal = "";
    /**
     * The date_precision schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("date_precision")
    @Expose
    private String datePrecision = "";
    /**
     * The upcoming schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("upcoming")
    @Expose
    private Boolean upcoming = false;
    /**
     * The cores schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("cores")
    @Expose
    private List<Object> cores = new ArrayList<Object>();
    /**
     * The id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("id")
    @Expose
    private String id = "";

    /**
     * The fairings schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public FairingsDTO getFairings() {
        return fairings;
    }

    /**
     * The fairings schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setFairings(FairingsDTO fairings) {
        this.fairings = fairings;
    }

    /**
     * The links schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public LinksDTO getLinks() {
        return links;
    }

    /**
     * The links schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setLinks(LinksDTO links) {
        this.links = links;
    }

    /**
     * The static_fire_date_utc schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Object getStaticFireDateUtc() {
        return staticFireDateUtc;
    }

    /**
     * The static_fire_date_utc schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setStaticFireDateUtc(Object staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }

    /**
     * The static_fire_date_unix schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Object getStaticFireDateUnix() {
        return staticFireDateUnix;
    }

    /**
     * The static_fire_date_unix schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setStaticFireDateUnix(Object staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }

    /**
     * The tbd schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Boolean getTbd() {
        return tbd;
    }

    /**
     * The tbd schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setTbd(Boolean tbd) {
        this.tbd = tbd;
    }

    /**
     * The net schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Boolean getNet() {
        return net;
    }

    /**
     * The net schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setNet(Boolean net) {
        this.net = net;
    }

    /**
     * The window schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Object getWindow() {
        return window;
    }

    /**
     * The window schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setWindow(Object window) {
        this.window = window;
    }

    /**
     * The rocket schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getRocket() {
        return rocket;
    }

    /**
     * The rocket schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setRocket(String rocket) {
        this.rocket = rocket;
    }

    /**
     * The success schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * The success schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * The details schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getDetails() {
        return details;
    }

    /**
     * The details schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * The crew schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public List<Object> getCrew() {
        return crew;
    }

    /**
     * The crew schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setCrew(List<Object> crew) {
        this.crew = crew;
    }

    /**
     * The ships schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public List<Object> getShips() {
        return ships;
    }

    /**
     * The ships schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setShips(List<Object> ships) {
        this.ships = ships;
    }

    /**
     * The capsules schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public List<Object> getCapsules() {
        return capsules;
    }

    /**
     * The capsules schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setCapsules(List<Object> capsules) {
        this.capsules = capsules;
    }

    /**
     * The payloads schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public List<Object> getPayloads() {
        return payloads;
    }

    /**
     * The payloads schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setPayloads(List<Object> payloads) {
        this.payloads = payloads;
    }

    /**
     * The launchpad schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getLaunchpad() {
        return launchpad;
    }

    /**
     * The launchpad schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setLaunchpad(String launchpad) {
        this.launchpad = launchpad;
    }

    /**
     * The auto_update schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Boolean getAutoUpdate() {
        return autoUpdate;
    }

    /**
     * The auto_update schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * The launch_library_id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getLaunchLibraryId() {
        return launchLibraryId;
    }

    /**
     * The launch_library_id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setLaunchLibraryId(String launchLibraryId) {
        this.launchLibraryId = launchLibraryId;
    }

    /**
     * The failures schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public List<Object> getFailures() {
        return failures;
    }

    /**
     * The failures schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setFailures(List<Object> failures) {
        this.failures = failures;
    }

    /**
     * The flight_number schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Integer getFlightNumber() {
        return flightNumber;
    }

    /**
     * The flight_number schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * The name schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * The name schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The date_utc schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getDateUtc() {
        return dateUtc;
    }

    /**
     * The date_utc schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setDateUtc(String dateUtc) {
        this.dateUtc = dateUtc;
    }

    /**
     * The date_unix schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Integer getDateUnix() {
        return dateUnix;
    }

    /**
     * The date_unix schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setDateUnix(Integer dateUnix) {
        this.dateUnix = dateUnix;
    }

    /**
     * The date_local schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getDateLocal() {
        return dateLocal;
    }

    /**
     * The date_local schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setDateLocal(String dateLocal) {
        this.dateLocal = dateLocal;
    }

    /**
     * The date_precision schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getDatePrecision() {
        return datePrecision;
    }

    /**
     * The date_precision schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setDatePrecision(String datePrecision) {
        this.datePrecision = datePrecision;
    }

    /**
     * The upcoming schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Boolean getUpcoming() {
        return upcoming;
    }

    /**
     * The upcoming schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
    }

    /**
     * The cores schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public List<Object> getCores() {
        return cores;
    }

    /**
     * The cores schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setCores(List<Object> cores) {
        this.cores = cores;
    }

    /**
     * The id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * The id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fairings).append(links).append(staticFireDateUtc).append(staticFireDateUnix).append(tbd).append(net).append(window).append(rocket).append(success).append(details).append(crew).append(ships).append(capsules).append(payloads).append(launchpad).append(autoUpdate).append(launchLibraryId).append(failures).append(flightNumber).append(name).append(dateUtc).append(dateUnix).append(dateLocal).append(datePrecision).append(upcoming).append(cores).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpaceLaunchGetDTO) == false) {
            return false;
        }
        SpaceLaunchGetDTO rhs = ((SpaceLaunchGetDTO) other);
        return new EqualsBuilder().append(fairings, rhs.fairings).append(links, rhs.links).append(staticFireDateUtc, rhs.staticFireDateUtc).append(staticFireDateUnix, rhs.staticFireDateUnix).append(tbd, rhs.tbd).append(net, rhs.net).append(window, rhs.window).append(rocket, rhs.rocket).append(success, rhs.success).append(details, rhs.details).append(crew, rhs.crew).append(ships, rhs.ships).append(capsules, rhs.capsules).append(payloads, rhs.payloads).append(launchpad, rhs.launchpad).append(autoUpdate, rhs.autoUpdate).append(launchLibraryId, rhs.launchLibraryId).append(failures, rhs.failures).append(flightNumber, rhs.flightNumber).append(name, rhs.name).append(dateUtc, rhs.dateUtc).append(dateUnix, rhs.dateUnix).append(dateLocal, rhs.dateLocal).append(datePrecision, rhs.datePrecision).append(upcoming, rhs.upcoming).append(cores, rhs.cores).append(id, rhs.id).isEquals();
    }

}
