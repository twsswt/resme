package responsibilityMetaModel.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import responsibilityMetaModel.Entity;
import responsibilityMetaModel.Responsibility;

public class CriticalityHelper {
	
	public EList<Entity> traversed;
	public EList<Responsibility> resps;
	
	CriticalityHelper(){
		traversed = new BasicEList<Entity>();
		resps = new BasicEList<Responsibility>();
	}

	public CriticalityHelper(EList<Entity> traversed, EList<Responsibility> resps) {
		this.traversed = traversed;
		this.resps = resps;
	}
	

}
