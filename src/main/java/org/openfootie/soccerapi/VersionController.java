package org.openfootie.soccerapi;

import org.openfootie.soccerapi.web.response.VersionResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Value("${version}")
    private String version;

    @GetMapping("/version")
    public VersionResponse getVersion() {
        return new VersionResponse(version);
    }
}
