package io.github.kvr_10.AIEmail_writer.app;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/")
    public String home(){
        return "The Application is running";
    }
    @GetMapping("/generate")
    public String generate(){
        return "Application's backend is running,run the frontend!";
    }
}

