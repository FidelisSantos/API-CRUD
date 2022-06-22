package crud.rest.api.util;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DataUtil {
    public String Now()
    {
        return DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm").format(LocalDateTime.now());
    }
}
