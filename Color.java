/*
 *	Color class
 *  Author: Shobhin Basu
 *  Email: sbasu25@wisc.edu
 *  CS Account: shobhin
 *  Description: This class provides methods to manipulate colors.
 */
public class Color{
	private String color;

	//Constructor
	public Color(String iniColor){
		if(isColorValid(iniColor)){
			this.color = iniColor;
		}
		else{
			System.out.println("Failed to initalize the color");
		}
	}

	//Getter
	public String getColor(){
		return this.color;
	}

	/* The method for changing the color
	 * TODO: Revise the code so that it return true only if the input color is valid
	 * 	and different from the exisitng color before making the change
	 */
	public boolean  changeColor(String newColor){
		this.color = newColor;
			
		return isColorValid(newColor);
	}

	public boolean isColorValid(String inputColor){
		String [] validColor = {"red","orange","yellow","green", "cyan", "blue","purple"};
		for(int i=0; i<validColor.length; i++){
			if(inputColor.equals(validColor[i])){
				return true;
			}
		}
		
		//Failed to find a match, the color is invalid
		return false;
	}
}
