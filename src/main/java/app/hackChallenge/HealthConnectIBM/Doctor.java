package app.hackChallenge.HealthConnectIBM;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "doctors")
public class Doctor {

    @Id
    private String doctorId;  // Using doctorId as the primary key

    private String name;
    private String qualification;
    private String hospitalName;
    private String location;
    private Map<String, List<String>> branches;
    private List<String> timeSlots;
    private String rating;

    // No need for explicit constructors, getters, setters
}


