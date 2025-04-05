package io.github.kvr_10.AIEmail_writer.app;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
