package com.prudhvi.equalshashcodedemo;

import java.lang.annotation.Target;

class Address {
  int houseno;
  String shreet;
  String location;
  long pincode;
  String area;
  String directionl;
  
  
public Address(int houseno, String shreet, String area, String directionl) {
	super();
	this.houseno = houseno;
	this.shreet = shreet;
	this.area = area;
	this.directionl = directionl;
	}

public String toString() {
	return "Address [houseno=" + houseno + ", shreet=" + shreet + ", location=" + location + ", pincode=" + pincode
			+ ", area=" + area + ", directionl=" + directionl + "]";
}
@Override
	public boolean equals(Object args) {
		if(!(args instanceof Address)) return false;
		Address add=(Address)args;
		return this.houseno=add.houseno &&
				this.area.equals(add.area) &&
				this.location.equals(add.location) &&
				this.pincode==add.pincode &&
				this.shreet.equals(add.shreet);
	}
3
	}
class employee{
	
}
  
	

