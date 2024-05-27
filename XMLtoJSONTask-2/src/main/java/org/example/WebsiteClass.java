package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebsiteClass {

    @JsonProperty
    private String URL;

    @JsonProperty
    private String Description;

    @JsonProperty
    private String Tile;

    @JsonProperty
    private String CreatedDate;

    public String getUrl() {
        return URL;
    }

    public void setUrl(String url) {
        this.URL = url;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getTile() {
        return Tile;
    }

    public void setTile(String Tile) {
        this.Tile = Tile;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        this.CreatedDate = createdDate;
    }
}
