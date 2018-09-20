package com.its.App;

import com.its.Storage.ITStorage;

public class ProductManipulation 
{
	
	public boolean addProduct(Product p1)
	{
		return ITStorage.listofProduct.add(p1);
	}
	
	public boolean removeProduct(Product p1)
	{
		return ITStorage.listofProduct.remove(p1);
	}
	
	public boolean updateProduct(Product p1)
	{
		return ITStorage.listofProduct.add(p1);
	}
	public Product searchProduct(String pid)
	{
		Product p=null;
		for(Product p1:ITStorage.listofProduct)
		{
			if(p1.getpId()==pid)
			{
				p=p1;
				break;
			}
		}
		return p;
	}
	
	public void displayAllProducts()
	{
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Pid"+"\t"+"Product Name"+"\t"+"Quanity"+"\t"+"Cost");
		for(Product p1:ITStorage.listofProduct)
		{
			System.out.println(p1.getpId()+"\t"+p1.getpName()+"\t"+p1.getpQuantity()+"\t"+p1.getpCost());
		}
		System.out.println("--------------------------------------------------------------------------");
	}

}
