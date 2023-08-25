package app.hackChallenge.HealthConnectIBM;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/findDoctors")
public class DoctorController {
    @Autowired
    private DoctorService docService;
    @GetMapping
    public ResponseEntity<List<Doctor>> getAllDoctors() {
        return new ResponseEntity<List<Doctor>>(docService.findAllDoctors(),HttpStatus.OK);
    }
    @GetMapping("/location/{loc}")
    public ResponseEntity<Optional<List<Doctor>>> getDocByLocation(@PathVariable String loc) {
        return new ResponseEntity<Optional<List<Doctor>>>(docService.getDoctorsByLocation(loc),HttpStatus.OK);
    }
}
