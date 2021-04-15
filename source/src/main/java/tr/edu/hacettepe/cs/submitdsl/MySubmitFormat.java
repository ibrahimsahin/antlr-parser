package tr.edu.hacettepe.cs.submitdsl;

public class MySubmitFormat {
	public int numero;
	public String element_name;
	public String[] element_order = new String[2];
	public int item;
	
	
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getElement_name() {
		return element_name;
	}
	public void setElement_name(String elementName) {
		element_name = elementName;
	}
	public String[] getElement_order() {
		return element_order;
	}
	public void setElement_order(String[] elementOrder) {
		element_order = elementOrder;
	}
	
	
}
