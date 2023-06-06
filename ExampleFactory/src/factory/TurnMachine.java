package factory;

public class TurnMachine extends Equipments {
	
	private String potency;

	public TurnMachine(int idEquipment) {
		super(idEquipment);

	}
	
	public String getPotency() {
		return potency;
	}
	
	public void setPotency(String potency) {
		this.potency = potency;
	}
	
	public String getFullDescription() {
		return super.getFullDescription() + " - " + getPotency();
 	}

}
