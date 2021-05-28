
package SpaceLaunchGet.dto;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * The fairings schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
public class FairingsDTO {

    /**
     * The reused schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("reused")
    @Expose
    private Boolean reused = false;
    /**
     * The recovery_attempt schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("recovery_attempt")
    @Expose
    private Boolean recoveryAttempt = false;
    /**
     * The recovered schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("recovered")
    @Expose
    private Object recovered = null;
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
     * The reused schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Boolean getReused() {
        return reused;
    }

    /**
     * The reused schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    /**
     * The recovery_attempt schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Boolean getRecoveryAttempt() {
        return recoveryAttempt;
    }

    /**
     * The recovery_attempt schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setRecoveryAttempt(Boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
    }

    /**
     * The recovered schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public Object getRecovered() {
        return recovered;
    }

    /**
     * The recovered schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setRecovered(Object recovered) {
        this.recovered = recovered;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(reused).append(recoveryAttempt).append(recovered).append(ships).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FairingsDTO) == false) {
            return false;
        }
        FairingsDTO rhs = ((FairingsDTO) other);
        return new EqualsBuilder().append(reused, rhs.reused).append(recoveryAttempt, rhs.recoveryAttempt).append(recovered, rhs.recovered).append(ships, rhs.ships).isEquals();
    }

}
