package app.impl;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This service class is used to implement the functionalities of FlagPickerController.
 */

@Service
public class FlagPickerService {

    private static final Logger logger = LoggerFactory.getLogger(FlagPickerService.class);

    public String getCountriesForContinent(String continent) {

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("..\\continents.json"));
            JSONArray continentJson = (JSONArray) obj;

            if (continent.equalsIgnoreCase("Africa"))

                return continentJson.get(0).toString();
            if (continent.equalsIgnoreCase("America"))
                return continentJson.get(1).toString();

            if (continent.equalsIgnoreCase("Asia"))
                return continentJson.get(2).toString();

            if (continent.equalsIgnoreCase("Europe"))
                return continentJson.get(3).toString();
            if (continent.equalsIgnoreCase("Oceania"))
                return continentJson.get(4).toString();

        } catch (Exception e) {
            logger.error("Exception in calling getCountriesForContinent ", e.getMessage());
        }
        return "";
    }
}

