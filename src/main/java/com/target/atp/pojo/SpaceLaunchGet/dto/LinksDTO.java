
package SpaceLaunchGet.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * The links schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
public class LinksDTO {

    /**
     * The patch schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("patch")
    @Expose
    private PatchDTO patch;
    /**
     * The reddit schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("reddit")
    @Expose
    private RedditDTO reddit;
    /**
     * The flickr schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("flickr")
    @Expose
    private FlickrDTO flickr;
    /**
     * The presskit schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("presskit")
    @Expose
    private Object presskit = null;
    /**
     * The webcast schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("webcast")
    @Expose
    private String webcast = "";
    /**
     * The youtube_id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("youtube_id")
    @Expose
    private String youtubeId = "";
    /**
     * The article schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("article")
    @Expose
    private Object article = null;
    /**
     * The wikipedia schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("wikipedia")
    @Expose
    private String wikipedia = "";

    /**
     * The patch schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public PatchDTO getPatch() {
        return patch;
    }

    /**
     * The patch schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setPatch(PatchDTO patch) {
        this.patch = patch;
    }

    /**
     * The reddit schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public RedditDTO getReddit() {
        return reddit;
    }

    /**
     * The reddit schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setReddit(RedditDTO reddit) {
        this.reddit = reddit;
    }

    /**
     * The flickr schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public FlickrDTO getFlickr() {
        return flickr;
    }

    /**
     * The flickr schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setFlickr(FlickrDTO flickr) {
        this.flickr = flickr;
    }

    /**
     * The presskit schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Object getPresskit() {
        return presskit;
    }

    /**
     * The presskit schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setPresskit(Object presskit) {
        this.presskit = presskit;
    }

    /**
     * The webcast schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getWebcast() {
        return webcast;
    }

    /**
     * The webcast schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setWebcast(String webcast) {
        this.webcast = webcast;
    }

    /**
     * The youtube_id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getYoutubeId() {
        return youtubeId;
    }

    /**
     * The youtube_id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    /**
     * The article schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Object getArticle() {
        return article;
    }

    /**
     * The article schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setArticle(Object article) {
        this.article = article;
    }

    /**
     * The wikipedia schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getWikipedia() {
        return wikipedia;
    }

    /**
     * The wikipedia schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(patch).append(reddit).append(flickr).append(presskit).append(webcast).append(youtubeId).append(article).append(wikipedia).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LinksDTO) == false) {
            return false;
        }
        LinksDTO rhs = ((LinksDTO) other);
        return new EqualsBuilder().append(patch, rhs.patch).append(reddit, rhs.reddit).append(flickr, rhs.flickr).append(presskit, rhs.presskit).append(webcast, rhs.webcast).append(youtubeId, rhs.youtubeId).append(article, rhs.article).append(wikipedia, rhs.wikipedia).isEquals();
    }

}
