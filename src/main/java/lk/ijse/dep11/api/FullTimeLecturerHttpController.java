package lk.ijse.dep11.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;

public class FullTimeLecturerHttpController {
    @PatchMapping("/ranks")
    public void arrangeFullTimeLecturersOrder(){

    }

    @GetMapping()
    public void getAllFullTimeLectures(){

    }
}
