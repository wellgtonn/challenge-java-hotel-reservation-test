

public class Hotel {
	
	private int classification;
	private double normalPrice;
	private double normalPriceWeekend;
	private double rewardPrice;
	private double rewardPriceWeekend;
	
	
	
	public int getClassification() {
		return classification;
	}



	public void setClassification(int classification) {
		this.classification = classification;
	}



	public double getNormalPrice() {
		return normalPrice;
	}



	public void setNormalPrice(double normalPrice) {
		this.normalPrice = normalPrice;
	}



	public double getNormalPriceWeekend() {
		return normalPriceWeekend;
	}



	public void setNormalPriceWeekend(double normalPriceWeekend) {
		this.normalPriceWeekend = normalPriceWeekend;
	}



	public double getRewardPrice() {
		return rewardPrice;
	}



	public void setRewardPrice(double rewardPrice) {
		this.rewardPrice = rewardPrice;
	}



	public double getRewardPriceWeekend() {
		return rewardPriceWeekend;
	}



	public void setRewardPriceWeekend(double rewardPriceWeekend) {
		this.rewardPriceWeekend = rewardPriceWeekend;
	}



	public double dayPrice(String day, String guestType) {
		
		if(guestType.equals("Regular")) {
			if(day.equals("mon") || day.equals("tues") || day.equals("wed") || day.equals("thu") || day.equals("fri") )
				return normalPrice;
			else if(day.equals("sat") || day.equals("sun"))
				return normalPriceWeekend;
		} else if(guestType.equals("Reward")) {
			if(day.equals("mon") || day.equals("tues") || day.equals("wed") || day.equals("thu") || day.equals("fri") )
				return rewardPrice;
			else if(day.equals("sat") || day.equals("sun"))
				return rewardPriceWeekend;			
		}
		
		return 0;
	}
}
