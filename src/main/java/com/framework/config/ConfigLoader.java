package com.framework.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public abstract class ConfigLoader {

    private static ObjectMapper mapper;
    public static Config CONFIG;

    public static boolean configLoaderMethod() {
        mapper = new ObjectMapper(new YAMLFactory());
        try {
            CONFIG = mapper.readValue(new File("./src/config.yml"), Config.class);
            System.out.println(CONFIG.toString());
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
