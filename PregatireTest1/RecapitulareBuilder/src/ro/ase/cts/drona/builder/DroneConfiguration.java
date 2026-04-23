package ro.ase.cts.drona.builder;

public class DroneConfiguration {
    private String model;
    private double capacitateBaterie;
    private TipCamera tipCamera;
    private boolean isAutoPilotEnabled;
    private boolean isNighVisionEnabled;
    private int maxAltitude;
    private float maxSpeed;

    private DroneConfiguration(DroneBuilder builder) {
        this.model = builder.model;
        this.capacitateBaterie = builder.capacitateBaterie;
        this.tipCamera = builder.tipCamera;
        this.isAutoPilotEnabled = builder.isAutoPilotEnabled;
        this.isNighVisionEnabled = builder.isNighVisionEnabled;
        this.maxAltitude = builder.maxAltitude;
        this.maxSpeed = builder.maxSpeed;
    }


    public void displayConfiguration() {
        final StringBuilder sb = new StringBuilder("DroneConfiguration {");
        sb.append("model='").append(model).append('\'');
        sb.append(", capacitateBaterie=").append(capacitateBaterie);
        sb.append(", tipCamera=").append(tipCamera);
        sb.append(", isAutoPilotEnabled=").append(isAutoPilotEnabled);
        sb.append(", isNighVisionEnabled=").append(isNighVisionEnabled);
        sb.append(", maxAltitude=").append(maxAltitude);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append('}');
        System.out.println(sb.toString());
    }

    public static DroneBuilder builder(String model, double capacitateBaterie, TipCamera tipCamera) {
        return new DroneBuilder(model,capacitateBaterie,tipCamera);
    }

    public static class DroneBuilder implements AbstractDroneBuilder,AbstractDroneCreation {
        private String model;
        private double capacitateBaterie;
        private TipCamera tipCamera;
        private boolean isAutoPilotEnabled;
        private boolean isNighVisionEnabled;
        private int maxAltitude;
        private float maxSpeed;
        private int extraOptionsCount;

        public DroneBuilder(String model,double capacitateBaterie, TipCamera tipCamera) {
            this.model = model;
            this.capacitateBaterie = capacitateBaterie;
            this.tipCamera = tipCamera;
            this.isAutoPilotEnabled = false;
            this.isNighVisionEnabled = false;
            this.maxAltitude = 1000;
            this.maxSpeed = 100;
        }

        @Override
        public AbstractDroneBuilder enableAutoPilot(boolean value) {
            this.isAutoPilotEnabled = value;
            return this;
        }

        @Override
        public AbstractDroneBuilder enableNightVision(boolean value) {
            this.isNighVisionEnabled = value;
            return this;
        }

        @Override
        public AbstractDroneBuilder setMaxAltitude(int maxAltitude) {
            this.maxAltitude = maxAltitude;
            return this;
        }

        @Override
        public AbstractDroneBuilder setMaxSpeed(float maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        @Override
        public DroneConfiguration build() {
            int extraOptionsCount = 0;
            if(this.isAutoPilotEnabled) extraOptionsCount++;
            if(this.isNighVisionEnabled) extraOptionsCount++;
            if(this.maxAltitude != 1000) extraOptionsCount++;
            if(this.maxSpeed != 100) extraOptionsCount++;

            if (extraOptionsCount > 2) {
                throw new RuntimeException("Drona nu poate avea mai mult de 2 optiuni extra!");
            }
            return new DroneConfiguration(this);
        }
    }
}
