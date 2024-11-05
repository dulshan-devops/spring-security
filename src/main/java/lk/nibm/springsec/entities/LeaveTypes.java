package lk.nibm.springsec.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LeaveTypes {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;

    //Number of days typically allocated for this leave type per year (e.g., 10 days for Sick Leave)
    private Integer defaultAllocation;

    //Specifies whether unused days for this leave type can be carried over to the next year
    private Boolean carryForwardAllowed = false;
    private Boolean paidLeave = true;

    //The maximum number of consecutive days an employee can take for this type of leave (useful for types like Sick Leave)
    private Integer maxConsecutiveDays;

    private Boolean requiresApproval = true;
}
