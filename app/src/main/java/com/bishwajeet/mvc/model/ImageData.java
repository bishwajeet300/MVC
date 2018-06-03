package com.bishwajeet.mvc.model;

public class ImageData {

    private int imageId;
    private String name;
    private String description;
    private String setting;
    private String camera;
    private boolean isStarred;

    public ImageData() {
    }

    public ImageData(int imageId, String name, String description, String setting, String camera, boolean isStarred) {
        this.imageId = imageId;
        this.name = name;
        this.description = description;
        this.setting = setting;
        this.camera = camera;
        this.isStarred = isStarred;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public boolean isStarred() {
        return isStarred;
    }

    public void setStarred(boolean starred) {
        isStarred = starred;
    }
}
