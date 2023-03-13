package com.rad.vendingmachine.demo.models;

public enum Item {
    COKE(1, 100), PEPSI(2, 100), SODA(3, 120),SnickersBar(4 , 250),SunChips(5,216) , 
    Pretzels(6,310),ChexMix(7,400) , GranolaBars(8,250),PopTarts(9,350), ClifBars(10,200),
    Waterbottles(11,150),Xl(12,200),CocaCola(13,120),Sprite(14,100),Cool(15,270),
    BlueDay(16 , 280),Firoz(17,300),IceCoffe(18,200),VitamenWate(19,240),DietSoda(20,200),
    ProtienShake(21,500),IcedTea(22,100),Seltzer(23,250),Lemonade(24,280),Doritos(25,250),
    NotExist(0,0);
	
	private int NumberOfItem ;
	private int Price;
	
	private Item(int NumberOfItem , int Price) {
		this.NumberOfItem=NumberOfItem;
		this.Price=Price;		
	}

	public int getNumberOfItem() {
		return NumberOfItem;
	}

	public void setNumberOfItem(int NumberOfItem) {
		this.NumberOfItem = NumberOfItem;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
    public static Item valueOf(int numberSelection){
        for(Item item: Item.values()){
            if(numberSelection == item.getNumberOfItem()){
                return item;
            }
        }
        return NotExist;
    }
	


}

