package com.llavore.model;

import java.util.UUID;

public abstract class BaseClassModel {

	protected UUID uuid;

	protected BaseClassModel() {
		this.uuid = UUID.randomUUID();
	}

	public UUID getUuid() {
		return uuid;
	}

}
