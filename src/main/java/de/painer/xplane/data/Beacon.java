package de.painer.xplane.data;

/**
 * BEACON message.
 */
public class Beacon {
    private final int beaconMajorVersion;
    private final int beaconMinorVersion;
    private final int applicationHostId;
    private final int versionNumber;
    private final long role;
    private final int port;
    private final String host;

    public Beacon(int beaconMajorVersion, int beaconMinorVersion, int applicationHostId, int versionNumber, long role, int port, String host) {
        super();
        this.beaconMajorVersion = beaconMajorVersion;
        this.beaconMinorVersion = beaconMinorVersion;
        this.applicationHostId = applicationHostId;
        this.versionNumber = versionNumber;
        this.role = role;
        this.port = port;
        this.host = host;
    }

    public int beaconMajorVersion() {
        return beaconMajorVersion;
    }

    public int beaconMinorVersion() {
        return beaconMinorVersion;
    }

    public int applicationHostId() {
        return applicationHostId;
    }

    public int versionNumber() {
        return versionNumber;
    }

    public long role() {
        return role;
    }

    public int port() {
        return port;
    }

    public String host() {
        return host;
    }

}
