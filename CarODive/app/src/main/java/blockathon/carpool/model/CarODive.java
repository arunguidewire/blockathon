
package blockathon.carpool.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$class",
    "employeeCompanyID",
    "employeeName",
    "employeeCompany",
    "employeeEmail",
    "employeeITPark",
    "transactionId",
    "timestamp"
})
public class CarODive {

    @JsonProperty("$class")
    private String $class;
    @JsonProperty("employeeCompanyID")
    private String employeeCompanyID;
    @JsonProperty("employeeName")
    private String employeeName;
    @JsonProperty("employeeCompany")
    private String employeeCompany;
    @JsonProperty("employeeEmail")
    private String employeeEmail;
    @JsonProperty("employeeITPark")
    private String employeeITPark;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("$class")
    public String get$class() {
        return $class;
    }

    @JsonProperty("$class")
    public void set$class(String $class) {
        this.$class = $class;
    }

    @JsonProperty("employeeCompanyID")
    public String getEmployeeCompanyID() {
        return employeeCompanyID;
    }

    @JsonProperty("employeeCompanyID")
    public void setEmployeeCompanyID(String employeeCompanyID) {
        this.employeeCompanyID = employeeCompanyID;
    }

    @JsonProperty("employeeName")
    public String getEmployeeName() {
        return employeeName;
    }

    @JsonProperty("employeeName")
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @JsonProperty("employeeCompany")
    public String getEmployeeCompany() {
        return employeeCompany;
    }

    @JsonProperty("employeeCompany")
    public void setEmployeeCompany(String employeeCompany) {
        this.employeeCompany = employeeCompany;
    }

    @JsonProperty("employeeEmail")
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    @JsonProperty("employeeEmail")
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    @JsonProperty("employeeITPark")
    public String getEmployeeITPark() {
        return employeeITPark;
    }

    @JsonProperty("employeeITPark")
    public void setEmployeeITPark(String employeeITPark) {
        this.employeeITPark = employeeITPark;
    }

    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
