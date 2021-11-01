package org.openfootie.soccerapi.web.response;

public class VersionResponse {

    private String version;

    public VersionResponse(String response) {
        this.version = response;
    }

    public String getVersion() {
        return version;
    }

    public void setResponse(String response) {
        this.version = response;
    }
}
