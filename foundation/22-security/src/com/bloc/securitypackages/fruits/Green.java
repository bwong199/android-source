package com.bloc.securitypackages.fruits;

import com.bloc.securitypackages.*;
import com.bloc.securitypackages.fruits.*;
import com.bloc.securitypackages.colors.*;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public class Green extends Apple {

	public Green() {
		super(Green.class.getSimpleName(), 230, new LimeGreen(), 0.21d);
	}

	void bite() {
		setWeight(getWeight() - 0.02d);
	}

}