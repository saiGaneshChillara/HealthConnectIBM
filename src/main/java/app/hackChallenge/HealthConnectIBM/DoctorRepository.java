package app.hackChallenge.HealthConnectIBM;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DoctorRepository extends MongoRepository<Doctor,String> {
    Optional<List<Doctor>> findByLocationIgnoreCase(String location);
        
}
