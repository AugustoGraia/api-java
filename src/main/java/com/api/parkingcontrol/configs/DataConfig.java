package com.api.parkingcontrol.configs;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.format.DateTimeFormatter;

public class DataConfig {

    public static final String DATETIME_FORMAT = "yyy-MM-dd'T'HH:mm:ss'Z'";
    public static LocalDateSerializer LOCAL_DATETIME_SERIALIZER = new LocalDateSerializer(DateTimeFormatter.ofPattern(DATETIME_FORMAT));
    
}
