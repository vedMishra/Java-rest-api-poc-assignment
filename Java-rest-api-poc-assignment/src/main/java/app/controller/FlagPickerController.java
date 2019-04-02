package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import app.impl.FlagPickerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is used to get the countries json based on continents provided.
 */

@RestController
public class FlagPickerController {

    private static final Logger logger = LoggerFactory.getLogger(FlagPickerController.class);

    @Autowired
    FlagPickerService flagPickerService;

    @RequestMapping(value = "/getCountries/{continent}", method = RequestMethod.GET)
    public String getCountries(@PathVariable String continent) {
        try {
            return flagPickerService.getCountriesForContinent(continent);
        } catch (Exception e) {

            logger.error("Exception in calling getCountries ", e.getMessage());
        }
        return "";
    }

}
