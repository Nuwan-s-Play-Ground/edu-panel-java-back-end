package lk.ijse.dep11.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;

public class PartTimeLecturerHttpController {
    @PatchMapping("/ranks")
    public void arrangePartTimeLecturersOrder(){

    }

    @GetMapping()
    public void getAllPartTimeLectures(){

    }
}
