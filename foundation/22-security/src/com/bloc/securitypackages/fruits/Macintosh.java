package com.bloc.securitypackages.fruits;

import com.bloc.securitypackages.*;
import com.bloc.securitypackages.fruits.*;
import com.bloc.securitypackages.colors.*;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public class Macintosh extends Apple {

	public Macintosh() {
		super(Macintosh.class.getSimpleName(), 200, new Red(), 0.14d);
	}

	public void bite() {
		setWeight(getWeight() - 0.01d);
	}

}