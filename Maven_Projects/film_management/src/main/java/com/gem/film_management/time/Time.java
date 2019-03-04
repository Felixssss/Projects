package com.gem.film_management.time;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;
@Service
public class Time {
	
	public String getTime(){
		Date time = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ti=sdf.format(time);
		return ti;
	}
	}