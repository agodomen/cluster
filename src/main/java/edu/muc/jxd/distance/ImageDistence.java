package edu.muc.jxd.distance;

import java.util.Arrays;

import org.apache.log4j.Logger;

import edu.muc.jxd.item.ImageItemVector;
import edu.muc.jxd.item.Item;

public class ImageDistence implements DistenceInter {

	private Logger logger=Logger.getLogger(ImageDistence.class.getName());
	@Override
	public <T extends Number> int getDistence(ImageItemVector<T> a, ImageItemVector<T> b) {
		logger.debug(Arrays.toString(a.getData()));	
	    logger.error(Arrays.toString((Integer[])a.getData()));
		T [] dataA = (T[]) a.getData();
		T [] dataB = (T[]) b.getData();
		int distance = 0;
		for (int i = 0; i < dataB.length; i++) {
			int ta = dataA[i].intValue();
			int tb =dataB[i].intValue();
			distance = distance + ( ta - tb);
		}
		return distance;
	}
}
