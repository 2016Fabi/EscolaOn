package com.FI.EscolaOn.builders.entities;

import com.FI.EscolaOn.entity.Address;

public class AddressBuilder {
	  private Address entity;

	    private AddressBuilder(){
	        this.entity = new Address();
	    }

	    public static AddressBuilder builder(){
	        return new AddressBuilder();
	    }

	    public Address build(){
	        return this.entity;
	    }

	    public AddressBuilder province(String province){
	        this.entity.setProvince(province);
	        return this;
	    }

	    public AddressBuilder county(String county){
	        this.entity.setCounty(county);
	        return this;
	    }

	    public AddressBuilder neighborhood(String neighborhood){
	        this.entity.setNeighborhood(neighborhood);
	        return this;
	    }

	    public AddressBuilder street(String street){
	        this.entity.setStreet(street);
	        return this;
	    }
}
