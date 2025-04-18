package de.painer.xplane.data;

/**
 * RPOS message with current position.
 */
public class Position {
    private final double longitude;
    private final double latitude;
    private final double elevationMSL;
    private final float elevationAGL;
    private final float pitch;
    private final float heading;
    private final float roll;
    private final float speedX;
    private final float speedY;
    private final float speedZ;
    private final float rollRate;
    private final float pitchRate;
    private final float yawRate;

    public Position(double longitude, double latitude, double elevationMSL, float elevationAGL, float pitch, float heading, float roll, float speedX, float speedY, float speedZ, float rollRate, float pitchRate, float yawRate) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.elevationMSL = elevationMSL;
        this.elevationAGL = elevationAGL;
        this.pitch = pitch;
        this.heading = heading;
        this.roll = roll;
        this.speedX = speedX;
        this.speedY = speedY;
        this.speedZ = speedZ;
        this.rollRate = rollRate;
        this.pitchRate = pitchRate;
        this.yawRate = yawRate;
    }

    public double longitude() {
        return longitude;
    }

    public double latitude() {
        return latitude;
    }

    public double elevationMSL() {
        return elevationMSL;
    }

    public float elevationAGL() {
        return elevationAGL;
    }

    public float pitch() {
        return pitch;
    }

    public float heading() {
        return heading;
    }

    public float roll() {
        return roll;
    }

    public float speedX() {
        return speedX;
    }

    public float speedY() {
        return speedY;
    }

    public float speedZ() {
        return speedZ;
    }

    public float rollRate() {
        return rollRate;
    }

    public float pitchRate() {
        return pitchRate;
    }

    public float yawRate() {
        return yawRate;
    }

}