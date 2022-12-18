package ma.weboven.skyup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.weboven.skyup.model.WhoAmIResponseModel;

@RestController
@RequestMapping("/api")
public class WhoAmIController {
    public static final String URL_MAPPING = "/whoami";

    private final String appName;
    private final String appVersion;
    
    /*
     * Constructor of the class {@link WhoAmIController}
     * 
     */
    @Autowired
    private WhoAmIController(
            @Value("${skyup.app.name}") final String appName,
            @Value("${skyup.app.version}") final String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }
    /*
     * Print App name and app version as JSON
     * 
     * @return {@link WhoAmIResponseModel}
     */

    @GetMapping(value = { URL_MAPPING, "/about" })
    public WhoAmIResponseModel whoAmI() {
        return new WhoAmIResponseModel(appName, appVersion);
    }

}
