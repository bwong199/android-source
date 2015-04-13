package com.bloc.securitypackages.apples;

import com.bloc.securitypackages.*;
import com.bloc.securitypackages.fruits.*;
import com.bloc.securitypackages.colors.*;
import com.bloc.securitypackages.apples.*;
import com.bloc.securitypackages.citrus.*;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

class Macintosh extends Apple {

	Macintosh() {
		super(Macintosh.class.getSimpleName(), 200, new Red(), 0.14d);
	}

	void bite() {
		setWeight(getWeight() - 0.01d);
	}

}