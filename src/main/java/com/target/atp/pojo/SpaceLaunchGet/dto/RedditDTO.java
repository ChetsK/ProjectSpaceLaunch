
package SpaceLaunchGet.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * The reddit schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
public class RedditDTO {

    /**
     * The campaign schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("campaign")
    @Expose
    private String campaign = "";
    /**
     * The launch schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("launch")
    @Expose
    private String launch = "";
    /**
     * The media schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("media")
    @Expose
    private Object media = null;
    /**
     * The recovery schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("recovery")
    @Expose
    private String recovery = "";

    /**
     * The campaign schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getCampaign() {
        return campaign;
    }

    /**
     * The campaign schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    /**
     * The launch schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getLaunch() {
        return launch;
    }

    /**
     * The launch schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setLaunch(String launch) {
        this.launch = launch;
    }

    /**
     * The media schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Object getMedia() {
        return media;
    }

    /**
     * The media schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setMedia(Object media) {
        this.media = media;
    }

    /**
     * The recovery schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getRecovery() {
        return recovery;
    }

    /**
     * The recovery schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setRecovery(String recovery) {
        this.recovery = recovery;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(campaign).append(launch).append(media).append(recovery).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RedditDTO) == false) {
            return false;
        }
        RedditDTO rhs = ((RedditDTO) other);
        return new EqualsBuilder().append(campaign, rhs.campaign).append(launch, rhs.launch).append(media, rhs.media).append(recovery, rhs.recovery).isEquals();
    }

}
