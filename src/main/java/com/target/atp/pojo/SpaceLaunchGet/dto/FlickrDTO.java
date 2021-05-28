
package SpaceLaunchGet.dto;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * The flickr schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
public class FlickrDTO {

    /**
     * The small schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("small")
    @Expose
    private List<Object> small = new ArrayList<Object>();
    /**
     * The original schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("original")
    @Expose
    private List<Object> original = new ArrayList<Object>();

    /**
     * The small schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public List<Object> getSmall() {
        return small;
    }

    /**
     * The small schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setSmall(List<Object> small) {
        this.small = small;
    }

    /**
     * The original schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public List<Object> getOriginal() {
        return original;
    }

    /**
     * The original schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setOriginal(List<Object> original) {
        this.original = original;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(small).append(original).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlickrDTO) == false) {
            return false;
        }
        FlickrDTO rhs = ((FlickrDTO) other);
        return new EqualsBuilder().append(small, rhs.small).append(original, rhs.original).isEquals();
    }

}
