
	public class HotelReservation {
		
		private Hotel[] hotel;
		
		public String getCheapestHotel (String input) {
			
			hotel = new Hotel[3];
			
			Hotel lakewood = new Hotel();
			lakewood.setClassification(3);
			lakewood.setNormalPrice(110);
			lakewood.setNormalPriceWeekend(90);
			lakewood.setRewardPrice(80);
			lakewood.setRewardPriceWeekend(80);		
			hotel[0] = lakewood;
			
			
			Hotel bridgewood = new Hotel();
			bridgewood.setClassification(4);
			bridgewood.setNormalPrice(160);
			bridgewood.setNormalPriceWeekend(60);
			bridgewood.setRewardPrice(110);
			bridgewood.setRewardPriceWeekend(50);		
			hotel[1] = bridgewood;
			
			Hotel ridgewood = new Hotel();
			ridgewood.setClassification(5);
			ridgewood.setNormalPrice(220);
			ridgewood.setNormalPriceWeekend(150);
			ridgewood.setRewardPrice(100);
			ridgewood.setRewardPriceWeekend(40);		
			hotel[2] = ridgewood;
			
			String[] treatedResearch = input.split(":");
			String [] date =  treatedResearch[1].split(",");
			
			Double somalake = 0.0;
			Double somabridge = 0.0;
			Double somaridge = 0.0;
			
			for(String simpleDate : date) {
				somalake += lakewood.dayPrice(simpleDate.trim().substring(10, 13), treatedResearch[0].trim());
			}
			
			for(String simpleDate : date) {
				somabridge += bridgewood.dayPrice(simpleDate.trim().substring(10, 13), treatedResearch[0].trim());
			}
			
			for(String simpleDate : date) {
				somaridge += ridgewood.dayPrice(simpleDate.trim().substring(10, 13), treatedResearch[0].trim());
			}

			String cheapestHotel = "";
			
			if(somalake<somabridge && somalake<somaridge){cheapestHotel = "Lakewood";}
			    else if(somabridge<somalake && somabridge<somaridge){cheapestHotel = "Bridgewood";}
			    else if(somaridge<somabridge && somaridge<somalake){cheapestHotel = "Ridgewood";}
			    else if(somalake.equals(somabridge)) {cheapestHotel = "Ridgewood";}
				else if(somabridge.equals(somaridge)) {cheapestHotel = "Ridgewood";}
				else if(somaridge.equals(somalake)) {cheapestHotel = "Ridgewood";}
				else if(somalake.equals(somabridge)) {cheapestHotel = "Bridgewood";}

		        return cheapestHotel;
	    }
	}