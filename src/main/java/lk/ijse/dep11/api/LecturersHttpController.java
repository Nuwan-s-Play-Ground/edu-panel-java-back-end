package lk.ijse.dep11.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers/full-time")
@CrossOrigin
public class LecturersHttpController {
    @PostMapping
    public void createNewLecturer(){

    }

    @PatchMapping
    public void updateLecturerDetails(){

    }

    @DeleteMapping
    public void deleteLecturer(){

    }

    @GetMapping
    public  void getAllLecturers(){

    }
}
