public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override 
	public void takeOff() {
		if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s take off in the sky.%n", this.getName());
		
	}   
    
}

    @Override
	public int ascend(int meters) {
		if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
	}
		return this.altitude;
}

    @Override
	public void glide() {
		System.out.printf("It glides into the air. %n");
		
	}


    @Override
	public void descend(int meters) {
		this.altitude = Math.max(this.altitude - meters, 0);{
        System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
		
	}

    
	}
	
    public void land() {
        if (this.flying && this.altitude == 0) {
            System.out.printf("%s is too high", this.getName());
        } else {
            System.out.printf("%s land on the ground .%n", this.getName());
        }
	
	
}
}

