package org.tanouti.desingpatterns.builder;

class Mobile {

    private Boolean touchScreenAvailable;
    private Boolean enabled5G;
    private Integer ram;
    private Integer cameraPixel;
    private String brandName;
    private String deviceName;

    public Mobile(MobileBuilder mobileBuilder) {
        this.brandName = mobileBuilder.brandName;
        this.deviceName = mobileBuilder.deviceName;
        this.touchScreenAvailable =mobileBuilder.touchScreenAvailable;
        this.enabled5G = mobileBuilder.enabled5G;
        this.ram= mobileBuilder.ram;
        this.cameraPixel= mobileBuilder.cameraPixel;
    }


    Boolean isTouchScreenAvailable() {
        return touchScreenAvailable;
    }

    Boolean isEnabled5G() {
        return enabled5G;
    }

    Integer getRam() {
        return ram;
    }

    Integer getCameraPixel() {
        return cameraPixel;
    }

    String getBrandName() {
        return brandName;
    }

    String getDeviceName() {
        return deviceName;
    }

    void printDetails() {
        System.out.println( "Mobile "+ this.deviceName + " of brand "+ this.brandName + " with following features : touch screen enabled "+String.valueOf(this.touchScreenAvailable)+ ", 5G enabled "+String.valueOf(this.enabled5G)+", ram "    +String.valueOf(this.ram)+", camera pixel "+ this.cameraPixel+".");
    }



    public static class MobileBuilder {
        private Boolean touchScreenAvailable;
        private Boolean enabled5G;
        private Integer ram;
        private Integer cameraPixel;
        private String brandName;
        private String deviceName;

        public MobileBuilder(String brandName, String deviceName) {
            this.brandName = brandName;
            this.deviceName = deviceName;
        }

        MobileBuilder setTouchScreenAvailable(Boolean touchScreenAvailable) {
            this.touchScreenAvailable = touchScreenAvailable;
            return this;
        }

        MobileBuilder setEnabled5G(Boolean enabled5G) {
            this.enabled5G = enabled5G;
            return this;
        }

        MobileBuilder setRam(Integer ram) {
            this.ram = ram;
            return this;
        }

        MobileBuilder setCameraPixel(Integer cameraPixel) {
            this.cameraPixel = cameraPixel;
            return this;
        }

        Mobile build() {
            Mobile mobile = new Mobile(this);
            return mobile;
        }
    }
}