package com.emc.ecs.managementClient.model;

public class QuotaDetails {
	private long blockSize;
	private long notificationSize;

	public QuotaDetails() {
		super();
	}

	public long getBlockSize() {
		return blockSize;
	}

	public void setBlockSize(long blockSize) {
		this.blockSize = blockSize;
	}

	public long getNotificationSize() {
		return notificationSize;
	}

	public void setNotificationSize(long notificationSize) {
		this.notificationSize = notificationSize;
	}
}