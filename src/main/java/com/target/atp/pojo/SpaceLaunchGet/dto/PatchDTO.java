
package SpaceLaunchGet.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * The patch schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
public class PatchDTO {

    /**
     * The small schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("small")
    @Expose
    private String small = "";
    /**
     * The large schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("large")
    @Expose
    private String large = "";

    /**
     * The small schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getSmall() {
        return small;
    }

    /**
     * The small schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setSmall(String small) {
        this.small = small;
    }

    /**
     * The large schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getLarge() {
        return large;
    }

    /**
     * The large schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setLarge(String large) {
        this.large = large;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(small).append(large).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PatchDTO) == false) {
            return false;
        }
        PatchDTO rhs = ((PatchDTO) other);
        return new EqualsBuilder().append(small, rhs.small).append(large, rhs.large).isEquals();
    }

}
