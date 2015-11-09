import java.text.NumberFormat;

public class Item 
{
		public String m_name = null;
		public int m_quantity = 0;
		public double m_price = 0.00;
		
		public String getM_name() {
			return m_name;
		}

		public void setM_name(String m_name) {
			this.m_name = m_name;
		}

		public int getM_quantity() {
			return m_quantity;
		}

		public void setM_quantity(int m_quantity) {
			this.m_quantity = m_quantity;
		}

		public double getM_price() {
			return m_price;
		}

		public void setM_price(double m_price) {
			this.m_price = m_price;
		}
		Item(String name, double price){
			m_name = name; 
			m_price = price;
		}
		Item(String name, int quantity, double price)
		{
			m_name = name;
			m_quantity = quantity;
			m_price = price;
		}
	}
