package com.example.springboottutorial;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Martin",
                        List.of("react", "nextjs", "tailwind")
                ),
                new SoftwareEngineer(
                        1,
                        "Ivan",
                        List.of("spring", "java")
                )
        );
    }
}
