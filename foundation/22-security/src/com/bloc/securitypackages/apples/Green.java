package com.bloc.securitypackages.apples;

import com.bloc.securitypackages.*;
import com.bloc.securitypackages.fruits.*;
import com.bloc.securitypackages.colors.*;
import com.bloc.securitypackages.apples.*;
import com.bloc.securitypackages.citrus.*;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

class Green extends Apple {

	Green() {
		super(Green.class.getSimpleName(), 230, new LimeGreen(), 0.21d);
	}

	void bite() {
		setWeight(getWeight() - 0.02d);
	}

}