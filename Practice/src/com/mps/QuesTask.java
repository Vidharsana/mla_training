package com.mps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Orders{
	private int id;
	private String name;
	private String pName;
	private int price;
	private String month;
	private int year;
	private String city;
	private String Category;
	private int quantity;
	public Orders() {
		
	}
	public Orders(int id, String name, String pName, int price, String month, int year, String city, String category, int quantity) {
		
		this.id = id;
		this.name = name;
		this.pName = pName;
		this.price = price;
		this.month = month;
		this.year = year;
		this.city = city;
		Category = category;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPName() {
		return pName;
	}
	public void setPName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", pName=" + pName + ", price=" + price + ", month=" + month
				+ ", year=" + year + ", city=" + city + ", Category=" + Category + ", quantity=" + quantity + "]";
	}
	
	
}
public class QuesTask {

	//1 to find the highest Quantity order
	public static void getHighestQuantity(List<Orders> orderList) {
		Optional<Orders> highestOrder = orderList.stream().max(Comparator.comparing(Orders :: getQuantity));
		Orders hghOrd = highestOrder.get();
		System.out.println("The Highest Order Quantity : ");
		System.out.println("====================");
		System.out.println("ID : "+hghOrd.getId());
		System.out.println("Name : "+hghOrd.getName());
		System.out.println("PName : "+hghOrd.getPName());
		System.out.println("Price : "+hghOrd.getPrice());
		System.out.println("Quantity : "+hghOrd.getQuantity());
	}
	
	//2 to find out category wise orders
	public static void getCategorywiseOrder(List<Orders> orderList) {
		Map<String, List<Orders>> ctgOrd = orderList.stream().collect(Collectors.groupingBy(Orders :: getCategory));
		for(String k : ctgOrd.keySet()) {
			System.out.println("Category :: "+k);
			List<Orders> ctg = ctgOrd.get(k);
			for(Orders ct : ctg) {
				System.out.println(ct);
			}
		}
	}
	
	//3 to print max price
	public static void getMaxPrice(List<Orders> orderList) {
		Optional<Orders> maxPrice = orderList.stream().max(Comparator.comparing(Orders :: getPrice));
		Orders maxPrc = maxPrice.get();
		System.out.println("The Maximum Price : ");
		System.out.println("====================");
		System.out.println("ID : "+maxPrc.getId());
		System.out.println("Name : "+maxPrc.getName());
		System.out.println("PName : "+maxPrc.getPName());
		System.out.println("Price : "+maxPrc.getPrice());
	}
	
	//4 Average monthly spending in e-com
	public static void getAveragePrice(List<Orders> orderList) {
		Map<String,Double> avgData = orderList.stream().collect(Collectors.groupingBy(Orders :: getCategory,Collectors.averagingDouble(Orders :: getPrice)));
		System.out.println(avgData);
	}
	//5 find min order price in the total orders
	public static void getMinOrderPrice(List<Orders> orderList) {
		Optional<Orders> minPrice = orderList.stream().min(Comparator.comparing(Orders :: getPrice));
		Orders minPrc = minPrice.get();
		System.out.println("The Minimum Price : ");
		System.out.println("====================");
		System.out.println("ID : "+minPrc.getId());
		System.out.println("Name : "+minPrc.getName());
		System.out.println("PName : "+minPrc.getPName());
		System.out.println("Price : "+minPrc.getPrice());
	}
	
	//6 find out the first order of the customer
	public static void getFirstOrder(List<Orders> orderList) {
		Optional<Orders> firstOrders = orderList.stream().sorted(Comparator.comparing(Orders :: getName)).findFirst();
		Orders fstOrder = firstOrders.get();
		System.out.println("First Order : ");
		System.out.println("====================");
		System.out.println("ID : "+fstOrder.getId());
		System.out.println("Name : "+fstOrder.getName());
		System.out.println("PName : "+fstOrder.getPName());
	}
	public static void main(String args[]) {
		List<Orders> orderList = new ArrayList<>();
		orderList.add(new Orders(101,"Vidhu","Jeans",3000,"January",2004,"Kotagiri","Mens",30));
		orderList.add(new Orders(102,"Ashuu","Kurti",5000,"March",2009,"Hosur","Womens",50));
		orderList.add(new Orders(103,"Libi","Shirts",9000,"June",2012,"Coimbatore","Mens",80));
		orderList.add(new Orders(104,"Ashuu","Saree",7000,"August",2002,"Chennai","Womens",200));
		orderList.add(new Orders(105,"Vidhu","Frock",12000,"November",2020,"Banglore","Kids",300));
		orderList.add(new Orders(106,"Sri","Laptop",35000,"January",2024,"Chennai","Electronics",25));
		orderList.add(new Orders(106,"Thari","Mobiles",42000,"October",2026,"Pune","Electronics",30));
		orderList.add(new Orders(107,"Hemi","AC",50000,"April",2014,"Tiruchengode","Electronics",60));
		orderList.add(new Orders(108,"Vidhu","Bags",3000,"July",2021,"Kotagiri","Accessories",45));
		orderList.add(new Orders(109,"Ashuu","Shoes",300,"May",2015,"Coimbatore","Acessories",62));
		orderList.add(new Orders(200,"Lee","Tshirts",500,"September",2023,"Tirupur","Mens",70));
		QuesTask.getHighestQuantity(orderList);
		QuesTask.getCategorywiseOrder(orderList);
		QuesTask.getMaxPrice(orderList);
		QuesTask.getMinOrderPrice(orderList);
		QuesTask.getAveragePrice(orderList);
		QuesTask.getFirstOrder(orderList);
	}
}