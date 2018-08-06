package com.training.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private List<Service> services;

	public Cache() {
		services = new ArrayList<Service>();
	}

	public Service getService(String serviceName) {
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("returning cached sevice" + serviceName + "object");
				return service;
			}

		}
		return null;

	}

	public void add(Service newservice) {
		// TODO Auto-generated method stub
		boolean exists = false;
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(newservice.getName())) {
				exists = true;
			}

		}
		if (!exists) {
			services.add(newservice);
		}
	}
}
