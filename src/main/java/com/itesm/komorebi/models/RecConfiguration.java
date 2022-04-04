package com.itesm.komorebi.models;

public class RecConfiguration {
    private boolean encryption;
    private int minDuration;
    private int maxDuration;
    private int resolution;
    private boolean allowSharing;

    public boolean isEncryption() {
        return encryption;
    }

    public void setEncryption(boolean encryption) {
        this.encryption = encryption;
    }

    public int getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(int minDuration) {
        this.minDuration = minDuration;
    }

    public int getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(int maxDuration) {
        this.maxDuration = maxDuration;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isAllowSharing() {
        return allowSharing;
    }

    public void setAllowSharing(boolean allowSharing) {
        this.allowSharing = allowSharing;
    }
}
