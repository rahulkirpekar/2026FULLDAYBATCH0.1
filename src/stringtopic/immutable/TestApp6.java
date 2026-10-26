package stringtopic.immutable;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		String value = "Royal Technosoft Private Limited";

		System.out.println(value);

		value = value.replace(" ", "-");
		
		System.out.println(value);
//		System.out.println(value.toLowerCase());
//		System.out.println(value.toUpperCase());
		
//		System.out.println(value.isEmpty());
//		System.out.println(value.isBlank());
		
//		String value=  "Royal Technosoft Private Technosoft limited";
//		int index = value.lastIndexOf("Technosoft");
//		int index = value.indexOf("Technosoft");
//		System.out.println("index : " + index);
//		System.out.println("value.startsWith(\"Royal\") : " + value.startsWith("Royal"));
//		System.out.println("value.endsWith(\"limited\") : " + value.endsWith("limited"));
//		System.out.println("value.contains(\"infosoft\") : " + value.contains("infosoft"));  
	}
}
